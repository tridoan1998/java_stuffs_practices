class Main {
    int x;

    //constructor
    public Main(){
        
    }
    
    //setter
    public void setX(int x) {
        this.x = x;
    }

    //getter
    public int getX() {
        return this.x;
    }
     


    static void prining_hello(){
        System.out.println("prining_hello!");
    }

    public static void main (String [] args) {
        Main object1 = new Main();
        System.out.println(object1.x);
        object1.setX(20);
        System.out.println(object1.getX());
        //object1.prining_hello();

    }
}