public class CountLengthOfEachWord {
    public static void main(String[] args) {
        String s="Hello World";
        countWordLength(s);
    }

    static void countWordLength(String str){
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            String s="";
            while(i<ch.length && ch[i] !=' '){
                     s+=ch[i];
                     i++;
            }
            if(s.length()>0){
                System.out.println(s.length());
            }
        }
    }
}
