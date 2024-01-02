public class CheckRotateString {
    public static void main(String[] args) {
        String s1="abcd",s2="dabc";
        System.out.println(isRotate(s1, s2));
    }

    static boolean isRotate(String s1, String s2){
        if(s1==null || s2==null){
          return false;
        }else if(s1.length() !=s2.length()){
            return false;
        }else{
            String con=s1+s2;
            return con.contains(s2);
        }
    }
}
