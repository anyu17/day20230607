package nv;

public class nvTest {
    public static void main(String[] args) {
        //��������
        nv [] arr = new nv[4];

        //��������
        nv V1 = new nv("С����",'Ů',20,"����");
        nv V2 = new nv("Сʫʫ",'Ů',21,"����");
        nv V3 = new nv("Сľľ",'Ů',22,"����");
        nv V4 = new nv("С����",'Ů',23,"����");

        //������������õ�������
        arr[0] = V1;
        arr[1] = V2;
        arr[2] = V3;
        arr[3] = V4;

        //��ƽ��ֵ
        int sum = 0;
        for(int i =0; i <arr.length ;i++){
        int index =  arr[i].getAge();
        sum = sum + index;
        }
        System.out.println(sum);
        int sum1 = sum / arr.length;
        System.out.println(sum1);

        //�����ƽ�����С��Ů���ӵ���Ϣ
        for(int i = 0; i < arr.length ;i++) {
            int sum2 = arr[i].getAge();
            if (sum2 <= sum1) {
                System.out.println(arr[i].getName() + "," + arr[i].getAge() + ","
                        + arr[i].getGender() + "," +arr[i].getAihao());
            }
        }
    }
}
