package hohoDom;

public class hohorennshuDom2 {
    public static void main(String[] args){
        int []arr = {1,3,4,5,7,4,5,6};
        boolean cx =sum(arr,89);
        System.out.println(cx);
    }
    public static boolean sum(int[]arr,int num){
      for (int i =0;i < arr.length;i++){
            if(arr[i] == num){
                return true;
            }
      }
      return false;
    }
}
