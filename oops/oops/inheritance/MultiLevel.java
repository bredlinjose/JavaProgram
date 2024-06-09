package oops.inheritance;

class Wild_Animal {
	void eat() {
		System.out.println("Animal is hunting");
	}
}

class Lion extends Wild_Animal {
	void roar() {
		System.out.println("Lion is roaring");
	}
}

class BabyLion extends Lion {
	void weep() {
		System.out.println("Baby Lion is weeping");
	}
}

public class MultiLevel {
	public static void main(String[] args) {
		BabyLion d = new BabyLion();
		d.eat();
		d.roar();
		d.weep();
	}
}