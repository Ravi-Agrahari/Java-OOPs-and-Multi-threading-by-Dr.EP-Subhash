JAVA Programming by E.P Subhash
------------------------------- 

ACADEMIC CORE JAVA OBJECT ORIENTATION AND MULT-THREADING
--------------------------------------------------------

Object Oriented 
---------------

    # Object ? 

    -> An abstraction , concept or thing  with crisp boundaries 
    -> Has meaning for the problem at hand 
    -> Characteristics
        * Identity
            -> Ojects have Unique identity
            -> Objects are inherently distinguishable 

        * State
        * Behaviour
        * Classification


    Important thing class have ... 
        1. State (Attribute)
            -> Ex: name , age , college 
        2. Behaviour (Method)
        -> Ex: eat , sleep , run , study , etc.


    # Classes ?

    -> A set of Similar Objects 
    -> Object is instance of a class 
    -> Share behaviour and possibly some state 
    -> An Abstraction that is is meaningful for the problem at hand .

    Objects have many forms 

        -> Real world objects
        -> Abstract objects
        -> Roles 
        -> Tangible Things 
        -> Intangible things
        -> Incidents 
        -> Intraction 


Object hierarcy
----------------

    Is A Relationship
    -----------------

        Definition: Indicates inheritance, where a subclass is a specialization of a superclass.

        Direction: Bottom-up approach.

        Example: A Dog is an Animal.

        Usage: Represents a generalization-specialization relationship; helps in creating a clear hierarchy and reusing code.

        Polymorphism: Supports polymorphism, allowing methods to be called on superclass references pointing to subclass objects.


    Has A Relationship
    ------------------
        Definition: Indicates composition or aggregation, where a class contains or is composed of instances of other classes.

        Direction: Top-down approach.

        Example: A Car has an Engine.

        Usage: Models relationships between objects that are not necessarily in a hierarchy; useful for representing complex objects made up of simpler ones.

        Encapsulation: Promotes encapsulation, as the containing class manages the lifecycle and behavior of its components.


    Aggregation , Association , Compostion 
    --------------------------------------


Useful cmd in for java 
------------------------

    1. javac --version 
    2. javac -help
    3. java --version 
    4. java -help

    5. jshell 
        -> Interactive shell
        -> to exit press ctrl + d



Tiering in Java 
----------------

    1. Monolisth App
    2. Multi-tiered App
    3. N-tiered App

        

Interface 
---------

    -> It can be analysis as contract , mean the feature in interface must be impletement by subclass , or subinterfaces.


Packaging in java 
-----------------

    very important of main

What we have done in Vechicle Project 

    1. Downloaded the sourceCode in zip 
    2. Extracted the zip file
    3. Opened the project in eclipse
        - file -> open - exitisting project 
    4. We made 
    package contract 
     - Vechicle (interface)

    package partial_contract
     - Two Wheeler (abstract class)

    package concrete_class 
     - Bicyle 
     - MotorBike

    package client 
     - vechicle_app1 
     - vechicle_app2


    6. Undered Oject class , which is in java.lang using toString() method 

    7. Overriden toString() in two wheeler(abstract class )



