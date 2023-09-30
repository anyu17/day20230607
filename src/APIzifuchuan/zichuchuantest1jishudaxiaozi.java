package APIzifuchuan;

import java.util.Scanner;

public class zichuchuantest1jishudaxiaozi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();

        int conut1 = 0;
        int conut2 = 0;
        int conut3 = 0;

        for(int i =0; i <temp.length(); i++){
            char temp1 = temp.charAt(i);
            if( temp1 >='a' && temp1 <= 'z'){
                conut1++;
            }else if(temp1 >= 'A' && temp1 <= 'Z'){
                conut2++;
            }else if (temp1 >= '0' && temp1 <= '9'){
                conut3++;
            }
        }
        System.out.println(conut1);
        System.out.println(conut2);
        System.out.println(conut3);
    }
}
