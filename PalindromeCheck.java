import java.util.*;

public class PalindromeCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String st="";
        for(int i=s.length()-1;i>=0;i--){
            st+=s.charAt(i);
        }
        if(s.equals(st))
             System.out.println(true);
        else
            System.out.println(false);

    }
}
