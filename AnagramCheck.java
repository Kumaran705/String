import java.util.*;
public class AnagramCheck{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        String a=sc.nextLine().toLowerCase();
        String b=sc.nextLine().toLowerCase();
        char [] x=a.toCharArray();
        char [] y=b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
       if(Arrays.equals(x,y))
           System.out.println(true);
       else
            System.out.println(false);
}
}
