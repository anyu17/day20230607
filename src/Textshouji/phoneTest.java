package Textshouji;

public class phoneTest {
    public static void main(String[] args) {
        phone []arr = new phone[3];

        phone P1 = new phone("С��",1.1,"��");
        phone P2 = new phone("ƻ��",2.2,"��");
        phone P3 = new phone("��Ϊ",3.3,"��");

        arr[0] = P1;
        arr[1] = P2;
        arr[2] = P3;

        double temp = 0;

        for(int i = 0; i <arr.length; i++){
            phone phone =arr[i];
            //double sum = arr[i].getjiage();
            temp = temp + phone.getjiage();
        }
        //System.out.println(temp);
        double pingjun = temp / arr.length;
        System.out.println(pingjun);
    }
}
