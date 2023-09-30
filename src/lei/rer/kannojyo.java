package lei.rer;

public class kannojyo {
    private String name;
    private double heigth;
    private int age;

    public void setName(String name){

        this.name = name;
    }

     public String getName(){
        return name;
     }

     public void setheigth( double heigth){
        if(heigth >= 150 && heigth <=170){
            this.heigth = heigth;
        }else{
            System.out.println("无效");
        }
     }
      public  double getHeigth(){
        return heigth;
      }

        public void setAge (int age){
         if(age >= 18 && age <= 50){
             this.age =age ;
         }else{
             System.out.println("");
         }
        }

    public int getAge() {

        return age;
    }

    public void sleep() {
        System.out.println("pig");
    }

    public void food() {
        System.out.println("taberu");
    }
}
