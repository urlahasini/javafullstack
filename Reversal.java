import java.util.Scanner;
public class Reversal {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String s= sc.next();
String r = reversed(s);
System.out.println("reversed string is:"+r);


}
public static String reversed(String s){
String reversed=" ";
for(int i=s.length()-1;i>=0;i--){
reversed+=s.charAt(i);
}
return reversed;
}
