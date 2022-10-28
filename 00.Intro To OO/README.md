# Intro To OO
## Content
- [***UML***](https://github.com/m7moudGadallah/Head-First-Object-oriented-Analysis-Design-breif/tree/main/00.Intro%20To%20OO#uml)
- [***Inheritance***](https://github.com/m7moudGadallah/Head-First-Object-oriented-Analysis-Design-breif/tree/main/00.Intro%20To%20OO#inheritance)
- [***Polymorphism***](https://github.com/m7moudGadallah/Head-First-Object-oriented-Analysis-Design-breif/tree/main/00.Intro%20To%20OO#polymorphism)
- [***Encapsulation***](https://github.com/m7moudGadallah/Head-First-Object-oriented-Analysis-Design-breif/tree/main/00.Intro%20To%20OO#encapsulation)

---
<img align = "right" src="../pic/Class_Diagram.png" width = "300">

## UML
- Unified Modeling Language
- it is a language used to communicate just the details about your code and application's structure that other devlopers and customers need, without getting details that aren't neccessary
- Class Digram gives you an overview of our class, including it's methods and variables


---
## Inheritance
- means new class extends another existing class to reuse or build upon the inherited class's behavior
- **superclass** class being inherited from also called (parent)
- **subclass** class is doing inheritance also called (child)
- subclass gets all behaviors or the super calss automatically and can `override` it and also it have it's own behaviors

***Example*** : in [Example1](Example1), class [*Airplan class*](Example1/myutil/Airplan.java) is *superclass* and [*jet*](Example1/myutil/Jet.java) is *subclass* and [*Main*](Example1/Main.java) is the main class to run program


----
## Polymorphism
- having many forms
- allows your applications to be more flexible and less resistant to cahng
- there is 2 types :
  - ***Static*** "Overloading" : this type in Compile-time
  - ***Dynamic*** "Overriding" : this type in run-time
  
>as an Example of overide go back to previous example
so you find that class jet override of  `setSpeed` function

---
## Encapsulation
- means warpping data in single unit and we can hide one part of code from rest of code
- simple way of `Encapsulation` is when we hide `class` attributes and access them with methods like  `getter` and `setter` methods
- not just hiding attributes, we can also hide methods

***Example***
in [Example1](Example1) in [*Airplan class*](Example1/myutil/Airplan.java) Speed Attribute is private and only Acessed with ``getSpeed()`` and ``setSpeed()`` methods 