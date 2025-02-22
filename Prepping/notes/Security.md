Let's address the security questions with a focus on OAuth 2.0 and JWT.

## Security Questions and Answers (OAuth 2.0 and JWT Focus)

Here's a breakdown of common security interview questions, focusing on OAuth 2.0 and JWT:

**1. How do you authenticate a user?**

When using OAuth 2.0 and JWT, user authentication typically involves these steps:

1.  **Authorization Request:** The client (e.g., a web application) redirects the user to the authorization server (e.g., Google, Auth0, or a custom OAuth 2.0 provider). This request includes parameters like the client ID, redirect URI, and desired scopes (permissions).
2.  **User Authentication (at Authorization Server):** The user authenticates at the authorization server (e.g., by entering their username and password).
3.  **Authorization Grant:** If authentication is successful, the authorization server issues an authorization grant (e.g., an authorization code).
4.  **Token Request:** The client exchanges the authorization grant for an access token (and optionally a refresh token) by making a request to the authorization server's token endpoint.
5.  **Access Token (JWT):** The authorization server issues an access token, which is often a JWT.
6.  **Protected Resource Access:** The client uses the access token to access protected resources on the resource server (the API).

**2. How does JWT authentication work? Can you explain?**

In the context of OAuth 2.0, JWTs are commonly used as access tokens. The process is as follows:

1.  **Authorization Server Issues JWT:** After the user authenticates at the authorization server and the client obtains an authorization grant, the authorization server creates a JWT.
2.  **JWT as Access Token:** The JWT is returned to the client as the access token.
3.  **Client Sends JWT:** The client includes the JWT in the `Authorization` header (as a Bearer token) when making requests to the resource server.
4.  **Resource Server Validates JWT:** The resource server validates the JWT's signature (using the authorization server's public key or a shared secret) and checks the claims (e.g., expiration time, audience).
5.  **Access Granted/Denied:** If the JWT is valid, the resource server grants access to the protected resource. Otherwise, it returns an error (e.g., 401 Unauthorized).

**3. What does a JWT contain?**

A JWT consists of three parts:

*   **Header:** Contains metadata about the token, such as the signing algorithm (`alg`) and token type (`typ`).
*   **Payload:** Contains claims, which are statements about an entity (typically, a user) and additional data. Standard claims include `iss` (issuer), `sub` (subject - usually the user ID), `aud` (audience), `exp` (expiration time), `iat` (issued at). Custom claims can also be added.
*   **Signature:** Ensures token integrity. It's created by signing the encoded header and payload using a secret key (symmetric signing) or a private key (asymmetric signing). In OAuth2, it's more common to use asymmetric signing.

**4. How do you use filters? Explain a JWT authentication filter.**

In a Spring Boot application acting as a resource server, a JWT authentication filter intercepts incoming requests to validate the JWT. Here's how it works:

1.  **Extract JWT:** The filter extracts the JWT from the `Authorization` header (e.g., `Authorization: Bearer <token>`).
2.  **Validate JWT:** The filter uses a JWT library (like `jjwt`) and the authorization server's public key (or a shared secret if symmetric signing is used) to verify the token's signature.
3.  **Extract Claims:** The filter extracts the claims from the payload.
4.  **Create Authentication Object:** If the token is valid, the filter creates an `Authentication` object (e.g., `JwtAuthenticationToken` in Spring Security) containing the user's details from the JWT claims.
5.  **Set Authentication in Security Context:** The filter sets the `Authentication` object in the `SecurityContextHolder`, making the user authenticated for the current request.
6.  **Handle Invalid Tokens:** If the token is invalid (e.g., invalid signature, expired), the filter returns an HTTP error response (e.g., 401 Unauthorized).

**5. What is the difference between hashing and encoding? Which one do you use to secure passwords?**

*   **Hashing:** A one-way function. It's computationally infeasible to reverse the process to get the original data. Used for password storage (e.g., bcrypt, Argon2, scrypt).
*   **Encoding:** A two-way function. Transforms data into a different format that can be reversed. Used for data transmission or storage (e.g., Base64).

**You use *hashing* to secure passwords.**

**6. How do you authenticate databases for a user?**

In an OAuth 2.0 flow, the application (as a client) obtains an access token on behalf of the user. This access token is then used to access resources on the resource server. The database itself is *not* directly authenticated on a per-user basis in this flow. The application uses its own database credentials (stored securely) to connect to the database. The authorization logic (whether a user has permission to access certain data) is handled at the application level based on the claims in the JWT.

In summary, OAuth 2.0 with JWT provides a robust and standardized way to handle authentication and authorization in modern web applications and APIs. It decouples authentication from the resource server, allowing for greater flexibility and scalability.



## Authentication and Authorization using JWT in Spring Boot

This document explains how to implement JWT-based authentication and authorization in a Spring Boot application.

### 1. What is JWT?

JWT (JSON Web Token) is a compact, URL-safe token used for securely transmitting information between a client and a server. It consists of three parts separated by dots:

* **Header:** Contains the token type (JWT) and signing algorithm.
* **Payload:** Contains user claims (e.g., username, roles, permissions).
* **Signature:** Ensures the token's integrity and authenticity using a secret key.

JWTs are self-contained and stateless, making them suitable for microservices architectures.

### 2. Why use JWT in Spring Boot?

* **Stateless Authentication:** JWTs eliminate the need for session management on the server, simplifying application scaling.
* **Compact and Secure:** JWTs are compact due to base64 encoding and cryptographically signed, ensuring data integrity.
* **Scalable:** JWTs work well in distributed systems and microservices architectures.

### 3. How JWT Works

The JWT workflow involves three main steps:

1. **User Login:**
    * The client sends username and password to the server.
    * The server validates credentials (e.g., against a database).
    * If valid, the server generates a JWT containing user claims.

2. **Token Usage:**
    * The server sends the JWT back to the client.
    * The client stores the JWT securely (e.g., local storage or cookies).
    * For subsequent requests, the client includes the JWT in the Authorization header.

3. **Server Verification:**
    * The server receives the JWT from the Authorization header.
    * The server verifies the token's signature and extracts user information from claims.
    * If valid, the request is processed; otherwise, it's rejected.

### 4. Implementing JWT in a Spring Boot Application

Here's a step-by-step guide to implementing JWT in your Spring Boot application:

**Step 1: Add Dependencies**

Add the following dependencies to your pom.xml:

```xml
<dependency>
  <groupId>io.jsonwebtoken</groupId>
  <artifactId>jjwt-api</artifactId>
  <version>0.11.5</version>
</dependency>
<dependency>
  <groupId>io.jsonwebtoken</groupId>
  <artifactId>jjwt-impl</artifactId>
  <version>0.11.5</version>
</dependency>
<dependency>
  <groupId>io.jsonwebtoken</groupId>
  <artifactId>jjwt-jackson</artifactId>
  <version>0.11.5</version>
</dependency>
```

```
@Component
public class JwtUtil {

  private String secret = "mysecretkey";
  private int jwtExpirationInMs = 3600000; // 1 hour

  public String generateToken(String username) {
    return Jwts.builder()
        .setSubject(username)
        .setIssuedAt(new Date())
        .setExpiration(new Date(System.currentTimeMillis() + jwtExpirationInMs))
        .signWith(SignatureAlgorithm.HS512, secret)
        .compact();
  }

  // ... other methods for parsing claims and validating tokens
}
```
