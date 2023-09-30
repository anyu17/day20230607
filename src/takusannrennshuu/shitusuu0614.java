package takusannrennshuu;

public class shitusuu0614 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i =101;i <=200;i++){
            boolean falg =true;
            for (int j =2; j < i; j++){
                if ( i % j== 0){
                    falg =false;
                    break;
                }

            }
         if(falg){
                System.out.println("hai" +"  " + i);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
