package hohoDom;

public class taxt2 {
    public static void main(String[] args) {
        int [] arr ={8,3,4,6};
        for (int i = 0,j = arr.length -1; i < j; i++,j--) {
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
           if (arr[i] >= 5 && arr[i] <= 9){
                arr[i] = arr[i] - 5;
           }else{
               arr[i] = arr[i] + 10 - 5;
           }
           // System.out.print(arr[i]);
        }
        int number = 0;
        for(int i = 0 ; i < arr.length; i++){
           number= number *10 +arr[i];
        }
        System.out.println(number);
    }
}
