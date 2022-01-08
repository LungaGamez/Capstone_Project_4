//The ProjectDetails class was created to create type of person object with certain attributes
//The PoisedCompany class is used to call this class
//Declaring the main class
public class ProjectDetails {
	
	//Attributes(explains features that an object has, attributes is the data that the class stores)
	int projectnumber;
	String projectname;
	String typeofbuilding;
	String physicaladdress;
	String ERFNumber;
	double projectcost;
	double amountpaid;
	String deadline;
	
	//Constructor are used to create a new object in the program
	//This method is used to initialize the attributes to the values that are specified for each object
	//When a new object of the class is created its new attributes are given values
	//this keyword refers to attributes in the new object
	
	public ProjectDetails(int projectnumber, String projectname, String typeofbuilding, String physicaladdress, String ERFNumber, double projectcost, double amountpaid, String deadline) {
	
	this.projectnumber = projectnumber;
	this.projectname = projectname;
	this.typeofbuilding = typeofbuilding;
	this.physicaladdress = physicaladdress;
	this.ERFNumber = ERFNumber;
	this.projectcost = projectcost;
	this.amountpaid = amountpaid;
	this.deadline = deadline;

}
	//showProjectDetails method returns a String object that will use outside the class to display the contents of each object
	public String showProjectDetails() {
		
		System.out.println("The details for project " + projectname + " are as follows: \n");
		String output = "Project Number: " + projectnumber;
		output += "\nProject Name: " + projectname;
		output += "\nBuilding Type: " + typeofbuilding;
		output += "\nPhysical Address: " + physicaladdress;
		output += "\nERF Number: " + ERFNumber;
		output += "\nProject Fee Total: R" + projectcost;
		output += "\nAmount Paid to Date: R" + amountpaid;
		output += "\nProject Deadline: " + deadline;
		
		//String output is returned
		return output;
	}
	
}	
