# Tasca S1.04 Testing

## 📄 Description

This project consists of a series of Java exercises organized into three levels (Level 1, Level 2, and Level 3). The exercises demonstrate the use of JUnit for testing various functionalities in Java, focusing on collections and object-oriented programming principles.

## 💻 Technologies Used

- **Java SE Development Kit (JDK)**: Version 22 or higher
- **JUnit**: For unit testing
- **AssertJ**: For fluent assertions
- **Maven**: For dependency management
- **Git/GitHub**: For version control and repository management

## 📋 Requirements

- **Java SE Development Kit (JDK)**: Version 22 or higher installed on your local machine
- **Maven**: To manage project dependencies
- **Git**: To clone the repository and manage version control

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/OYanez85/Tasca_S1.04._Testing.git
Navigate to the project directory:

cd Tasca_S1.04._Testing
Ensure JUnit and AssertJ are Present:
Confirm that the necessary JAR files (like junit-platform-console-standalone-1.7.0.jar and AssertJ JAR) are correctly located in the Nivell_1:_JUnit/libs/ directory.

▶️ Execution
After ensuring that all Java files are correctly placed in their respective directories, compile and run the code using the following commands:

Navigate to the Exercici_1 directory:


cd Nivell_1:_JUnit/Exercici_1
Compile the Java files:

javac -cp "../libs/junit-platform-console-standalone-1.7.0.jar" *.java
Run the main program:

java -cp ".:../libs/junit-platform-console-standalone-1.7.0.jar" Main
Run JUnit tests:

java -cp ".:../libs/junit-platform-console-standalone-1.7.0.jar" org.junit.platform.console.ConsoleLauncher --scan-class-path

🌐 Deployment

This is a locally executed Java project, and no deployment on a server is required. However, if necessary, you can package the application using tools like Maven to distribute it as a JAR file.

🤝 Contributions

Fork the repository on GitHub before making any changes.
Create a new branch for your changes:

git checkout -b feature/your-feature-name
After implementing your changes, commit them:

git add .
git commit -m "Your commit message"
Push the branch to your fork:

git push origin feature/your-feature-name
Open a pull request to merge your changes into the main repository.

📋 Level Structure

Level 1

Exercise 1: Create a class that manages a collection of books in a library, allowing for adding, retrieving, and removing books.
Exercise 2: Implement a JUnit test to verify the library functionalities.

Level 2

Exercise 1: Create assertions that demonstrate that the value of two integer objects is equal, and another that indicates that it is not.
Exercise 2: Create assertions to verify object references are the same or different.
Exercise 3: Assert that two arrays of integers are identical.
Exercise 4: Create an ArrayList containing various types of objects and write assertions to verify their order and uniqueness.
Exercise 5: Create a map and verify that it contains a specified key.
Exercise 6: Trigger an ArrayIndexOutOfBoundsException in a class and create an assertion that validates the exception is thrown.
Exercise 7: Create an empty Optional object and write an assertion to verify it is indeed empty.

Level 3

Exercise 1: Develop a calculator class with methods for basic operations, implementing TDD principles to ensure functionality through tests.

🐧 Debian Commands Used

Here are the Debian commands used in the project:

Clone the repository:

git clone https://github.com/OYanez85/Tasca_S1.04._Testing.git

Navigate to the project directory:

cd Tasca_S1.04_Testing

Create required directories:

mkdir -p "Nivell_1:_JUnit/Exercici_1"
mkdir -p "Nivell_1:_JUnit/libs"

Move JUnit JAR file:

mv ~/Downloads/junit-platform-console-standalone-1.7.0.jar Nivell_1:_JUnit/libs/

Compile Java files:

javac -cp "Nivell_1:_JUnit/libs/junit-platform-console-standalone-1.7.0.jar" Nivell_1:_JUnit/Exercici_1/*.java

Run the main program:

java -cp ".:Nivell_1:_JUnit/libs/junit-platform-console-standalone-1.7.0.jar" Main

Run JUnit tests:

java -cp ".:Nivell_1:_JUnit/libs/junit-platform-console-standalone-1.7.0.jar" org.junit.platform.console.ConsoleLauncher --scan-class-path
