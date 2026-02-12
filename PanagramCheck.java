import java.util.*;
public class PanagramCheck {
    public boolean panaGram(String s){
            s=s.toLowerCase();
            for(char i='a';i<='z';i++){
                if(!s.contains(String.valueOf(i))){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        PanagramCheck pc=new PanagramCheck();
        System.out.println(pc.panaGram(s));

    }
    
}
