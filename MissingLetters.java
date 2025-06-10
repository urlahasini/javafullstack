import java.util.*;
public class MissingLetters {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String input = sc.nextLine().toLowerCase();
boolean[] present = new boolean[26];
for (char ch : input.toCharArray()) 
{
if (ch >= 'a' && ch <= 'z') 
{
  present[ch - 'a'] = true;
}
}
System.out.print("Missing letters: ");
boolean anyMissing = false;
for (int i = 0; i < 26; i++) {
if (!present[i]) {
System.out.print((char)(i + 'a') + " ");
anyMissing = true;
}
}
if (!anyMissing) 
{
System.out.print("None. All letters are present.");
}
sc.close();
}
}