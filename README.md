# CALCULATOR_PROJECT
# PROJECT DESCRIPRION
This project is a Java-based Scientific Calculator application developed using the Swing framework for building the graphical user interface (GUI). It allows users to perform both basic arithmetic operations (addition, subtraction, multiplication, division) and scientific calculations such as:

Trigonometric functions: sin, cos, tan

Logarithmic (log) and square root (sqrt)

Power (^) operations

The calculator features a clean and interactive layout with clickable buttons, an input display field, and error handling for invalid operations. All user interactions are handled through ActionEvent listeners, and results are formatted for better readability.

This project is a great example of integrating GUI development with mathematical logic in Java.
# TECHNOLOGIES USED
Java – The core programming language used to build the calculator logic and application.

Java Swing (javax.swing) – Used to design the Graphical User Interface (GUI), including buttons, panels, and text fields.

AWT (java.awt) – Supports layout management and event handling.

Java Event Handling (ActionListener) – Manages user interactions like button clicks.

Math Library (java.lang.Math) – Provides mathematical functions such as sin(), cos(), log(), sqrt(), and pow() for scientific calculations.

DecimalFormat (java.text.DecimalFormat) – Formats the output to show up to 8 decimal places for clean and readable results.

This calculator application is built using Java Swing and follows an event-driven programming model. Here's a breakdown of how it works:
# HOW MY PROJECT WORKS
1. User Interface (UI) Setup
A JFrame is created as the main application window.

A JTextField is placed at the top to display input and output.

Buttons are added inside a JPanel using a 6x4 GridLayout for digits, operators, and functions.

All buttons are labeled with numbers, operators (+, -, *, /, ^), scientific functions (sin, cos, log, etc.), and utility controls (C, ←, =).

2. Handling Button Clicks
The class implements ActionListener, so every button click triggers the actionPerformed() method.

The method checks what button was clicked (using getActionCommand()) and performs an action based on the input.

3. Performing Operations
Basic operations: When a number is entered, it's stored in a variable (num1). When an operator like + or * is clicked, the input is saved and the field is cleared.

When the = button is clicked, the second number (num2) is read, and the calculation is done using a switch statement.

Scientific operations like sin, cos, tan, log, sqrt, and ^ are handled immediately when their respective button is clicked.

Trigonometric functions convert degrees to radians before applying Java's Math functions.

4. Displaying Results
The result is shown in the text field using DecimalFormat to format numbers to 8 decimal places.

5. Utility Buttons
C clears all inputs and resets values.

← works as a backspace, deleting the last character entered.

If any exception (e.g., divide by zero, invalid input) occurs, "Error" is displayed in the input field.
# HOW MY PROJECT WORKS
How I Run the Project:
I use IntelliJ IDEA as the development environment for this project. To run the calculator, I open the project in IntelliJ, make sure the correct Java Development Kit is selected, and then run the Calculator class which contains the main method. This launches the calculator window where I can test the functionality.

Version Control and GitHub:
To keep track of my code and share it, I use Git for version control. After completing the project locally, I initialize a Git repository in the project folder, commit all the files, and then push the repository to GitHub. This makes my code safe, backed up, and accessible from anywhere.
I DONE MY PROJECT BY USING INTELLIJ IDEA BY JET BRAINS
Step 1: Open my project in IntelliJ IDEA
Launch IntelliJ IDEA.

Open the folder containing your calculator project or create a new project and add your Java files.

Step 2: Check Project SDK
Go to File > Project Structure > Project.

Ensure the Project SDK is set to a valid JDK (Java Development Kit) version (e.g., JDK 11 or 17).

If no SDK is selected, click New and add one.

Step 3: Build and Run
Locate my Calculator.java file that contains the main method.

Right-click on the file in the Project Explorer.

Click Run 'Calculator.main()'.

my calculator GUI window should appear, and you can use the calculator.
