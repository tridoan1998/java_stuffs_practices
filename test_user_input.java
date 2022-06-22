import java.util.Scanner;

class User_Input {
    public static void get_user_input(){
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter username: ");

        String username = user_input.nextLine();
        System.out.println("You entered: "+ username);
    }

    public static void main(String[] args) {
        get_user_input();
    }
}