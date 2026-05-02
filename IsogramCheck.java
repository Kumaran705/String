import java.util.*;
public class IsogramCheck {
    static boolean isIsogram(String data) {
        Set<Character> s = new HashSet<>();
        for (char c : data.toCharArray()) {
            if (s.contains(c)) {
                return false; 
            }
            seen.add(c);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(isIsogram(data));
    }
}
