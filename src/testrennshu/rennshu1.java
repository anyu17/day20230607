package testrennshu;

import java.util.Random;

public class rennshu1 {
    private String name;
    private int age;
    private int blood;
    private char gender;
    private String face;

    String [] boyface = {"˧��", "��ª", "����", "��׳", "��С", "�ɰ�", "����", "һ���Ѿ�"};

    String [] girlface = {"����", "�߻�", "����", "����", "��С", "�ɰ�", "����", "һ���Ѿ�"};




    String [] dongzuo= {
            "%s����һ��,����%s",
            "%s����һȭ����%s,",
            "%sɨ̷��,ɨ��%s",
            "%sЫ�Ӱ�β,��%s",
            "%s���,��%s",
            "%s����������,����%s",
            "%s����������,����%s",
            "%s���ӳ�ȭ,һȭ%s"
    };
    String [] attack1= {
            "%s���˻�",
            "%s����",
            "%s��Ѫ",
            "%s������",
            "%s��Ѫ",
            "%s����",
            "%s�鴤",
            "%s����"
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
        if (gender =='��' ) {
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
            System.out.printf(attack1[1]+ "��ʣ" + nokoru +"��Ѫ",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[2]+ "��ʣ" + nokoru +"��Ѫ",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[3]+ "��ʣ" + nokoru +"��Ѫ",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[4]+ "��ʣ" + nokoru +"��Ѫ",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[5]+ "��ʣ" + nokoru +"��Ѫ",role.getName());
        } else if (nokoru >= 70 && nokoru < 90) {
            System.out.printf(attack1[6]+ "��ʣ" + nokoru +"��Ѫ",role.getName());
        } else {
            System.out.printf(attack1[7]+ "��ʣ" + nokoru +"��Ѫ",role.getName());
        }
        System.out.println();
    }
    public void showInfor(){
        System.out.println("����Ϊ"+getName());
        System.out.println("����Ϊ"+getAge());
        System.out.println("Ѫ��Ϊ"+getBlood());
        System.out.println("�Ա�Ϊ"+getGender());
        System.out.println("����Ϊ"+getFace());
    }
}
