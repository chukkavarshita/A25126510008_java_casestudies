import java.util.Scanner;
public class StringAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        int words = 0, vowels = 0, consonants = 0, spaces = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == ' ') {
                spaces++;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        if (str.length() > 0) {
            words = spaces + 1;
        }
        System.out.println("Number of Words = " + words);
        System.out.println("Number of Vowels = " + vowels);
        System.out.println("Number of Consonants = " + consonants);
        System.out.println("Number of Spaces = " + spaces);
        sc.close();
    }
}
