package lei.rer;

public class kannojyoTest {
    public static void main(String[] args) {


        kannojyo G = new kannojyo();

        G.setName("");
        G.setheigth(155);
        G.setAge(88);

        System.out.println(G.getName());
        System.out.println(G.getHeigth());
        System.out.println(G.getAge());

        G.food();
        G.sleep();
    }
}