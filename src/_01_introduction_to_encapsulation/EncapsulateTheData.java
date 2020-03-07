package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static void main(String[] args) {
//		EncapsulateTheData etd1 = new EncapsulateTheData();
//		etd1.getDegreesTurned();
	}

	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		if (itemsReceived < 0) {
			itemsReceived = 0;
		} 
		this.itemsReceived = itemsReceived;
	}
	
	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setDegreesTurned(float degreesTurned) {
		if (degreesTurned < 0) {
			degreesTurned = 0;
		}
		if (degreesTurned > 360) {
			degreesTurned = 360;
		}
		
		this.degreesTurned = degreesTurned;
	}
	
	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		if (nomenclature == "") {
			nomenclature = " ";
		}
		
		this.nomenclature = nomenclature;
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
		if (memberObj instanceof String) {
			memberObj = new Object();
		}
		this.memberObj = memberObj;
	}
	
	@Test
	public void check() {
		setItemsReceived(-34);
		assertEquals(0, getItemsReceived());
		setDegreesTurned(450);
		assertEquals(360, getDegreesTurned());
		setNomenclature("");
		assertEquals(" ", getNomenclature());
		setMemberObj("string");
		assertEquals(false, getMemberObj() instanceof String);
	}
}
