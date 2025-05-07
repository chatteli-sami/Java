public class Casting {
    public static void main(String[] args) {
        double d = 35.25;
        double dd = 35.99;

        int i1 = (int) d;
        int ii = (int) dd;

        System.out.println(i1);
        System.out.println(ii);

        int i = 35;
        float f = i;
        System.out.println("this number is " + f);
    }
}