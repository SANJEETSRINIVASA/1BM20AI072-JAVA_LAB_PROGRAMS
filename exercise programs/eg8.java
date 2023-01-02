public class eg8{

    public static String removeVowels(String str) {
        return str.replaceAll("[BCDFGHJKLMNPQRSTVXZbcdfghjklmnpqrstvxz]", "");
    }

    public static void main(String[] args) {
        String str = "Hello, have a good day";
        System.out.println("Original String: " + str);
        System.out.println("After removing Vowels: " + removeVowels(str));
    }
}
