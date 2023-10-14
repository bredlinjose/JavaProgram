package training.assesment;

public class Laptop {
	private int ram;
    private double battery;
    private int hd;
	

	public Laptop(int ram, double battery, int hd) {
		super();
		this.ram = ram;
		this.battery = battery;
		this.hd = hd;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public double getBattery() {
		return battery;
	}


	public void setBattery(double battery) {
		this.battery = battery;
	}


	public int getHd() {
		return hd;
	}


	public void setHd(int hd) {
		this.hd = hd;
	}


	public static void main(String[] args) {
		Laptop lap = new Laptop(8, 100, 512);
		System.out.println("Ram: "+lap.getRam());
		lap.setRam(16);
		System.out.println("Ram: "+lap.getRam());
		
		System.out.println("Battery "+ lap.getBattery());
		lap.setBattery(96.05);
		System.out.println("Battery "+ lap.getBattery());
		
		System.out.println("Hard disk "+ lap.getHd());
		lap.setHd(752);
		System.out.println("Hard disk "+ lap.getHd());
		
	}

}
