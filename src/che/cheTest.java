package che;

import java.util.Scanner;

public class cheTest {
    public static void main(String[] args) {
        //建立数组
        che [] arr = new che[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            che c = new che();//注意点这个构建对象一定要放在For循环里,否则运行不正确
            System.out.println("请输入价格");
            double qian = sc.nextDouble();
            c.setJiage(qian);

            System.out.println("品牌");
            String pinpai = sc.next();
            c.setPinpai(pinpai);

            System.out.println("颜色");
            String yanse = sc.next();
            c.setYanse(yanse);//注意这个键盘输入的数值是要对应相应的输入对象
            arr[i] = c;//这个是将键盘输入的数值建立联系
        }

        for(int i = 0; i < arr.length ; i++){
            che car=arr[i];
            System.out.println(car.getJiage()+ "   "+ car.getPinpai()
                    +"  " + car.getYanse());
        }
    }
}
