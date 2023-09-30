package taxt;

public class Gametest {
    public static void main(String[] args) {
        //角色相应属性,并且带参构造里面相应参数
        Role r1 = new Role("乔峰",100,'男');
        Role r2 = new Role("鸠摩智",100,'男');
        //用角色属性的相应方法
        r1.showInfor();
        r2.showInfor();
        //利用while循环实现动作
        while (true) {
            //r1动作与2
            r1.attack(r2);
            //判断动作结束后R2的血量,为零则游戏结束
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "KO" + r2.getName());
                break;
            }
            //判断动作结束后R2的血量,为零则游戏结束
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "KO" + r1.getName());
                break;
            }

        }
    }
}
