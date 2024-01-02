import java.util.Map;
import java.util.TreeMap;

public class CountFreUppVov {
    public static void main(String[] args) {
        String s="Hello i am Suhas";
        WordCount(s);
        isVovelCount(s);
        isUpper(s);
        frequencyCount(s);
    }

    static void WordCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
            case ' ':
            case '.':
            count++;
            
          }
        }
       System.out.println("no of word count is "+count);
    }

    static void isVovelCount(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            count++;
            
          }
        }
        System.out.println("No of vovel is "+count);
    }

    static void isUpper(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           if(ch>=65 && ch<=90){
            count++;
           }
        }
        System.out.println("No of Upper case "+count);
    }

    static void frequencyCount(String s){
      Map<Character,Integer> map=new TreeMap<>();
      for(int i=0;i<s.length();i++){
        Integer count=map.get(s.charAt(i));
        if(map.get(s.charAt(i))==null){
            map.put(s.charAt(i), 1);
        }else{
            map.put(s.charAt(i),++count);
        }
              System.out.println("Frequency is "+count);
      }

    }
}
