package zifuchuan;

public class zifuchuanjiequ {
    public static void main(String[] args) {
        String phoneNumber = "07012341234";
        String start =phoneNumber.substring (0,3);
        String end = phoneNumber.substring(7);

        String c = start + "****" + end;
        System.out.println(c);
    }
}
