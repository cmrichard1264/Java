package day49_Abstraction;

public abstract class Abstraction {

	public abstract void startTheCar();
}


class Toyota extends Abstraction{
	@Override
	public void startTheCar() {
		System.out.println("Break");
		System.out.println("Start button");
		System.out.println("Release the brake");
	}
	public static void main(String[] args) {
		//Abstarction obj = new Abstraction();
	}
}

class Tesla extends Abstraction{
	public void startTheCar() {
		System.out.println("Tesla, start the car!!!");
	}
	//regular class Must implement the abstract methods from the abstract class
}