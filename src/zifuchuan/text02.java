package zifuchuan;

import java.util.Scanner;

public class text02 {
    public static void main(String[] args) {
        String M = arr();
        System.out.println(M);
    }


    public static String arr() {
            System.out.println("ÇëÊäÈë");
            Scanner sc = new Scanner(System.in);
            String danngo = sc.next();
            String result = "";
            for (int j = danngo.length() - 1; j >= 0; j--) {
                char c = danngo.charAt(j);
                result = result + c;
            }
            return result;
        }
}