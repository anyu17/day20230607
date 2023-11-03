package �ַ���;

//上传代码
public class StringBulider {
    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("123");

       int r = a.append("12").append("34").append(56).length();
        System.out.println(r);

        String b = a.toString();
        System.out.println(b);
    }
}
