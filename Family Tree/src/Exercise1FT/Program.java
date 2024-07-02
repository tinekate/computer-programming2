package Exercise1FT;


public class Program {

	public static void main(String[] args) {
		
		//display title
				System.out.println("Displaying Information of Forger Family");
				System.out.println();
				
				Parent parentA = new Parent();
				Parent spouse = new Parent();
				
				Child child = new Child();
				Child childB = new Child();
				
					spouse.firstName = "Yor";
					spouse.middleName = "Briar";	

				childB.firstName = ("Damian");
			
				System.out.println("Father's name: " + parentA.firstName + " " + parentA.middleName + " " + parentA.lastName);
				System.out.println("Mother's name: " + spouse.firstName + " " + spouse.middleName + " " + parentA.lastName);
				System.out.println("Child's name: " + child.firstName + " " + spouse.middleName + " " + parentA.lastName);
				System.out.println("Second Child's name: " + childB.firstName + " " + spouse.middleName + " " + parentA.lastName);
	
	}

}
