package be.intecbrussel;

public class Operators {
    public static void main(String[] args) {
//        int a = -5;
//        a++;
//        System.out.println(a);

//        int b = 10;
//        if (b >= 11 && b <= 15){
//            System.out.println("In between 5 and 15");
//        }

//        int c = 6;
//        if (c % 3 == 0 | c % 4 == 0) {
//            System.out.println("Dividable by 3 or 4");
//        }

//        int d = 10;
//        if (  !(d < 5)  ) {
//            System.out.println("condition is true");
//        }

        int e = 10;
        int f;

        if (e > 5){
            f = 1;
        } else {
            f = 0;
        }

        f = e > 5 ? 1 : 0;

        System.out.println(f);

    }
}
