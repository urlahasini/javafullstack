package javafullstack;
import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		//a quick brown fox jumps over the lazy dog
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a sentence:");
		        String input = sc.nextLine();
		        int[] alphabet = new int[26];
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            if (ch >= 'a' && ch <= 'z') {
		                alphabet[ch - 'a'] = 1;
		            }
		        }
		        boolean allPresent = true;
		        System.out.println("Missing alphabets:");
		        for (int i = 0; i < 26; i++) {
		            if (alphabet[i] == 0) {
		                System.out.print((char)(i + 'a') + " ");
		                allPresent = false;
		            }
		        }
		        if (allPresent) {
		            System.out.println("None (All alphabets are present)");
		      }
		}
}