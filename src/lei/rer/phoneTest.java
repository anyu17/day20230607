package lei.rer;

public class phoneTest {
    public static void main(String[] args) {
        phone p = new phone();

        p.brand = "gomi";
        p.price = 1000.1;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();
    }
}
