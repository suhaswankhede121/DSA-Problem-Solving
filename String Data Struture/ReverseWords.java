import javax.swing.text.html.HTMLDocument.Iterator;

public class ReverseWords {
    public static void main(String[] args) {
       String s="Hello World";
       String ss[]=s.split(" ");
       for(int i=ss.length-1;i>=0;i--){
        System.out.println(ss[i]);
       }
       StringBuilder sb=new StringBuilder();
       sb.append(ss[0]);
       sb.append(ss[1]);
       System.out.println(sb.reverse());
    }
}
