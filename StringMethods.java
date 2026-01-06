import java.util.*;
public class  StringMethods {
public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      System.out.println("The Length of the String iss : "+ s.length());
      System.out.println("To check whether the String is Empty : "+s.isEmpty());
      System.out.println("Char at Index 0 of the String : "+s.charAt(0));
      System.out.println("Checking Whether String letter a : " +s.contains("a"));
      System.out.println("Prints the String the Index to End : "+s.substring(1));
      System.out.println("Prints the String between specified indices: "+s.substring(1,2));
      System.out.println("Concats the String With Itself :"+s.concat(s));
      System.out.println("String converted to Uppercase : "+s.toUpperCase());
      System.out.println("String converted to Lowercase : "+s.toLowerCase());
      System.out.println("Removes spaces present at the start and ending of the String : "+s.trim());
      String reverse = new StringBuilder(s).reverse().toString();
      System.out.println("Checking whether the String is Palindrome : ");
      System.out.println("Palindrome : "+s.equals(reverse)); 
}
}
