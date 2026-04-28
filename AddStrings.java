import java.math.BigInteger;
class AddStrings {
    public String addStrings(String num1, String num2) {
       BigInteger b = new BigInteger(num1);
       BigInteger b1 = new BigInteger(num2);
       BigInteger b2=b.add(b1);
       return b2.toString();
        
    }
}