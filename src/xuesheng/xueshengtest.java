package xuesheng;

public class xueshengtest {
    public static void main(String[] args) {
        xuesheng[] arr = new xuesheng[3];

        xuesheng S1 = new xuesheng("张三", 1, '男', 18);
        xuesheng S2 = new xuesheng("李四", 2, '男', 19);
        //建立数组与对象之间的联系.
        arr[0] = S1;
        arr[1] = S2;
        //要添加的新素组
        xuesheng S4 = new xuesheng("铁头", 5, '女', 21);


        boolean temp1 = sun1(arr, S4.getID());
        if (temp1) {
            //重复.不能添加
            System.out.println("重复,请重新输入");
            //不重复能添加
        } else {


            //判断元素满没满
            int count = getCount(arr);

            if (count == arr.length) {
                //当相等时候是满的,满的情况下要创建新的素组
                //再将老的素组的元素复制给新素组
                xuesheng[] getnew = newarr(arr);
               getnew[count] = S4 ;
                pry(getnew);

            } else {
                //arr元素没有满所以可以直接添加
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


        //判断满没满的调用方法.
    public static int getCount(xuesheng []arr) {
        int contion = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                contion++;
            }
        }
        return contion;
    }
    //根据ID判断是否ID重复
    //判断时候需要素组和Id的数值,所以形参要需要数组和ID的数值
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
