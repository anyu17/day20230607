package zifuchuan;

import java.util.Scanner;

public class text005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("«Î ‰»Î");
        String talk = sc.next();

        String [] arr ={"CNM","SB","SX"};

        for (int i = 0; i < arr.length; i++){
                 talk = talk.replace(arr[i],"**");
        }
        System.out.println(talk);
    }
}

