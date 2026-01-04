import
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder sb=new StringBuilder(a).reverse();
        StringBuffer sf=new StringBuffer(sb).reverse();
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        System.out.println(a+" "+sb+" "+sf+" "+b);
    }
}