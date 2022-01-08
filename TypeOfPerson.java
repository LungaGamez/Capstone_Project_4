
//The PoisedCompany class is used to call this class
//Main class was declared
public class TypeOfPerson {
	
	//Attributes(explains features that an object has, attributes is the data that the class stores)
	String typeofperson;
	String name;
	int telnumber;
	String emailaddress;
	String physicaladdress;
	
	//Constructor are used to create a new object in the program
	//This method is used to initialize the attributes to the values that are specified for each object
	//When a new object of the class is created its new attributes are given values
	//this keyword refers to attributes in the new object
	public TypeOfPerson(String typeofperson, String name, int telnumber, String emailaddress, String physicaladdress) {
		
		this.typeofperson = typeofperson;
		this.name = name;
		this.telnumber = telnumber;
		this.emailaddress = emailaddress;
		this.physicaladdress = physicaladdress;
		
}
	//showTypeOfPerson method returns a String object that we’ll use outside the class to display the contents of each object
public String showTypeOfPerson() {
		
		System.out.println(typeofperson + " details are as follows: \n");
		String output = "Title: " + typeofperson;
		output += "\nName: " + name;
		output += "\nNumber: " + telnumber;
		output += "\nEmail Address: " + emailaddress;
		output += "\nPhysical Address: " + physicaladdress;
		
		//String output is returned
		return output;
}		
}