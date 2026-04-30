import java.util.*;

class StringDuplicatesRemoval  {
    String removeDuplicates(String s) {
        
        Set<Character> st = new LinkedHashSet<>();
        
        for(char c : s.toCharArray()){
            st.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : st){
            sb.append(c);
        }
        
        return sb.toString();
    }
}