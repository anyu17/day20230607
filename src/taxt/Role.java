package taxt;

import java.util.Random;

public class Role {
    //����
    private String name;
    private int blood;
    private char gender;
    private String face;

    String [] boyface = {"˧��", "��ª","�ߴ�,","��С",};
    String []grilface = {"����","Ư��","����","�߻�","����"};
    String [] attack_deck = {
            "%sһȭ%s",
            "%s����һ��%s",
            "%sһ����%s",
            "%sһ��ͷs",
            "%sһ����%s",
            "%sһ�۵�%s",
            "%sһľ��%s",
            "%sһ��ͷ%s"

    };
    String [] shaoushang = {
            "%s����",
            "%s��Ѫ",
            "%s���Ѫ",
            "%s��Ѫ",
            "%s����",
            "%s�鴤",
            "%s����",
            "%s����"
    };
        //�ղι���
    public Role() {
    }
    //���ι���
    public Role(String name, int blood,char gender) {
        this.name = name;
        this.blood = blood;
        this.gender =gender;
        setFace(gender);//�������Ա���������,���Բ��������������
    }
    public char getGender(){
        return gender;
    }
        //set�����Ա�
    public void setGender(char gender){
        this.gender = gender;
    }
        //���������
    public String getFace(){
        return face;
    }
        //������ �����ǻ����Ա��ж�
    public void setFace (char gender){
        Random r = new Random();
        if(gender == '��'){
            int index = r.nextInt(boyface.length);
            this.face=boyface[index];
        }else if(gender == 'Ů'){
            int index = r.nextInt(grilface.length);
            this.face = grilface[index];
        }else {
            this.face = "��Ŀ����";
        }
    }

    //�������
    public String getName() {
        return name;
    }
        //�������
    public void setName(String name) {
        this.name = name;
    }
        //�������Ѫ��
    public int getBlood() {
        return blood;
    }
    //���γ�����Ѫ��
    public void setBlood(int blood) {
        this.blood = blood;
    }


        //��������, �������
    public void attack(Role role) {
        //�ڶ�������������ɶ���
        Random r = new Random();
        int index = r.nextInt(attack_deck.length);
        String dongzuo = attack_deck[index];

        System.out.printf(dongzuo, this.getName(), role.getName());
        System.out.println();

        //�������ɺ���ɵ�Ѫ��
        int hurt = r.nextInt(20) + 1;
        int remainboold = role.getBlood() - hurt;
        //�ж϶��������󱻴�����Ѫ���Ƿ�Ϊ��
        remainboold = remainboold < 0 ? 0 : remainboold;
        role.setBlood(remainboold);

        //��Ӧ��Ѫ��,����Ľ��
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
        //pritlf �ǲ����Զ�����,Ҫ���println,
        System.out.println();

        /*System.out.println(this.getName()+" ����" +role.getName()+  +" ���"+hurt
                    + role.getName()+"��ʣ"+remainboold);*/
    }
    // �����������
    public void showInfor(){
        System.out.println("����Ϊ" + getName());
        System.out.println("�Ա�Ϊ" + getGender());
        System.out.println("Ѫ��Ϊ" + getBlood());
        System.out.println("��òΪ" + getFace());
    }
}
