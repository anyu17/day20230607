package taxt;

public class Gametest {
    public static void main(String[] args) {
        //��ɫ��Ӧ����,���Ҵ��ι���������Ӧ����
        Role r1 = new Role("�Ƿ�",100,'��');
        Role r2 = new Role("�Ħ��",100,'��');
        //�ý�ɫ���Ե���Ӧ����
        r1.showInfor();
        r2.showInfor();
        //����whileѭ��ʵ�ֶ���
        while (true) {
            //r1������2
            r1.attack(r2);
            //�ж϶���������R2��Ѫ��,Ϊ������Ϸ����
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "KO" + r2.getName());
                break;
            }
            //�ж϶���������R2��Ѫ��,Ϊ������Ϸ����
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "KO" + r1.getName());
                break;
            }

        }
    }
}
