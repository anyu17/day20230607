package hohoDom;

public class choyoDom {
    public static void main(String[] args) {
       char [] sum = new char[52];
       for(int i=0;i < sum.length;i++){
           if (i <= 25){
               sum [i] = (char)(97 + i);
           }else{
               sum [i] =(char) (39 + i );
           }
       }
       for(int i=0; i<sum.length;i++){
           System.out.print(sum[i] + "  ");
       }
    }
}