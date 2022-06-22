class Main {
    int x;

    static void prining_hello(){
        System.out.println("prining_hello!");
    }

    public Main(){
        x = 10;
    }

    public static void main (String [] args) {
        Main object1 = new Main();
        System.out.println(object1.x);
        object1.prining_hello();

    }
}