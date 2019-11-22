package day55_Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

abstract class ScrumTeam{
	String name, jobTitle;
	double salary;
	
	public abstract void dailyStandUp();
	public abstract void demo();
	
	public void getInfo() {
		System.out.println("Employee name: "+name);
		System.out.println("Job title: "+jobTitle);
		System.out.println("Salary: $"+salary);
		System.out.println("***********************");
	}
}

class developers extends ScrumTeam{
	public developers(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary =salary;
		
	}

	@Override
	public void dailyStandUp() {
		//System.out.println("Developer "+ name+" is talking");
		
	}

	@Override
	public void demo() {
		//System.out.println("Developer "+name+" is doing demo");
		
	}
	
}

class testers extends ScrumTeam{
	public testers(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary =salary;
	}

	@Override
	public void dailyStandUp() {
		System.out.println("Tester "+ name+" is talking");
		
	}

	@Override
	public void demo() {
		System.out.println("Tester "+name+" is doing demo");
		
	}
	
}

public class BOA {
public static void main(String[] args) {
	ScrumTeam Aysel = new testers("Aysel", "SDET", 130000);
	ScrumTeam Aijamal = new testers("Aijamal","SDET", 120000 );
	ScrumTeam Suna = new testers("Suna", "senior SDET", 150000);
	ScrumTeam Anna = new developers("Anna", "senior Developer", 235000);
	ScrumTeam Robert = new developers("Robert", "junior Developer", 165000);
	ScrumTeam Ibrahim = new developers("Ibrahim", "Developer", 140000);
	
	ScrumTeam[] testers = {Aysel, Aijamal, Suna};
	/*for(ScrumTeam each: testers) {
		each.getInfo();
	}*/
	
	ScrumTeam[] developers = {Anna, Robert, Ibrahim};
	/*for(ScrumTeam each: developers) {
		each.getInfo();
	}*/
	
	ArrayList<ScrumTeam> scrum = new ArrayList<>();
	scrum.addAll(Arrays.asList(testers));
	scrum.addAll(Arrays.asList(developers));
	for(ScrumTeam each: scrum) {
		each.getInfo();
	}
	
}
}
