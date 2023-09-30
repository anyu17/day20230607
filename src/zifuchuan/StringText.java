package zifuchuan;

import java.util.Scanner;

public class StringText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("ÇëÊäÈë");
             money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("ÇëÖØÐÂÊäÈë");
            }
        }
        String numberStr = "";
        while (true){
            int  ge = money % 10 ;
            String onum = getindex(ge);
           numberStr =  onum + numberStr ;

            money = money / 10 ;


            if(money == 0){
                break;
            }
        }
        int count = 7 - numberStr.length();
        for(int i = 0; i < count; i++){
             numberStr = "Áã" + numberStr;
        }
        String [] arr = {"°Ù","Ê®","Íò","Ç§","°Ù","Ê®","Ôª"};

        String result = "";
        for (int i = 0; i < numberStr.length(); i++){
            char c = numberStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);


        //System.out.println( numberStr );

    }
    public static String getindex(int number){
        String  []onum ={"Áã","Ò¼","·¡","Èþ","ËÁ","Îé","öÌ","Æâ","°Æ","¾Á"};
        return onum[number];
    }

}
