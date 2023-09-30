package hohoDom;

public class hohoDom0613 {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6,7,8,9};
        int [] tump = sum(arr,3,7);
        for (int i =0;i < arr.length;i++){
            System.out.print(tump[i] + "  ");
        }
    }
    public static int[] sum(int[]arr,int form,int to){
        int[]newarr=new int[to - form];
        int index = 0;
        for (int i =form;i < to;i++){
            newarr [index] = arr[i];
            index++;
        }
        return newarr;
    }
}
