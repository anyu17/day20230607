package lei.rer;

public class torokutest {
    public static void main(String[] args) {
        //touroku sc = new touroku();
        touroku sc = new touroku("nanako", "123","123@lcl", "nan",19);

        System.out.println(sc.getUsername());
        System.out.println(sc.getPassword());
        System.out.println(sc.getAge());
        System.out.println(sc.getEmail());
        System.out.println(sc.getGender());
    }
}
