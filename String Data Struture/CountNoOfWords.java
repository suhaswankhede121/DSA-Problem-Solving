public class CountNoOfWords {
    public static void main(String[] args) {
       String s="welcome to dyp";
       System.out.println(countNoOfWords(s));
    }

    static int countNoOfWords(String s){  // welcome to dyp
        int count=0;
        if(s.charAt(0) !=' '){
            count++;
        }
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) ==' ' && s.charAt(i+1) != ' '){
                    count++;
                }
            }
        return count;
    }
}
