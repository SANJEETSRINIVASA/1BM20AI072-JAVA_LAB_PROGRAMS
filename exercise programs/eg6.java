import java.util.Scanner;

public class eg6 {

    public static int countWords(String str) {
        return str.split(" ").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str = sc.nextLine();
        int numOfWords = countWords(str);
        System.out.print("Number of words: " + numOfWords);
        System.out.println("\nUpper case: " + str.toUpperCase());
        sc.close();
    }
}
