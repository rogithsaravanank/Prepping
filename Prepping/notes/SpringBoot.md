## SpringBoot

### QueryDSL
- 1.19.46.00 --> Springboot with mongodb

- Mongo db website to create a free account and cluster
- spring io
- dependancy --> spring web, spring data monogodb
- extend mongorepository
- 1.20.26.54 

Sure! Let’s imagine we have a fun little toy world with two types of toys: **Dolls** and **Cars**.

### JSON Managed Reference
- Think of the **Doll** as a special toy that has a collection of **Cars**. Each Doll can have many Cars, and it keeps track of them.
- When we say “**JSON Managed Reference**,” it’s like telling our Doll, “You can show off your Cars to anyone who asks!”

### JSON Back Reference
- Now, each **Car** wants to remember which **Doll** it belongs to. So, when you look at a Car, it can say, “I belong to this specific Doll!”
- This is what we call a “**JSON Back Reference**.” It’s like the Car saying, “Hey, I’m friends with this Doll!”

### Why Do We Use Them?
- When we want to send information about our toys (like in a computer program), we need to decide what to show and what not to show.
- **Managed Reference** helps us say, “Show all the Cars when we look at a Doll.”
- **Back Reference** helps us say, “Show who owns this Car when we look at the Car.”

### The Problem
Sometimes, if we try to show everything at once, we can get confused. It’s like if all the Cars tried to shout out their Doll at the same time! So, we use these references to keep everything neat and tidy.

### In Summary
- **JSON Managed Reference**: Tells the Doll to show its Cars.
- **JSON Back Reference**: Tells the Car to remember its Doll.

This way, everyone knows their place in the toy world without getting mixed up!