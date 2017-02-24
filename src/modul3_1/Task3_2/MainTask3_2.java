package modul3_1.Task3_2;

public class MainTask3_2 {

    public static void main(String[] args) {

        Arithmetic ar = new Arithmetic();
        System.out.println(ar.add(3, 5));

        Adder ad = new Adder();
        System.out.println(ad.check(100,4));
        System.out.println(ad.add(100,4));
    }
}
