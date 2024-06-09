package oops.encapsulation;

class SmartPhone {

	// Step 1 : Make instance variables private
	private int storage;
	private String model;

	// Step 2: Write public setter methods with validation checks if necessary
	public void setStorage(int phoneStorage) {
		if (phoneStorage < 100 || phoneStorage > 256) {
			storage = 100;
		} else {
			storage = phoneStorage;
		}
	}

	public void setModel(String phoneModel) {
		model = phoneModel;
	}

	// Step 3: Write public getter methods
	public int getStorage() {
		return storage;
	}

	public String getModel() {
		return model;
	}
}

public class Encapsulation {

	public static void main(String args[]) {

		// Instantiating an object phone belonging to the SmartPhone class
		SmartPhone phone = new SmartPhone();

		// calling the method setStorage on phone
		phone.setStorage(150);

		// calling the method setMode1 on phone
		phone.setModel("Iphone");

		System.out.println(phone.getModel());
		System.out.println(phone.getStorage());

	}
}
