public class Reverse {
    public static void main(String[] args) {
        String str="java";
        String temp=str;
        String rev="";
        for( int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        if(temp.equals(rev)){
            System.out.println(temp+" is palindrom");
        }else{
            System.out.println(temp+" is not palindrome");
        }
    }
}
