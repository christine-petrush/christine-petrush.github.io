//Christine Petrush
//IT-145 module 4 pet.java class file

package pet;

public class Pet {

	//Instance fields
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	
	//Constructor
	public Pet (String t, String n, int a, int s) {
		petType = t;
		petName = n;
		petAge = a;
		daysStay = s;
	}
	
	//Mutators
	public void setPetType(String t) {
		petType = t;
	}
	
	public void setPetName(String n) {
		petName = n;
	}
	
	public void setPetAge(int a) {
		petAge = a;
	}
	
	public void setDogSpaces(int ds) {
		dogSpaces = ds;
	}
	
	public void setCatSpaces(int cs) {
		catSpaces = cs;
	}
	
	public void setDaysStay(int s) {
		daysStay = s;	
	}	
	
	public void setAmountDue(double ad) {
		amountDue = ad;
	}
	
	//Accessors
	public String getPetType() {
		return petType;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public int getDogSpaces() {
		return dogSpaces;
	}
	
	public int getCatSpaces() {
		return catSpaces;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public double getAmountDue() {
		return amountDue;
	}
}
