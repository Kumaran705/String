import java.util.*;
public class VowelCheck{
    private static void printVowels(String a){
          for(int i=0;i<a.length();i++){
                  char  ch=a.charAt(i);
                  if("aeiouAEIOU".indexOf(ch)!=-1){
                             System.out.println(ch+"");
}
}
}
public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String : ");
      String str=sc.nextLine();
      printVowels(str);
  }
}
                
