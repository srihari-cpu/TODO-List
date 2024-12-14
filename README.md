To-Do List Manager

This is a simple Java-based To-Do List Manager application that allows users to add, remove, and view tasks in a to-do list. The program provides an interactive menu interface for managing tasks in the list.

Features

Add Task: Allows the user to add a new task to the to-do list.
Remove Task: Allows the user to remove an existing task from the list by selecting the task number.
View Tasks: Displays all the tasks currently in the list.
Exit: Exits the program.

Requirements

Java: JDK 8 or later
IDE or Command Line: Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or command line to run Java programs.

How to Run
1. Clone the Repository
To clone this project to your local machine, run the following command in your terminal:

bash
Copy code
git clone https://github.com/<your-username>/ToDoListManager.git

2. Compile and Run
Using Command Line:
Navigate to the project directory:
bash
Copy code
cd ToDoListManager
Compile the program:
bash
Copy code
javac ToDoListManager.java
Run the program:
bash
Copy code
java ToDoListManager
Using an IDE:
Open the project in your preferred Java IDE.
Locate the ToDoListManager.java file and run it from within the IDE.

4. Using the Program
Once you run the program, you will see a menu with the following options:

markdown
Copy code
---- To-Do List Manager ----
1. Add Task
2. Remove Task
3. View Tasks
4. Exit
Option 1 allows you to add a new task.
Option 2 allows you to remove a task by selecting its number.
Option 3 displays the list of all tasks.
Option 4 exits the application.
Example Usage
mathematica
Copy code
---- To-Do List Manager ----
1. Add Task
2. Remove Task
3. View Tasks
4. Exit
Please select an option (1/2/3/4): 1
Enter the task you want to add: Buy groceries
Task added successfully!

---- To-Do List Manager ----
1. Add Task
2. Remove Task
3. View Tasks
4. Exit
Please select an option (1/2/3/4): 3

To-Do List:
1. Buy groceries
Error Handling
Invalid Task Number: If you try to remove a task with an invalid task number, the program will show an error message:
"Invalid task number. Please try again."
Invalid Option: If the user enters an invalid menu option, the program will prompt the user to select a valid option.
