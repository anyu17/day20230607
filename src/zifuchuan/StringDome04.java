package zifuchuan;

public class StringDome04 {
    public static void main(String[] args) {
        // 定义ID
        String id = "230225199308234615";

        //获取生日信息
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("出生年月是:" + year + "年" + month + "月" + day +"日");

        char c = id.charAt(17);
        int getNumber = c - 48;
        if(getNumber % 2 ==0){
            System.out.println("性别:女");
        }else{
            System.out.println("性别:男");
        }
    }
}
