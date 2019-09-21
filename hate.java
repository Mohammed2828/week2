import java.util.Scanner;

public class hate {
    public static void main(String[] args) {

        System.out.println(" write a sentence to change the word hate to love");
        System.out.println(" enter sentence with word ' hate '");
        Scanner keyboard= new Scanner(System.in);
        String sentence= keyboard.nextLine();
        String replace= sentence.replace (" hate", " love");
        System.out.println(" your sentence "+ replace);
    }
}
