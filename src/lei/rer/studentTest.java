package lei.rer;

public class studentTest {
    public static void main(String[] args) {
        //student sc = new student();
        student sc = new student("nanako",18);
        System.out.println(sc.getName());
        System.out.println(sc.getAge());


        sc.setName ("nanoka");
        sc.setAge (19);

        System.out.println(sc.getAge());
        System.out.println(sc.getName());
    }
}
