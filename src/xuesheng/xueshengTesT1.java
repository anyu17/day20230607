package xuesheng;

public class xueshengTesT1 {
    public static void main(String[] args) {
        xuesheng [] arr = new xuesheng[3];

        xuesheng S1 = new xuesheng("����",1,'��',18);
        xuesheng S2 = new xuesheng("����",2,'��',19);
        xuesheng S3 = new xuesheng("����",3,'Ů',20);

        arr[0] = S1;
        arr[1] = S2;
        arr[2] = S3;



        int getindex = temp(arr,2);
        if(getindex >=0){
            arr[getindex] =null;
            getbianli(arr);
        }else{
            System.out.println("�������,����������");
        }
    }

    public static void getbianli(xuesheng []arr){
        for(int i= 0 ; i < arr.length; i++) {
            if (arr[i] !=null) {
                System.out.println(arr[i].getName() + "," + arr[i].getID()
                        +"," + arr[i].getGender() + "," + arr[i].getAge() );
            }
        }
    }

    public  static int temp(xuesheng []arr,int ID ){
        for(int i = 0; i < arr.length; i++){
            xuesheng sum = arr[i];
            if(arr[i] != null){
                if(sum.getID() == ID){
                    return i;
                }
            }
        }
        return -1;
    }
}
