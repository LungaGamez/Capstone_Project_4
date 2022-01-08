//A project management system created for a small structural engineering firm called Poised

import java.util.Scanner;

// Declaring the main class.
public class PoisedCompany {

    // Main method is declared.
    public static void main(String[] args) {

// Declaring variables and required project inputs.

        int projectnumber;
        String projectname;
        String typeofbuilding;
        String physicaladdress;
        String ERFNumber;
        double projectcost;
        double amountpaid;
        String deadline;

        //A welcome message displayed to the user
        System.out.println("Welcome to the Poised Firm management system. Please create a new project.");

        //Asking the user to enter Project number,
        //Details of the project, storing that information in variables.
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the project number?: ");
        projectnumber = input.nextInt();
        input.nextLine();

        //The user enters the Project name
        System.out.println("Enter the project name?: ");
        projectname = input.nextLine();

        //The user enters the type of Building design
        System.out.println("What type of building design is the project?: ");
        typeofbuilding = input.nextLine();

        //The user enters the physical address of the project
        System.out.println("Enter the physical address of the project?: ");
        physicaladdress = input.nextLine();

        //The user enters the ERF number of the project
        System.out.println("Enter the ERF number of the project?: ");
        ERFNumber = input.nextLine();

        //The user enters the project cost value
        System.out.println("How much will the project cost?: ");
        projectcost = input.nextDouble();
        input.nextLine();

        //The user enters the amount paid to date by the customer
        System.out.println("Enter the amount paid to date?: ");
        amountpaid = input.nextDouble();
        input.nextLine();

        //The user enters the deadline of the project
        System.out.println("When is the deadline date of the project?: ");
        deadline = input.nextLine();

        // New object is created using the above details,
        ProjectDetails createnewproject = new ProjectDetails(projectnumber, projectname, typeofbuilding, physicaladdress, ERFNumber, projectcost, amountpaid, deadline);

        System.out.println("Project created.");

        //showProjectDetails() method is in the ProjectDetails class called out to show the new object[createnewobject]
        System.out.println(createnewproject.showProjectDetails());

        while (true) {

            //The user is presented with menu options to choose from
            //These options allows the user to edit existing projects, 
        	//Update the contractors information and finish the project
            System.out.println("\nChoose an option from the menu: \n" + "\n1. Edit existing projects" + "\n2. Update the contractor details" + "\n3. Enter the architect details" + "\n4. Finalise the project" + "\n5. Exit program");

            //The user's choice was stored in a variable useroption
            int useroption = input.nextInt();

            //if the user chooses option 1 from the main menu, they will be able to edit existing projects
            if (useroption == 1) {

                input.nextLine();

                //The user is presented with the menu which allows the to edit the project due date or the amount paid
                System.out.println("Which of the following options Would you like to do:" + "\n1. Edit the project due date or" + "\n2. Edit the total amount paid of the fee to date?" + "\nPlease choose either 1 or 2");

                //Their option is stored in "edituserchoice" variable
                Scanner choice = new Scanner(System.in);
                int edituserchoice = choice.nextInt();

                //if the user choose option 1 from the short menu, they are asked to enter a new due date for the project
                if (edituserchoice == 1) {
                    input.nextLine();
                    System.out.println("\nEnter the new due date for the project: ");
                    Scanner duedate = new Scanner(System.in);

                    //the updated due date is then stored in the "deadline" variable
                    deadline = duedate.nextLine();

                    //A new project with the updated due date is the created
                    ProjectDetails editedproject = new ProjectDetails(projectnumber, projectname, typeofbuilding, physicaladdress, ERFNumber, projectcost, amountpaid, deadline);

                    //An edited project object shown to the user in a friendly-manner
                    System.out.println(editedproject.showProjectDetails());
                }

                //If the user choose option 2 from the short menu, they are asked to update the amount paid to date
                else if (edituserchoice == 2) {
                    input.nextLine();
                    System.out.println("\nEnter the new total amount paid to date: ");
                    Scanner amount = new Scanner(System.in);

                    //The updated amount paid to date is stored in the "amountpaid" variable
                    amountpaid = amount.nextDouble();

                    //A new project with the updated amount paid is created
                    ProjectDetails editedproject1 = new ProjectDetails(projectnumber, projectname, typeofbuilding, physicaladdress, ERFNumber, projectcost, amountpaid, deadline);

                    //The edited project object is then displayed to the user
                    System.out.println(editedproject1.showProjectDetails());

                }
            }
            //If the user choose option 2 from the main menu, they are asked to update the contractor's details
            //The user's inputs are stored in appropriate variables
            else if (useroption == 2) {
                input.nextLine();

                //The user enter's the name of the contractor
                System.out.println("\nEnter the contractor's name to confirm their details: ");
                Scanner editname = new Scanner(System.in);
                String name = editname.nextLine();

                //The user enter's the contact numbers of the contractor
                System.out.println("\nEnter the new contact number of the contractor : ");  // Contact number.
                Scanner newtelnumbers = new Scanner(System.in);
                int number = newtelnumbers.nextInt();

                //The user enter's the email address of the contractor
                System.out.println("\nEnter the new email address of the contractor : ");
                Scanner newemailaddress = new Scanner(System.in);
                String email = newemailaddress.nextLine();

                //The user enter's the physical address of the contractor
                System.out.println("\nEnter the new physical address of the contractor's : ");
                Scanner newphysicaladdress = new Scanner(System.in);
                String address = newphysicaladdress.nextLine();

                String typeofperson = "Contractor";

                //New Type of person object is created with contractor's updated details
                TypeOfPerson contractor = new TypeOfPerson(typeofperson, name, number, email, address);

                System.out.println("You have updated the contractor details. \n");

                //showTypeOfPerson() method is in the (TypeOfPerson) class called out to show the new object("contractor")
                System.out.println(contractor.showTypeOfPerson());
                

            } else if (useroption == 3) {
                input.nextLine();

                //The user enter's the name of the architect
                System.out.println("\nEnter the architect's name to confirm their details: ");
                Scanner namearchitect = new Scanner(System.in);
                String namearch = namearchitect.nextLine();

                //The user enter's the contact details of the architect
                System.out.println("\nEnter the new contact number of the architect's : "); 
                Scanner telnumbersarchitect = new Scanner(System.in);
                int numberarchitect = telnumbersarchitect.nextInt();

                //The user enter's the email address of the architect
                System.out.println("\nEnter the new email address of the contractor's : ");
                Scanner emailaddressarchitect = new Scanner(System.in);
                String emailachitect = emailaddressarchitect.nextLine();

                //The user enter's the physical address of the architect
                System.out.println("\nEnter the new physical address of the architect's : ");
                Scanner physicaladdressarchitect = new Scanner(System.in);
                String addressarchitect = physicaladdressarchitect.nextLine();

                String typeofperson = "Architect";

                //New Type of person object is created with architect's details
                TypeOfPerson architect = new TypeOfPerson(typeofperson, namearch, numberarchitect, emailachitect, addressarchitect);

                System.out.println("You have updated the contractor details. \n");

                //showTypeOfPerson() method is in the (TypeOfPerson) class called out to show the new object("architect")
                System.out.println(architect.showTypeOfPerson());
            }

            //If the user choose option 3 from the main menu, they are asked to finish the project
            else if (useroption == 4) {
                input.nextLine();

                if (projectcost == amountpaid) {

                    //If the project amount was paid in full, no invoice will be generated
                    //The user is asked to enter the completion date of the project
                    System.out.println("No outstanding amount, the project is paid in full. No invoice.");
                    System.out.println("Add a completion date for the project: ");

                    //Completion date stored in a variable.
                    //The project is then marked "finalised"
                    Scanner date = new Scanner(System.in);
                    String completion = date.nextLine();
                    String finalise = "finalised";

                    //All the details about the project object as well as the "finalised" are printed out in a friendly-manner
                    System.out.println(createnewproject.showProjectDetails() + "\nCompletion Date: " + completion);
                    System.out.println("\nProject Status: " + finalise);

                    //If there is an outstanding amount
                } else if (projectcost != amountpaid) {

                    //The user is asked to add the customer's details to generate an invoice
                    //The user's inputs are stored in variables
                    System.out.println("The following details will be included in your invoice: ");

                    //The user enter's the customer name
                    //
                    System.out.println("\nEnter the full name of the customer's : ");
                    Scanner customer = new Scanner(System.in);
                    String namecustomer = customer.nextLine();

                    String typeofperson = "Customer";

                    //The user enter's the customer's contact numbers
                    System.out.println("\nEnter the contact number of the customer's : ");
                    Scanner contactnumbers = new Scanner(System.in);
                    int customercontactnumbers = contactnumbers.nextInt();

                    //The user enter's the customers email address
                    System.out.println("\nEnter the email address of the customer's : ");
                    Scanner contactemail = new Scanner(System.in);
                    String customeremailaddress = contactemail.nextLine();

                    //The user enter's the customer's physical address
                    System.out.println("\nEnter the physical address of the customer's physical address: ");
                    Scanner customerphysicaladdress = new Scanner(System.in);
                    String customeraddress = customerphysicaladdress.nextLine();

                    //The user is asked to enter the completion date of the project
                    System.out.println("Add a completion date for the project: ");

                    //Completion date of the project is stored in a variable
                    Scanner newdate = new Scanner(System.in);
                    String completion1 = newdate.nextLine();  // Completion date stored in string variable.
                    String finalise1 = "finalised";

                    //The New type of person object is created to show the customer's details
                    TypeOfPerson newcustomer = new TypeOfPerson(typeofperson, namecustomer, customercontactnumbers, customeremailaddress, customeraddress);
                    System.out.println("\nBelow are the customer's invoice details: ");

                    //The invoice with the customer's details and the outstanding amount is printed out
                    System.out.println(newcustomer.showTypeOfPerson());
                    System.out.println("\nOutstanding Amount: R" + (projectcost - amountpaid) + "\n");

                    //All the details about the project, including the completion date are printed out
                    System.out.println(createnewproject.showProjectDetails() + "\nCompletion Date: " + completion1);
                    System.out.println("Project Status: " + finalise1);

                }

            }

            //If the user choose option 4 from the main menu, they will log out from the program
            if (useroption == 5) {
                input.nextLine();
                System.out.println("You have logged out.Thank you!");
                break;
            }
        }

    }

}
