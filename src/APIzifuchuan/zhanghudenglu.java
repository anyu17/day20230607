package APIzifuchuan;

import java.util.Scanner;

public class zhanghudenglu {
    public static void main(String[] args) {
        String rightuserID = "zhangsan";
        String userpassword = "123456";

        Scanner sr = new Scanner(System.in);
        System.out.println("请输入账号和密码");
        for(int i = 0; i < 3; i++){

            String torokuid = sr.next();
            String torokupassword = sr.next();
           if(torokuid .equals(rightuserID) && torokupassword .equals(userpassword)){
            System.out.println("登录成功");
            break;
        }else{
            if (i == 2 ) {
                System.out.println("您的账户被锁定");
                }else{
                System.out.println("登录失败,请重新输入" + "还剩" + (2 - i) + "次机会");
             }
            }
        }

    }
}
