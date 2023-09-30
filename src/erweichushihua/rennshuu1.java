package erweichushihua;

public class rennshuu1 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1}, {1, 1, 2}, {1,1 ,3}, {1, 1, 4}};
        int temp = 0;
        int sun =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                temp = arr[i][j] + temp;
            }
        }
        System.out.println(temp);


          int num = 0;
        for (int i = 0; i < arr.length; i++) {
            int [] arrnum = arr[i];
           num =  getsum(arrnum);
           System.out.println(num);
        }

    }
    public static int getsum(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}