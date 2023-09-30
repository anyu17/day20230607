package ×Ö·û´®;

import java.util.Scanner;

public class Test03Case02 {
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
            String LuoMa = changeLuoMa(c);
            sb.append(LuoMa).reverse();
        }
        String temp = sb.toString();
        System.out.println(temp);
    }

    public  static String changeLuoMa(char number){

        String str = switch(number){
            case '0' ->  "x";
            case '1' ->  "Ò¼";
            case '2' ->  "·¡";
            case '3' ->  "Èş";
            case '4' ->  "ËÁ";
            case '5' ->  "Îé";
            case '6' ->  "öÌ";
            case '7' ->  "Æâ";
            case '8' ->  "°Æ";
            case '9' ->  "¾Á";
            default ->  "";
        };
        return str;
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
