package nv;

public class nvTest {
    public static void main(String[] args) {
        //定义数组
        nv [] arr = new nv[4];

        //构建数组
        nv V1 = new nv("小甜甜",'女',20,"弹琴");
        nv V2 = new nv("小诗诗",'女',21,"下棋");
        nv V3 = new nv("小木木",'女',22,"画画");
        nv V4 = new nv("小花花",'女',23,"读书");

        //将构件对象放置到数组中
        arr[0] = V1;
        arr[1] = V2;
        arr[2] = V3;
        arr[3] = V4;

        //算平均值
        int sum = 0;
        for(int i =0; i <arr.length ;i++){
        int index =  arr[i].getAge();
        sum = sum + index;
        }
        System.out.println(sum);
        int sum1 = sum / arr.length;
        System.out.println(sum1);

        //输出比平均年纪小的女孩子的信息
        for(int i = 0; i < arr.length ;i++) {
            int sum2 = arr[i].getAge();
            if (sum2 <= sum1) {
                System.out.println(arr[i].getName() + "," + arr[i].getAge() + ","
                        + arr[i].getGender() + "," +arr[i].getAihao());
            }
        }
    }
}
