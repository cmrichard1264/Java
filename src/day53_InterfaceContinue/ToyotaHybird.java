package day53_InterfaceContinue;

public class ToyotaHybird implements Cars, ElectricVehicles, GasVehicles {

	@Override
	public void PumpGas() {
		System.out.println("Pumping gas");
		
	}

	@Override
	public void Charge() {
		System.out.println("Charging");
		
	}

	@Override
	public void SelfDrive() {
		System.out.println("Self driving mode");
		
	}

	@Override
	public void start() {
		System.out.println("Push start button");
		
	}

	@Override
	public void SelfParking() {
		System.out.println("Selfparking");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
