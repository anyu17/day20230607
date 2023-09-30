package xuesheng;

public class xueshengTest2 {
    public static void main(String[] args) {
        xuesheng[] arr = new xuesheng[3];

        xuesheng S1 = new xuesheng("张三", 1, '男', 18);
        xuesheng S2 = new xuesheng("李四", 2, '男', 19);
        xuesheng S3 = new xuesheng("王五", 3, '女', 20);

        arr[0] = S1;
        arr[1] = S2;
        arr[2] = S3;

        int temp = getindex(arr, 2);

        if (temp >=0) {
               xuesheng stu = arr[temp];
               int newage =stu.getAge() + 1;
               stu.setAge(newage);

        }else{
            System.out.println("ID输入错误,请重新输入");
        }
       pry(arr);
    }



    public static int  getindex(xuesheng [] arr,int ID){
        for(int i =0; i < arr.length; i++) {
            xuesheng temp = arr[i];
            if(temp != null){
                if(temp.getID() == ID){
                    return i;
                }
            }
        }
        return -1;
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
}