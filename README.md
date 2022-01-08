# Capstone-Project-4
# Poised Firm: Object Orientated Programming
# Project Information
# Description

This Poised Firm is a Programme written in Java language. This Programme was designed to create a project management system for a small structural engineering firm called “Poised”.
Poised does the engineering needed to ensure the structural integrity of various buildings. The Java program was created to help the company to keep track of the many projects that they work on.

# How it works?

The UML(Unified Modeling Language) diagram is used to display an overall plan of the project to meet the Poised Firm requirments for the Project Management System. The main 'Menu'(PoisedFirm) Java class was created to call methods from sub-classes(depending on what option the user chooses on the main menu). Once the project is completed, the programme will be able to record all the details about new projects, update details on existing projects, finalise existing projects, view projects that are incomplete or overdue, and to find and select a project by number or name. From this point the project is not yet complete but will be completd at a later stage.

The Java programme consists of the following:

> The 'TypeOfPerson' Java class that consists of specific variables(attributes), a constructor method, and a method that shows all the person's details. The 'TypeOfPerson' Java   class is used to create a person object(e.g architecture, customer, contractor) with their specific information(type of person, name, telephone number, emailaddress,             physical address) and then shows their details in a friendly-manner.

> The 'ProjectDetails' Java class that consits of variable(attributes), a contrustor method, and a method that shows all the details related to the new project. The               'ProjectDetails' Java class is also used to create a new project object with relevant details(project number, project name, type of building, physical address, ERFNumber,       project cost, amount paid, deadline) and then shows the new project details in a friendly-manner.

> The 'PoisedFirm' Java class. This is the 'Main' class that runs the entire programme. When the programme is exercuted it displays a welcome message to the user and allows the   user to add a new project. To do this, the user is asked different questions to collect information to create a new project object. Once the information is collected, the       project information is displayed.

> The programme display a mini menu to the user with the following options:

* edit existing projects 
* update contractor details 
* finalise a project
* or to exit the program

The user input the number correlating to the menu option displayed to be directed to their option. If the user choose to edit an existing project, they are given options to edit the project due date or edit the total amount paid to date. If the user choose to update contractor details, they are asked certain questions to collect the new contractor details. If the user choose to finalise a project, the programme generates an invoice if there is outstanding amount, and the asked to enter a completion date for the project.
The project's status is also updated(finalised). The updated/edited project is displayed in a friendly-manner. An appropriate message is displayed if the user chooses to exit the programme.

# How to use this Poised Firm programme?

* To run this programme, you need to download Java Development Kit (JDK) onto your computer's operating system 
* Link to download Python on your computer(e.g Mac, Linux, Windows etc.), https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_HowTo.html#jdk-install
* Once Java Development Kit (JDK) is downloaded, you need IDLE(An Intergrated Development Environment). IDLE is a safe environment to view and run your code. 
*  A link for an IDE called 'Eclipse', https://www.ntu.edu.sg/home/ehchua/programming/howto/EclipseJava_HowTo.html 
