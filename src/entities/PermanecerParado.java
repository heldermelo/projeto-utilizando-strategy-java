package entities;

public class PermanecerParado implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Permaneceu parado.");
	}

}
