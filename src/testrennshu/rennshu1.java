package testrennshu;

import java.util.Random;

public class rennshu1 {
    private String name;
    private int age;
    private int blood;
    private char gender;
    private String face;

    String [] boyface = {"帅气", "丑陋", "狰狞", "健壮", "瘦小", "可爱", "歪嘴", "一言难尽"};

    String [] girlface = {"闭月", "羞花", "沉鱼", "落雁", "较小", "可爱", "无语", "一言难尽"};




    String [] dongzuo= {
            "%s飞起一脚,踢了%s",
            "%s跳起一拳打了%s,",
            "%s扫谭腿,扫了%s",
            "%s蝎子摆尾,摆%s",
            "%s肘击,顶%s",
            "%s闪电五连鞭,鞭了%s",
            "%s弹抖五莲鞭,鞭了%s",
            "%s弓子冲拳,一拳%s"
    };
    String [] attack1= {
            "%s晃了晃",
            "%s淤青",
            "%s淤血",
            "%s揉了揉",
            "%s吐血",
            "%s倒地",
            "%s抽搐",
            "%s昏死"
    };


    public rennshu1(){
    }
    public rennshu1(String name,int age, int blood,char gender){
        this.name = name;
        this.age = age;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }
    public char getGender(){
        return gender;
    };
    public void setGender(char gender){
        this.gender =gender;
    }

    public  String getFace(){
        return face;
    }

    public void setFace(char gender){
        Random r = new Random();
        if (gender =='男' ) {
            int index = r.nextInt(boyface.length);
            this.face =boyface[index];
        } else{
            int index = r.nextInt(girlface.length);
            this.face =girlface[index];
        }
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age =age;
    }
    public int getBlood() {
        return blood;
    }
    public  void setBlood(int blood){
        this.blood = blood;
    }

    public void attack(rennshu1 role) {
        Random r = new Random();
        int index = r.nextInt(dongzuo.length);
        String sum = dongzuo[index];
        System.out.printf(sum, this.getName(), role.getName());
        System.out.println();


        int index1 = r.nextInt(20) + 1;
        int nokoru = role.getBlood() - index1;
        nokoru = nokoru < 0 ? 0 : nokoru;
        role.setBlood(nokoru);

        if (nokoru >= 90) {
            System.out.printf( attack1[0],role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[1]+ "还剩" + nokoru +"点血",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[2]+ "还剩" + nokoru +"点血",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[3]+ "还剩" + nokoru +"点血",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[4]+ "还剩" + nokoru +"点血",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[5]+ "还剩" + nokoru +"点血",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[6]+ "还剩" + nokoru +"点血",role.getName());
        } else {
            System.out.printf(attack1[7]+ "还剩" + nokoru +"点血",role.getName());
        }
        System.out.println();
    }
    public void showInfor(){
        System.out.println("姓名为"+getName());
        System.out.println("年龄为"+getAge());
        System.out.println("血量为"+getBlood());
        System.out.println("性别为"+getGender());
        System.out.println("长相为"+getFace());
    }
}
