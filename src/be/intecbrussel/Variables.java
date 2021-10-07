package be.intecbrussel;

public class Variables {
    public static void main(String[] args) {
        // Primitieve datatypes

        // Voor gehele getallen
        long myLong = 3147483648L; // -9,223,372,036,854,775,808 -> 9,223,372,036,854,775,807
        int myInteger = 5; // -2 147 483 648 -> 2 147 483 647
        short myShort = 1; // -32 768 -> 32 767
        byte myByte = 2;   // -128 -> 127

        // Voor kommagetallen
        float myFloat = 45.6f;
        double myDouble = 45.6;

        // Andere datatypes
        char myChar = 'w';
        boolean myBoolean = true; // Enkel true of false

        System.out.println(myLong);
        System.out.println(myInteger);
        System.out.println(myShort);
        System.out.println(myByte);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);

        long myLongSum = myLong + myLong;
        int myShortSum = myShort + myShort;
        int myByteSum = myByte + myByte;
        int myIntSum = myInteger + myInteger;
        float myFloatSum = myFloat + myFloat;
        double myDoubleSum = myDouble + myDouble;

        myShort = myByte;
        myLong = myByte;
        // myByte = myShort; Niet mogelijk, byte is kleiner dan een short.

        myDouble = myFloat;
        // myFloat = myDouble; Niet mogelijk, byte is kleiner dan een short.

        myDouble = myInteger;
        // myInteger = myDouble; Niet mogelijk, integer kan geen kommagetallen aanvaarden.

    }
}
