package APIzifuchuan;

public class zifuchuan1 {
    public static void main(String[] args) {
        String str1 = "Abc";

        String str2 = new String("abc");
        System.out.println(str1 == str2);

        Boolean a = str1.equals(str2);
        System.out.println(a);

       boolean b = str1.equalsIgnoreCase(str2);
        System.out.println(b);
    }
}
