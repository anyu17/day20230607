package ×Ö·û´®;

import java.util.Scanner;

public class Test03Case01 {
    public static void main(String[] args) {

        String str;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ÇëÊäÈëÒ»¸ö²»³¬¹ı¾ÅÎ»ÊıµÄ×Ö·û´®");
           str = sc.next();

            boolean flag = checkstr(str);
            if (flag){
                break;
            }else{
                System.out.println("Î¥¹æ×Ö·û,ÇëÖØĞÂÊäÈë");
                continue;
            }
        }
       StringBuilder sb = new StringBuilder();
        for(int i =0; i <str.length() ; i++){
            char c = str.charAt(i);
            int number = c - 48 ;
            String LuoMa = changeLuoMa(number);
            sb.append(LuoMa).reverse();
        }
        String temp = sb.toString();
        System.out.println(temp);
    }

    public  static String changeLuoMa(int number){
        String[] arr = {"X",","Ò¼"·¡","Èş","ËÁ","Îé","öÌ","Æâ","°Æ","¾Á"};
        return arr[number];
    }


    public static boolean checkstr(String str){
        if(str.length() >= 9){
            return false;
        }

        for(int i =0; i < str.length(); i++){
            char c = str.charAt(i);
            if( c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
