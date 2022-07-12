package java_short_video.OOPAbstraction.Interface;

public class InterfaceInfo {

    /*

    Interface:

        - it is a template, a blueprint of a class
        - Interface keyword is used to create interface
        - Specifies the behaviour(s) that a class should implement
        - provides additional methods that subclass(es) need.
        - we can achieve 100% abstraction using interfaces


      Properties of Interface:

        -Variables are static & final by default
        -Interface can have static methods,abstract methods and default methods only

        -Public is the only access modifier that can be used in interface and given by default
        -Abstract keyword is given by default to the abstract methods of interface
        (In abstract class it must be decleared "abstract keyword" to abstract methods)


      What Interface can not have ?

        -An interface can not have INSTANCE VARIABLES
        -An interface can not have INSTANCE METHODS
        -An interface can not have CONSTRUCTORS
        -An interface can not have BLOCKS
        -We can not crate objects from interface


      Implementing the Interface

        -Class can extend only one superclass, but java allows a class to implement multiple interfaces
        -Implements keyword is used to inherit from interfaces
        -When a class implements multiple interfaces, it must implement (override) all the abstract methods

        public class MyClass implements Interface1,Interface2,Interface3{} : MyClass is responsible to override those methods



        ***       Abstract class    _ vs _              Interface

          - can not be instantiated                      - can not be instantiated
          - multiple inheritance is not allowed          - multiple inheritance is  allowed
          - can have constructor                         - can not have constructor
          - can have instance and static variables       - can only have static variable(final by default)
          - can not be final                             - can not be final
          - can use other access modifiers then public   - can not use other access modifiers than public


     */


}
