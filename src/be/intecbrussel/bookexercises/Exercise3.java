package be.intecbrussel.bookexercises;

public class Exercise3 {
    public static void main(String[] args) {
        boolean aBoolean = false;
        char aCharacter = 'd';
        byte aByte = 126;
        short aShort = 115;
        int anInteger = 0b0101_1100;
        long aLong = 45_631_341L;
        float decimalNumber = 1256.32F;
        double aBigDecimalNumber = 12.365987451236;

        aByte = (byte) aShort;

        System.out.println(aShort);
        System.out.println(aByte);

        anInteger = aCharacter;
    }
}
