package training.assesment;

class SolarSystem {
    public void m1() {
        System.out.println("Solar System");
    }
}

class Earth extends SolarSystem {
    public void m2() {
        System.out.println("Earth");
    }
}

class Mars extends SolarSystem {
    public void m3() {
        System.out.println("Mars");
    }
}

class Moon extends Earth {
    public void m4() {
        System.out.println("Moon");
    }
}

public class Runner {
    public static void main(String[] args) {
        Mars mars = new Mars();

        mars.m1();
        
        Moon moon = new Moon();
        moon.m2();

    }
}

