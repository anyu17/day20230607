package testrennshu;

public class rennshu1Test {
    public static void main(String[] args) {
        rennshu1 r1 = new rennshu1("Ï²ÑóÑó", 18, 100,'ÄÐ');
        rennshu1 r2 = new rennshu1("·ÐÑóÑó", 18, 100,'ÄÐ');

        r1.showInfor();
        r2.showInfor();
     while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "KO" + r2.getName());
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "KO" + r1.getName());
                break;
            }
        }
    }
}
