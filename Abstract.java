import Verhicle.*;

class Car extends Verhicle {

    public void print_name(){
        System.out.println("Test");
    }

    public static void main(String[] args){
        Car car1 = new Car();
        car1.print_name();
    }
}
