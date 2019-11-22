package day53_InterfaceContinue;

public class JeepWrangler implements Cars, GasVehicles {

	@Override
	public void PumpGas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		System.out.println("Insert the key");
		System.out.println("Start the car");
		
	}

	@Override
	public void SelfParking() {
		System.out.println("Selfparking");
		
	}

}
