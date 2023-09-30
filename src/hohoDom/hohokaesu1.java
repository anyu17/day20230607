package hohoDom;

public class hohokaesu1 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        int q =sum(arr);
        System.out.println(q);
    }
    public static int sum(int[]arr){
        int max =arr[0];
        for (int i = 0; i < arr.length;i++){
            if (arr[i] > max){
                max= arr[i];
            }
        }
        //System.out.println(a);
        return max;
    }
}
