package �ַ���;

import java.util.Scanner;

public class Test03Case02 {
    public static void main(String[] args) {

        String str;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("������һ����������λ�����ַ���");
           str = sc.next();

            boolean flag = checkstr(str);
            if (flag){
                break;
            }else{
                System.out.println("Υ���ַ�,����������");
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
            case '1' ->  "Ҽ";
            case '2' ->  "��";
            case '3' ->  "��";
            case '4' ->  "��";
            case '5' ->  "��";
            case '6' ->  "��";
            case '7' ->  "��";
            case '8' ->  "��";
            case '9' ->  "��";
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
