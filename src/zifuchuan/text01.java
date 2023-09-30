package zifuchuan;

public class text01 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
       String a = arrintoString(arr);
        System.out.println(a);
    }

    public static String arrintoString(int [] arr){
        if(arr == null){
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }
        String result = "[";


        for(int i = 0; i < arr.length; i++){
            if(i != arr.length - 1){
                result = result + arr[i] + ",";
            }else{
                result = result + arr[i] ;
            }
            }

        return result + ']';
    }
}
