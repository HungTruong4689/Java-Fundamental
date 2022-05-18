

class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("BYte Minimum Value = "+myMinByteValue);
        System.out.println("BYte Maximum Value = "+ myMaxByteValue);

        short myShortMaxValue = Short.MIN_VALUE;
        short myShortMinValue = Short.MAX_VALUE;
        System.out.println("BYte Minimum Value = "+myShortMinValue);
        System.out.println("BYte Maximum Value = "+ myShortMaxValue);


        long myLongValue =100;
        long myLongMaxValue = Long.MIN_VALUE;
        long myLongMinValue = Long.MAX_VALUE;
        System.out.println("BYte Minimum Value = "+myLongMinValue);
        System.out.println("BYte Maximum Value = "+ myLongMaxValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myShortMaxValue / 2);
    }
}
