package taxt;

import java.util.Random;

public class Role {
    //属性
    private String name;
    private int blood;
    private char gender;
    private String face;

    String [] boyface = {"帅气", "丑陋","高大,","瘦小",};
    String []grilface = {"美丽","漂亮","闭月","羞花","沉鱼"};
    String [] attack_deck = {
            "%s一拳%s",
            "%s飞起一脚%s",
            "%s一耳光%s",
            "%s一榔头s",
            "%s一叉子%s",
            "%s一折凳%s",
            "%s一木棍%s",
            "%s一铁头%s"

    };
    String [] shaoushang = {
            "%s淤青",
            "%s出血",
            "%s大出血",
            "%s吐血",
            "%s倒地",
            "%s抽搐",
            "%s昏迷",
            "%s噶了"
    };
        //空参构造
    public Role() {
    }
    //带参构造
    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender =gender;
        setFace(gender);//脸是由性别乱数生成,所以不用在括号里添加
    }
    public char getGender(){
        return gender;
    }
        //set输入性别
    public void setGender(char gender){
        this.gender = gender;
    }
        //测试输出脸
    public String getFace(){
        return face;
    }
        //输入脸 但脸是基于性别判断
    public void setFace (char gender){
        Random r = new Random();
        if(gender == '男'){
            int index = r.nextInt(boyface.length);
            this.face=boyface[index];
        }else if(gender == '女'){
            int index = r.nextInt(grilface.length);
            this.face = grilface[index];
        }else {
            this.face = "面目狰狞";
        }
    }

    //输出名字
    public String getName() {
        return name;
    }
        //输出名字
    public void setName(String name) {
        this.name = name;
    }
        //带参输出血量
    public int getBlood() {
        return blood;
    }
    //带参出输入血量
    public void setBlood(int blood) {
        this.blood = blood;
    }


        //构建方法, 输出动作
    public void attack(Role role) {
        //在动作组里随机生成动作
        Random r = new Random();
        int index = r.nextInt(attack_deck.length);
        String dongzuo = attack_deck[index];

        System.out.printf(dongzuo, this.getName(), role.getName());
        System.out.println();

        //动作生成后造成的血量
        int hurt = r.nextInt(20) + 1;
        int remainboold = role.getBlood() - hurt;
        //判断动作结束后被打对象的血量是否为零
        remainboold = remainboold < 0 ? 0 : remainboold;
        role.setBlood(remainboold);

        //对应的血量,输出的结果
        if (remainboold >= 90) {
            System.out.printf(role.getName(),shaoushang[0]);
        } else if (remainboold >= 70 && remainboold < 90) {
            System.out.printf(shaoushang[1],role.getName());
        } else if (remainboold >= 50 && remainboold < 70) {
            System.out.printf(shaoushang[2],role.getName());
        } else if (remainboold >= 40 && remainboold < 50) {
            System.out.printf(shaoushang[3],role.getName());
        } else if (remainboold > 30 && remainboold < 40) {
            System.out.printf(shaoushang[4],role.getName());
        }else if (remainboold >= 20&& remainboold < 30) {
            System.out.printf(shaoushang[5],role.getName());
        } else if (remainboold >= 10 && remainboold < 20) {
            System.out.printf(shaoushang[6],role.getName());
        }
        else {
            System.out.printf(shaoushang[7],role.getName());
        }
        //pritlf 是不会自动换行,要添加println,
        System.out.println();

        /*System.out.println(this.getName()+" 打了" +role.getName()+  +" 造成"+hurt
                    + role.getName()+"还剩"+remainboold);*/
    }
    // 向外输出属性
    public void showInfor(){
        System.out.println("姓名为" + getName());
        System.out.println("性别为" + getGender());
        System.out.println("血量为" + getBlood());
        System.out.println("相貌为" + getFace());
    }
}
