package day48_MethodOverRiding;

class Mahribana{
	public void methodA() {
		System.out.println("Method A");
	}
	
	public String methodB() {
		return "A";
	}
	
	protected double salary(double bonus) {
		return bonus + 100000;
	}

}

public class AccessModifiers extends Mahribana {
	@Override
	protected double salary(double bonus) {
		return bonus + 200000;
	}
	
    /* @Override
	void methodA() {
		
	}
	override method access modifiers need to be same or more visible
	*/
	@Override
	public void methodA() {
		System.out.println("Method A");
	}
	@Override
	public String methodB() {
		return "C";
	}
	
	
	
}
