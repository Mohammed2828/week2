import java.util.Scanner;

public class sillysentence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner( System.in);
        System.out.println("what is your favorite 'color' ");
         String sentence = keyboard.nextLine();
        System.out.println("what is your favorite 'food' ");
        String sentence2= keyboard.nextLine();
        System.out.println("what is your favorite 'animal' ");
        String sentence3= keyboard.nextLine();
        System.out.println("what is your best friend 'name' ");
        String sentence4= keyboard.nextLine();
        System.out.println(" I had dream that " + sentence4 + " ate "+ sentence +" "+ sentence3 +
                " and said it taste like" +" "+ sentence2 );

    }
}
