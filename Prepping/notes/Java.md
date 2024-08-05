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
- string pool constant exists and string will always create new object it won't modify the constant.

## String Buffer 
- Capacity of String buffer variable is 16.
- append, insert,setlength, ensureCapacity
- Mutable String
- Thread Safe 

## Static keyword
- Static variables are stored in separte place. It can be used by having class name as object.
- Static block will be called only once and it will always be called first.
- if object is not created it will not call static block(use Class.forName(classname) to only intialize a class without create an object)
- We cannot use instance varibles in Static methods.

## Encapsulation
- Intergrating data(variables) and methods into a single entity is called as encapsultaion.

## Getterss and Setters
- Normally when we create a instacne variable in private then it will be accessible only within the class to make it editable and gettable outside the class is were the getters and setters comes in to the picture.

## this keyword
- It represents the current object.
- it will call the constructor of teh same class. **this()**

## Constructor
- Name of the class is constructor name
- Everytime we create a new object we call the constructor by default.
- db connections can be called in the constructor.
- Can be overloaded --> paramaterized constructor
- default constructor is created automatically.

## Super keyword
- Every constructor has the 1 st line as super() to call the parent class default constructor.
- If the parameterized constructor should be called try to use the super(parmeter) which you want to send.
- **Every class in java extends the object class.**

## Naming Convention
- Class, Interface --> Student
- Variable and Methods --> CamelCase
- Constants --> PIE

## Annoymous Object
- new Student().getMarks();
- It has intialization but not a name.

## Inheritance(Is-A)
- extends(is a) keyword is used
- It removes the redundancy in code.
- multi level inheritance is also supported(Calc-->AdvCalc--> ScienCalc).

## Diamond Problem
- Multiple inheritance is not supported in java
- If the same method is in both parent classes it creates a ambiguity problem so multiple inheritance is not supported.

## Method Overriding
- Child class method will override parent class method if the method and its parameters are similar.

## Package
- package keyword is used
- Structuring of the project
- use imports to create objects and use the methods in other packages if its public.
- java.lang package is always imported.

![alt text](images/image.png)

## Polymorphism
- Many behaviours
- Ability of an object to (take many forms) behave differntly based on the input.
- Types: Compile time polymorphism(Early binding)--> Overloading, Run time polymorphism(Late binding) --> Overriding
- A obj=new B(); A -->Obj type is A  B--> Obj implementaion is called a dynamic method dispatch works only with inheritance.

## final keyword
- Once assigned variable it cannot be modified
- final class cannot be inherited
- final method cannot be overridden

## Overriding toString and equals(Check out Class names SampleA, SampleB)
- We have to override the methods to print and check the exact values of the objects which you are printing and comparing.
- hashCode() also needs to be checked if equals is modified

## Type Casting
- Converting the type of a varible to another type.
- Up Casting and Down casting
-       SampleA obj_sampleA = new SampleB();
        obj_sampleA.showA();// This represnts obj is referenced only to SampleA class so it can't access SampleB methods.

        SampleB objB= (SampleB) obj_sampleA;
        objB.showB();// When we cast the method as SampleB obj it could access both class methods

## Wrapper Classes
- Every Primitive type will have a class int(Primitive) --> Integer(Reference variable)
- **AutoBoxing** storing a primitive value in a reference variable(Wrapper object). --> int a=5;Integer b=a;(AutoBoxing)
- **Autounboxing** --> int a=b;Integer b=5;(AutoUnBoxing)

## Abstract Keyword
- Defining a method without any implementation is called as abstract method. It can only be created in abstract class.Cannot create object of abstract class.
- Abstract class can have all kinds of normal methods and abstract methods.
- An class extending abstract class should implement all the abstract methods if not it will throw an error.

## inner Class
- It can only be used by outer class object and outer class itself
- Example: B Class is inner class to A class then methods inside B class can only be accessed by creating object of A class then referencing it to create a object for B class.
- A.B objB= objA.new B();

## Anonymous inner class
    SampleA objA= new SampleA(){
            public void showA(){
            System.out.println("new inner class");
            }
        };
- This can be useful for the abstract class implementation of a methods because its easier to use this way.

## Interface -- Most of the interfaces Suffix is -able --> Runnable,Throwable
- All methods inside a interface are abstract methods
- **implements** is used
- variables inside a interface is final and static
- multiple interface can be implemented in a class

## Enum is class
    enum NameEnum{
        Running,Succes,Failure;}
    NameEnum s= NameEnum.Running; //NameEnum.values()--> Array of values
- Switch case can be used with ease
- As its a class it can have constructors and getter setters and all kinds of methods

## Annotations
- @Override, @Deprecated

## Types of Interface
- Marker interface: Blank interface example; Serialization --> converting a object to byte stream (writeObject()), deserialization --> byte stream to object (readObject()) 
- Functional interface: SAM Single Abstract Method only one methdod
- Normal interface

## Functional Interface
- @FunctionalInterface identified by the annotation
- Lambda expression works only with functional interface
        SampleInterface objI = (a,b) -> a+b;

## Exceptions
- Compile time errors - coding erros like calling a methods which is not declared
- Run time errors - Exception Handling use try{} catch(){} Example: ArithmeticException , ArrayIndexoutofboundsException, NullpointerException. These all are unchecked exceptions.
- Checked exceptions include Sql Exception, IO exception
- Logical errors 

## Throw
- key is used to throw a exception
- Example: condition {throw new ArthimeticException("Donot want a print");} it will be catched in the catch

## Throws
- Do not ask main method to handle exception
- throws should be used in the method signature
- hierarchy of the exceptions can be tracked by stack trace(e.printStackTrace())

## System.out.println --> System is a class, Out is an object in PrintStream, println is a method.

## Scanner sc= new Scanner(System,in); int a = sc.nextInt();

## Finally block 
- Its always executed , Can close connections.
- try with resources does not need any sort of catch blocks or finally.

## Threads
- Extend **Thread** class 
- Thread should have a run method 
- start() method to call the method
- setPriority(Thread.MAX_PRIORITY)
- Thread.sleep(millis:time) --> InteruptedException should be handled
- **implement** Runnable
- join() method waits for the thread to complete
- States: New --> Runnable --> Running --> Waiting --> Dead

## Mutations
- Change of the values
- synchronized methods can be used to stop mutation in threads





