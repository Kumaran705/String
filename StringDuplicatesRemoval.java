import java.util.*;

class StringDuplicatesRemoval  {
    String removeDuplicates(String s) {
        
        Set<Character> st = new LinkedHashSet<>();
        
        for(char c : s.toCharArray()){
            st.add(c);
        }
        
        StringBuilder ss = new StringBuilder();
        
        for(char c : st){
            ss.append(c);
        }
        
        return ss.toString();
    }
}
