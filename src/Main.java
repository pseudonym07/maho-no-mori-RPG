import java.util.*;
//This could be a cool fleshed out game idea.











public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        TitleScreen.display();
        scan.nextLine();
        Toolbox.clearScreen();
        Scanner scan = new Scanner(System.in);
        System.out.println("Greetings traveler. You wish to become a merchant, yes?");
        System.out.println("");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1) + ", is it? Very good. Let us continue.");
    }
}