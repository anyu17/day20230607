package shangpin;

public class shangoinTesT {
    public static void main(String[] args) {
        shangpin S1 = new shangpin("d1","老干妈",100.1,10);
        shangpin S2 = new shangpin("d2","老干爹",100.2,20);
        shangpin S3 = new shangpin("d3","老干儿",100.3,30);
        //定义数组
      shangpin[] arr = new shangpin[3];
      //商品放置在数组中
      arr[0]=S1;
      arr[1]=S2;
      arr[2]=S3;
        //放置 之后要注意
      for (int i=0 ; i < arr.length; i++){
          shangpin good =arr[i];
          /*当循环开始时候 i=1时候 就代表"
          老干妈"的数据信息.输出时候输出老干妈的相应信息*/
          System.out.println(good.getID()+"   " +  good.getName()+"  " + good.getJiage()
                  +"   " + good.getKucun());
      }
    }
}
