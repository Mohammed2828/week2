import java.util.Scanner;

public class wells {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double d1,d2,d3;
        System.out.println( "what is the depth of the well");
        d1= keyboard.nextInt();
        System.out.println("what is the radius of the well ");
        d2= keyboard.nextInt();
        d2=d2/12;
        d3=3.14*d2*d2*d1;
        d3=d3*7.48;
        System.out.println(" The wall can hold "+ d3 +" gallon of water");

    }
}
