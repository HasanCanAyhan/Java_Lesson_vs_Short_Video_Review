package java_lab.lab11_inheritance_abstraction;

public class OOP_Principles {

    /*
    OOP Principles:
	1. Encapsulation: hiding data
				use getter/setters to read/write

	2. Inheritance: IS A relation ==> parent (super) & child (sub)

					child (sub) class: inherits all the variables & methods of parent class that are accessible

					parent (super) class: does not inherit anything. for common features ONLY

					one class can only extend one class
					one class can implement multiple interfaces

	3. Abstraction:  hiding the function details from the user

				concetrate on essentials/importance (what it is), not worrying about the details/implemnetations (how it's done)


				abstract method: a method without the body

									meant to be overridden


								area();
								perimeter();
								...
								eat();
								work();


				2 ways to achieve abstraction:

						1. abstract class: meant to be parent (super)
										   can never be final

										   to provide the common variable & methods to all child classes ONLY

										   Can not create object from it



						2. Interface: blueprint of class
										specifies what the class must have
										can not be final
										Can not create object from it

										to Provide additional methods that any class needs


									What interface can have?

											variables: final & static ONLY

											methods: abstract method, static method, default method (treated as instance method in child classes)

											Access modifiers: public ONLY (private can be givened to static methods)

									What interface can not have?
											instance variables
											instance methods
											constructors
											blocks

									Why we need interface?
											one class can only extend one class, but one class can implement multiple interfaces







Class: blueprint of Object
     */

}
