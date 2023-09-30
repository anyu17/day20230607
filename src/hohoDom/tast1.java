package hohoDom;

public class tast1 {
    public static void main(String[] args) {
        int number = 12342556;
        int temo = number;
        int count = 0;
        while(number != 0){
            number = number /10;
            count++;
        }
        //System.out.println(count);

        int[] arr = new int [count];
        int index = arr.length-1;
        while(temo != 0){
           int ge = temo % 10;
           temo = temo /10;
           arr[index] = ge;
           index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
