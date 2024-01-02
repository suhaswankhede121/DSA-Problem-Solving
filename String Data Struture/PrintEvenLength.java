public class PrintEvenLength {
    public static void main(String[] args) {
        String str="Hell Worlds He";
        for(String i: str.split(" ")){
            if(i.length() % 2==0){
                System.out.println(i);
            }
        }
    }
}
