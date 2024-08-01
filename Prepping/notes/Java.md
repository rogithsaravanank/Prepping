# Java

## Flow of the Java code
- Java code --> Compiler (javac) --> Byte code --> JVM understands bytecode (in OS) 
- JVM will be directed to first class which should have main method(JVM will look for main method).

## Compile and run
- javac filename(Main.java)
- java Main(class name)

## Data Types
- Primitive : Integer (byte- -2^7=128 to +2^7 ,int- 4 bytes, long- 8 bytes), Float(double,float), Character(char-2 bytes), Boolean(boolean)
- 

## Integer
- int a=10_00_000; =1000000 
- binary : int num1= 0b101; =5
- hexa decimal : int num1=0x7E; =126

## Ascii Value
- a:97
- z:122
- A:65
- Z:90

## Casting and Conversion
- Casting: Explicit conversion of a variable int a=(int) 5.6f;
- Conversion: byte to int but int cannot be assigned to byte.

## Assignment Operators and Logical Operator
- *,+,-,/,%
- &&,||,!

## Conditional Statements
- if() else
- else if()
- Ternary operator : int a=10; int result = (a==2) ? 10: 20;
- switch() { case 1:break;}

## Loops
- while()
- for()
- do{} while();

## Object Oriented Programming
- Use Case is the first place were the object orientation starts.
- Objects will be created for doing an action which will be an internal state(behaviour) of the object.
- Every object has an property and behaviour.

## JRE , JVM, JDK
- Java Development Kit : This contains JRE
- Java Runtime Environment : This contains JVM
- Java Virtual Machine : Compiles the Files

## Method Overloading
- same method name but the multiple types of arguments sent to the method.

## Memory 
- JVM consist of stack and heap space to handle the computations of the methods.
- stack stores each methods and variables in key value pair. Each method will have a seaparate stack.
- object creation will happen in heap space.
- stack will have connection with heap to refer the objects.

## Array
- It is collection of elements with static number of elements
- int[] num=new int[3];
- int[] num= {1,2,2};
- Size is fixed.

## Mullti dimensional Array
- int num[][]= new int[2][3];
- Jagged array num[3][] rows are known and columns are unknown , but here the rows should be declared
- jaggedArray()

## String
- Always use ""
- String constant pool consist of all the strings declared in heap space.
- Mutable string(Change) and immutable string (No Change)
- Capacity of String buffer variable is 16.



