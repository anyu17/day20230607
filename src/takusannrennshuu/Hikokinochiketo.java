package takusannrennshuu;

import java.util.Scanner;

public class Hikokinochiketo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chikettowonyuryokushite");
        int ticket = sc.nextInt();
        System.out.println("nannogetu");
        int month = sc.nextInt();
        System.out.println("taikainedannka,yasui");
        System.out.println("F,1,S 2");
        int seat = sc.nextInt();


       if(month >=5 && month <=10){
          ticket = sum(ticket, seat,0.9,0.8);
       }else if((month >=1 && month <= 4) || (month >=11 && month <=12)){
           ticket = sum(ticket, seat,0.7,0.65);
       }else{
           System.out.println("getugamachigai");
       }
        System.out.println(ticket);
    }
    public static int sum(int ticket,int seat,double v1,double v2){
        if(seat==1){
            ticket= (int)(ticket *v1);
        }else if(seat ==2){
            ticket= (int)(ticket *v2);
        }else {
            System.out.println("nedanngamachigai");
        }
            return ticket;

    }
}
