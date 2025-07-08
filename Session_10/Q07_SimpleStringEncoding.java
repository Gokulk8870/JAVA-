package Session_10;

import java.util.Scanner;

public class Q07_SimpleStringEncoding {

    /**
     * This program reads a five-letter word from the user and encodes 
     * it by subtracting 1 from the ASCII value of each character. 
     * It then prints the newly encoded word.
     * 
     * Input / Output Example:
     * Input:  white
     * Output: vghsd
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-letter word: ");
        String s = sc.next();

        if (s.length() != 5) {
            System.out.println("Please enter a five letter word.");
            return;
        }

        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ch = (char)(ch - 1);  // Subtract 1 from ASCII
            encoded.append(ch);
        }

        System.out.println("Encoded Word: " + encoded.toString());
        sc.close();
    }
}