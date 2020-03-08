package _04_hospital;

public class Patient {
	
	boolean pulse = false;

	public boolean feelsCaredFor() {
		if (pulse == true) {
			return true;
		}
		return false;
	}

	public void checkPulse() {
		pulse = true;
	}

}
