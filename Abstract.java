abstract class Verhicle {
    public Verhicle() {
        String name;
    }

    abstract public void print_name();
    
}

class Car extends Verhicle {

    @Override public void print_name(){
        System.out.println("Test");
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.print_name();
    }
}