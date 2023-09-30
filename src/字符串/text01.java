package ×Ö·û´®;

import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        String getString = San();

        StringBuilder sb = new StringBuilder();
        sb.append(getString).reverse();

        String sb1 = sb.toString();
        System.out.println(sb1);
        boolean c = getString.equals(sb1);
        System.out.println(c);
    }
    public static String San(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ÇëÊäÈë");
        String r = sc.next();
        return r;
    }
}
