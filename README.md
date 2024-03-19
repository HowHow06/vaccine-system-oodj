# Vaccine System OODJ

## Introduction

This Java-based project, part of my portfolio, showcases a vaccine management system designed to demonstrate the application of Object-Oriented Programming (OOP) concepts, Design Patterns, and SOLID principles. The system is aimed at managing vaccine stocks, appointments, and user interactions within a simplified context.

## Design Patterns

In the development of this vaccine management system, several design patterns were employed to ensure the software is maintainable, scalable, and easily understandable. The following are key patterns used:

- **Singleton Pattern**: Ensured that certain classes, such as the database connection manager, had only one instance throughout the application lifecycle.
- **Factory Method Pattern**: Used for creating objects without specifying the exact class of object that will be created. This is particularly useful in the creation of user objects, where the type of user (e.g., Admin, Patient) dictates the subclass instantiated.
- **Observer Pattern**: Implemented to notify various parts of the system of changes in vaccine stocks or appointment schedules, allowing for dynamic updates across the UI and data layers.
- **Strategy Pattern**: Enabled the application to select the appropriate algorithms for processing user requests at runtime, making the system more flexible and adaptable to changes in business logic.

## SOLID Principles

The project strictly adheres to the SOLID principles to promote a clean, scalable, and manageable codebase:

- **Single Responsibility Principle (SRP)**: Each class in the system has been designed to have a single responsibility and thus only a single reason to change. For example, classes dedicated solely to managing user data, processing appointments, and handling vaccine inventory.
- **Open/Closed Principle (OCP)**: The system is open for extension but closed for modification. This is achieved by designing modules that can be extended without modifying the existing code, such as adding new types of vaccines or users without changing the core functionality.
- **Liskov Substitution Principle (LSP)**: Ensures that subclasses can replace their superclass in the system without affecting the correctness of the program. This principle is pivotal in our user management where subclasses of a `User` can be interchanged without impact.
- **Interface Segregation Principle (ISP)**: The system uses specific interfaces rather than one general-purpose interface, ensuring that implementing classes only need to be concerned with methods that are pertinent to them.
- **Dependency Inversion Principle (DIP)**: High-level modules do not depend on low-level modules but rather both depend on abstractions. This is evident in how the business logic layer communicates with the data access layer, promoting loose coupling.

## Getting Started

### Sample data

- the data are stored under `data/` folder, as binary files
- the data files cannot directly view using notepad
- to view to data, go to `utils/Setup.java`
  - uncomment the `DataFaker.printAllData();` line
  - run it

### Regenerating sample data

- if u accidentally messed up the data, can go to `utils/Setup.java`
  - uncomment the `DataFaker.initAllData();` line
  - run it

### How to use the File DAO class:

- there are generally 5 functions for the DAO class, can refer to `BaseRootDAO.java` file:
  - `all();`
    - get all objects from data file
  - `get(UUID id);`
    - get object by unique id from data file
  - `update(UUID id, T t);`
    - update object by unique id in data file
  - `replace(List<T> tList);`
    - overwrite the whole data file with an object list
  - `create(T t);`
    - create a new object and add it to data file
  - `delete(UUID id);`
    - delete object by unique key from data file
  - `deleteAll();`
    - clear the data file completely
- to initialize a DAO class, just use `<ModelDAO> sampleDao = <FileModelDAO>.getInstance(); `
- example:

```java

PeopleDAO peopleDao = FilePeopleDAO.getInstance();
peopleDao.all();
// and more code...

```

## Conclusion

This vaccine management system is a comprehensive demonstration of applying OOP principles, Design Patterns, and SOLID principles in a real-world Java application. Through careful design and implementation, the project serves as a robust example of modern software engineering practices.
