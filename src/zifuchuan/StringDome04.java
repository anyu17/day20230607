package zifuchuan;

public class StringDome04 {
    public static void main(String[] args) {
        // ����ID
        String id = "230225199308234615";

        //��ȡ������Ϣ
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("����������:" + year + "��" + month + "��" + day +"��");

        char c = id.charAt(17);
        int getNumber = c - 48;
        if(getNumber % 2 ==0){
            System.out.println("�Ա�:Ů");
        }else{
            System.out.println("�Ա�:��");
        }
    }
}
