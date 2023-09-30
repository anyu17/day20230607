package takusannrennshuu;

import java.util.Random;

public class rennshu {
    public static void main(String[] args) {
        char [] cas =new char [52];
        for (int i = 0; i < cas.length; i++) {
            if(i<=25){
            cas[i] = (char) (97 + i);
        }else {
            cas[i] = (char) (39 + i);
            }
        }
       String temp ="";
        Random Ran =new Random();
        for(int i=0;i <=3;i++){
        int randomin = Ran.nextInt(cas.length);
        //System.out.println(cas[randomin]);
            temp = temp + cas[randomin];
        }
        int num = Ran.nextInt(9);
        temp = temp + num;
        System.out.println(temp);
    }
}
