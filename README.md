# Music Store Project

## Overview

This project is a **Music Store Management System** that I built to practice and solidify my understanding of Java classes, constructors, object-oriented programming (OOP), and Java Swing for GUI. The primary goal of this project was to improve my skills in writing and understanding object-oriented code by using real-world examples and designing a small application from scratch. Along the way, I implemented constructors, template classes, getter and setter methods, function overriding, and basic GUI elements to create an interactive and functional music store application.

## Motivation

The inspiration for this project came after a small but memorable mistake I made during a lab session, where I accidentally added a void return type to my constructors. That experience made me realize I needed more practice, not only with Java syntax but also with the fundamental concepts of object-oriented programming. This project serves as both a learning tool and a reflection of my determination to master classes, constructors, and GUI implementation.

To create this project, I used the knowledge I gained about:

- Classes and objects
- Constructors and their correct usage
- Visibility modifiers (public, private, etc.)
- `toString()` method for string representation of objects
- Java Swing for creating a Graphical User Interface (GUI)
- Basic `get` and `set` methods

## Project Features

The project consists of several Java classes that model the core components of a music store. It also includes a GUI using Java Swing to allow users to interact with the store. Below, you'll find an extensive explanation of each of the classes and how they interact with each other.

### Class Breakdown

#### `Customer.java`

- **Purpose**: Represents a customer in the music store.
- **Main Features**:
  - **Attributes**: Stores customer details like name, contact information, and purchase history.
  - **Constructor**: Initializes a customer with essential details.
  - **Getters and Setters**: Provides controlled access to customer attributes.
  - **toString() Method**: Represents customer information in a readable format for display in the GUI.

#### `Instrument.java`

- **Purpose**: Represents an instrument available in the music store.
- **Main Features**:
  - **Attributes**: Stores information like instrument name, type, and price.
  - **Constructor**: Initializes an instrument with its details.
  - **Getters and Setters**: Provides controlled access to instrument details.
  - **toString() Method**: Represents instrument details for easy readability.

#### `Order.java`

- **Purpose**: Represents an order placed by a customer for one or more instruments.
- **Main Features**:
  - **Attributes**: Stores information about the customer, instrument, and the quantity of items ordered.
  - **Constructor**: Initializes an order with a customer and a set of instruments.
  - **Getters and Setters**: Allows safe access to order details.
  - **toString() Method**: Generates a summary of the order, which is displayed in the application GUI.

#### `MusicStoreGui.java`

- **Purpose**: Handles the graphical interface of the music store, allowing users to interact with the store visually.
- **Main Features**:
  - **Java Swing Components**: Implements various Swing components like `JFrame`, `JPanel`, `JButton`, `JTextField`, and `JLabel` to create an interactive window.
  - **User Interaction**: Enables users to perform operations such as adding new instruments, creating orders, and viewing customers through buttons and input fields.
  - **Event Handling**: Uses event listeners to capture and handle user actions like button clicks, ensuring a smooth user experience.

#### `MusicStoreMain.java`

- **Purpose**: The main class that ties everything together. It initializes the GUI and serves as the entry point for the application.
- **Main Features**:
  - **Main Method**: The main method here launches the application, initializing instances of the store, customers, instruments, and orders.
  - **Execution**: Ensures all components are linked properly and that the application starts seamlessly.

## Concepts Implemented

1. **Classes and Objects**: The entire project revolves around defining template classes (`Customer`, `Instrument`, `Order`) and creating objects to represent real-world entities. This practice helped me gain confidence in designing classes with appropriate attributes and behaviors.

2. **Constructors**: Constructors were used to initialize the objects correctly. For example, in `Customer.java`, I used a constructor to assign values to the customer's name and contact details without allowing empty or invalid data, ensuring the object state is always valid.

3. **Encapsulation and Visibility Modifiers**: Proper use of visibility modifiers (`private`, `public`) was a priority in this project to enforce encapsulation. Attributes are kept private, and public getter/setter methods are provided for controlled access.

4. **Function Overriding (toString method)**: Overriding the `toString()` method in each class provided me with a way to convert object details into a readable format for easy debugging and display purposes. It also made the GUI representation of objects more informative.

5. **Java Swing GUI**: I used Java Swing to develop a simple GUI to interact with the application. The use of `JButton`, `JLabel`, `JTextField`, and event listeners helped me gain practical experience in building user interfaces, handling user input, and providing a complete application experience.

## How to Run the Project

### Requirements:

- Java JDK 8 or later

### Steps:

1. Clone the repository to your local machine.
2. Compile all Java files using the command:

   ```bash
   javac *.java
   ```

3. Run the main program using the command:

   ```bash
   java MusicStoreMain
   ```

4. The GUI window will open, and you can start interacting with the music store.

## Conclusion

This project was an essential step in my journey to master Java programming. By combining OOP concepts like classes, constructors, encapsulation, and GUI elements, I gained practical experience and a deeper understanding of Java development. It also served as a testament to my motivation to learn from my mistakes and work harder to improve my skills.


<img width="931" alt="Ekran Resmi 2024-10-16 20 36 43" src="https://github.com/user-attachments/assets/4c72f267-6bdc-4fde-acfa-d350ff650baa">


