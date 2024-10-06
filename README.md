# Tasca S1.04 Testing

## 📄 Description

This project consists of a series of Java exercises organized into three levels (Level 1, Level 2, and Level 3). The exercises demonstrate the use of JUnit for testing various functionalities in Java, focusing on collections and object-oriented programming principles.

## 💻 Technologies Used

- **Java SE Development Kit (JDK)**: Version 22 or higher

- **JUnit**: For unit testing

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
Ensure JUnit is Present:
Confirm that the junit-platform-console-standalone-1.7.0.jar file is correctly located in the Nivell_1:_JUnit/libs/ directory.

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

Exercise 1: Create a class for restaurant management, implementing necessary methods to avoid duplicates.

Level 3

Exercise 1: Develop an application to manage a CSV file containing names and details, with sorting functionalities.

🐧 Debian Commands Used
Here are the Debian commands used in the project:

Clone the repository:

git clone https://github.com/OYanez85/Tasca_S1.04._Testing.git
Navigate to the project directory:

cd Tasca_S1.04._Testing
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
Conclusion
This README provides an overview of the project, its structure, and the commands used to execute and manage the Java exercises. Follow the guidelines to ensure proper setup and functionality.

### Instructions:
1. **Create a new file named `README.md`** in your project's root directory (`~/Tasca_S1.04_Testing/Nivell_3-JUnit/Exercici_1/`).
2. **Copy and paste the above content** into the file.
3. **Save and close the file**.
