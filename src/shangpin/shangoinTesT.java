package shangpin;

public class shangoinTesT {
    public static void main(String[] args) {
        shangpin S1 = new shangpin("d1","�ϸ���",100.1,10);
        shangpin S2 = new shangpin("d2","�ϸɵ�",100.2,20);
        shangpin S3 = new shangpin("d3","�ϸɶ�",100.3,30);
        //��������
      shangpin[] arr = new shangpin[3];
      //��Ʒ������������
      arr[0]=S1;
      arr[1]=S2;
      arr[2]=S3;
        //���� ֮��Ҫע��
      for (int i=0 ; i < arr.length; i++){
          shangpin good =arr[i];
          /*��ѭ����ʼʱ�� i=1ʱ�� �ʹ���"
          �ϸ���"��������Ϣ.���ʱ������ϸ������Ӧ��Ϣ*/
          System.out.println(good.getID()+"   " +  good.getName()+"  " + good.getJiage()
                  +"   " + good.getKucun());
      }
    }
}
