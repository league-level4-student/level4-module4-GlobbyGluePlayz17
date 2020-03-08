package _04_hospital;

import java.util.ArrayList;

public class Doctor extends HospitalTest{
	
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public boolean performsSurgery() {
		return false;
	}
	
	public boolean makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) {
		patients.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public void doMedicine() {
		for (int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}		
	}

}
