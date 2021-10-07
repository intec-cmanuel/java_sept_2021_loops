package be.intecbrussel;

public class WhileLoop {
    public static void main(String[] args) {
//        long b = 1450450450L;
//        long c = 1450450450L;
//        long d = 1450450450L;
//
//        long smallSum = b+c;
//        long sum = b+c+d;
//
//        System.out.println(smallSum);
//        System.out.println(sum);

//        // This is my for loop
//        for (int e = 1; e <= 10; e = e + 1) {
//            if (e == 3) {
//                continue;
//            }
//
//            System.out.println(e);
//
//            if  (e == 8) {
//                break;
//            }
//        }


//        int a = 1;
//
//        while (a <= 10) {
//            if (a == 3) {
//                continue;
//            }
//
//            System.out.println(a);
//            a = a + 1;
//
//            if  (a == 8) {
//                break;
//            }
//        }

        int a = 1;

        do {
            if (a == 3) {
                //continue;
            }

            System.out.println(a);
            a = a + 1;

            if (a == 8) {
                break;
            }
        } while (a <= 10);

        System.out.println("Loop is finished");
    }
}
