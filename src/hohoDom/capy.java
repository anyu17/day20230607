package hohoDom;

public class capy {
    public static void main(String[] args) {
        int [] arr ={11,22,33,44,55};
        int [] arr1 =new  int [arr.length];
        for (int i = 0; i < arr.length;i++){
            arr1 [i] =arr[i];
        }
        for (int i = 0; i <arr1.length;i++){
            System.out.print(arr1[i] + "  ");
        }
    }
}
