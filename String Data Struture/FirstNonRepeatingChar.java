import java.util.LinkedHashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;
import javax.swing.RowFilter.Entry;

class FirstNonRepeatingChar{
    public static void main(String[] args) {
        String s1="aabbcdefg";
        System.out.println(getNonRepeatingChar(s1));
    }

    static char getNonRepeatingChar(String str){
        Map<Character,Integer> count=new LinkedHashMap<Character,Integer>(str.length());
        for(char ch:str.toCharArray()){
            count.put(ch, count.containsKey(ch) ? count.get(ch)+1:1);
        }

       for (java.util.Map.Entry<Character, Integer> entry: count.entrySet()){
          if(entry.getValue()==1){
            return entry.getKey();
          }
       }
       throw new RuntimeErrorException(null, "Not found");
    }
}