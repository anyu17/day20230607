package xuesheng;

public class xueshengtest {
    public static void main(String[] args) {
        xuesheng[] arr = new xuesheng[3];

        xuesheng S1 = new xuesheng("����", 1, '��', 18);
        xuesheng S2 = new xuesheng("����", 2, '��', 19);
        //�������������֮�����ϵ.
        arr[0] = S1;
        arr[1] = S2;
        //Ҫ��ӵ�������
        xuesheng S4 = new xuesheng("��ͷ", 5, 'Ů', 21);


        boolean temp1 = sun1(arr, S4.getID());
        if (temp1) {
            //�ظ�.�������
            System.out.println("�ظ�,����������");
            //���ظ������
        } else {


            //�ж�Ԫ����û��
            int count = getCount(arr);

            if (count == arr.length) {
                //�����ʱ��������,���������Ҫ�����µ�����
                //�ٽ��ϵ������Ԫ�ظ��Ƹ�������
                xuesheng[] getnew = newarr(arr);
               getnew[count] = S4 ;
                pry(getnew);

            } else {
                //arrԪ��û�������Կ���ֱ�����
                arr[count] = S4;
                pry(arr);
                int tam =0;
                }
            }
        }


    public static void pry(xuesheng[] arr){
        for (int i =0; i < arr.length ;i++ ){
            xuesheng temp4 =arr[i];
            if(arr[i] != null){
                System.out.println(temp4.getName()+ "  " +temp4.getID()
                    + "," + temp4.getGender() + "," + temp4.getAge());
            }
        }
    }


    public static xuesheng[] newarr(xuesheng[] arr){
        xuesheng [] newarr = new xuesheng [arr.length + 1];
        for(int i =0; i < arr.length; i++){
            newarr[i] = arr[i];
        }
        return newarr;
    }


        //�ж���û���ĵ��÷���.
    public static int getCount(xuesheng []arr) {
        int contion = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                contion++;
            }
        }
        return contion;
    }
    //����ID�ж��Ƿ�ID�ظ�
    //�ж�ʱ����Ҫ�����Id����ֵ,�����β�Ҫ��Ҫ�����ID����ֵ
    public static boolean sun1(xuesheng []arr, int id){
        for(int i =0 ; i < arr.length; i++) {
            xuesheng stu = arr[i];
            if ( stu != null) {
                int sid = stu.getID();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }
}
