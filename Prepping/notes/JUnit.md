## JUnit

- Jupiter API
- Vintage API for backward compatability with junit4

### Methods & Imports
- assertEquals()
- import org.junit.Test;
- import org.junit.Assert;
- @Test in methods it can be public or default or protected
- assertArrayEquals()

### Test Driven Development
- Try creating a unit test case and after that develop the actual logic.

### Dependancy in pom file 
    <properties>
        <maven.compiler.source>8</maven.compiler.source>
        <maven.compiler.target>8</maven.compiler.target>
        	<maven.compiler.target>${maven.compiler.source}</maven.compiler.target>
	<junit.jupiter.version>5.10.0</junit.jupiter.version>
    </properties>
    <!-- <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies> -->
     <dependencies>
	<dependency>
		<groupId>org.junit.jupiter</groupId>
		<artifactId>junit-jupiter</artifactId>
		<version>${junit.jupiter.version}</version>
		<scope>test</scope>
	</dependency>
</dependencies>
<build>
	<plugins>
		<plugin>
			<artifactId>maven-compiler-plugin</artifactId>
			<version>3.8.1</version>
		</plugin>

	</plugins>
</build>

### assertNotEquals()
- This method is opposite of assertEquals
- Negative cases can be handled 
- assertNotEquals(10, new Calc().square(10),()-> "Not a Not a expected Output");

### assertTrue() && assertFalse()
- assertTrue : will check if the values sent is true if it is true test will be passed
- assertFalse: will check if the values sent is false if it is false test will be passed

### assertArrayEquals()
- Actual and expected array should be equal
- number of elements should match
- order of the elements also should match

### assertThrows()
- To check whether an exception is thrown or not
- assertThrows(NullPointerException.class,()->new Calc().sortCalc(arr));

### assertTimeout()
- to check the perfomance of the method
- assertTimeout(Duration.ofMillis(3), ()->new Calc().sortCalcTimeout(arr))

### assertNull()
- assertNull(arr,"It is not null");
- checks for null if its not there it will throw error

### @BeforeEach annotated with method
- It method should be called for the initializtion of the obejcts
- it will be called before each test cases

### @AfterEach 
- closing the resources
- it will be executed after each test case
 
### @BeforeAll
- It will be called before any method is called
- It is the first method
- only once it will be called
- Static method

### @AfterAll
- Only once after all the cases are called
- It is the last method
- only once it will be called
- Static method

### @TestInstance(TestInstance.Lifecycle.PER_CLASS)//default is PER_METHOD