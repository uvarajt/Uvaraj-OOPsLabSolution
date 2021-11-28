package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import com.greatlearning.utils.Constants;

public class DriverClass {
	public static Employee employee = new Employee("Uvaraj", "Thillaigovindan");
	public static Scanner scanner = new Scanner(System.in);
	public static CredentialService credentialService = new CredentialService();
	
	public static void main(String[] args) {
		displayMenu();
		int choice;

		choice = scanner.nextInt();
		String emailAddress="";
		String password = "";
		String department = "";
		switch(choice) {
			case 1: department = Constants.TECHNICAL_DEPARTMENT;
				break;
			case 2: department = Constants.ADMIN_DEPARTMENT; 
				break;
			case 3: department = Constants.HR_DEPARTMENT;
				break;
			case 4: department = Constants.LEGAL_DEPARTMENT;
				break;
			default: System.out.println("Invalid option");
		}

		if(!department.isEmpty()) {
			emailAddress = credentialService.generateEmailAddress(employee.getFirstName(), employee.getLastName(), department);
			password = credentialService.generatePassword();
			credentialService.showCredentials(emailAddress, password);
		}

	}

	private static void displayMenu() {
		System.out.println("Welcome to ABC company \n"
		+"*********************** \n"
		+"1. Technical \n"
		+"2. Admin \n"
		+"3. Human Resource \n"
		+"4. Legal \n"
		+"*********************** \n\n"
		+"Enter the Department.. \n");
		
	}

}
