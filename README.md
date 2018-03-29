# Design Patterns

Create simple examples of using main templates. Implementation on Java language.

## Three types of templates : Behavioral, Creational and Structural

### - Behavioral - Describe interactions between objects and focus on how objects communicate with each other. They shift your focus away from flow of control to let you concentrate just on the way objects are interconnected.

* Chain of Responsibility - Decouples the sender of request and it's receiver. Simplyfies objects because they doesn't  have to know the chains structure.

* Command - Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

### - Creational - They help make a system independent of how its objects are created, composed, and represented.That type of patterns will delegate instantiation to another object.

* Astract Factory - Provide an interface for creating families of related or dependent objects without
specifying their concrete classes.

* Factory Method - Define an interface for creating an object, but let subclasses decide which class to
instantiate. Factory Method lets a class defer instantiation to subclasses.

* Singleton - Ensure a class only has one instance, and provide a global point of access to it.

* Prototype - Specify the kinds of objects to create using a prototypical instance, and create new
objects by copying this prototype.

* Builder - Separate the construction of a complex object from its representation so that the same
construction process can create different representations.
