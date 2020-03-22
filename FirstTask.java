package firstTask;


public class FirstTask {


    public void startTask() {

        boolean startBool = true;

        byte startByte = startByte(startBool);
        short startShort = startShort(startByte);
        int startInt = startInt(startShort);

        char startChar = 'a';

        int startIntChar = startInt(startChar);
        long startLong = startLong(startInt);

        float startFloatInt = startFloat(startIntChar);
        float startFloatLong = startFloat(startLong);

        double startDoubleInt = startDouble(startInt);
        double startDoubleLong = startDouble(startLong);
        double startDoubleFloat = startDouble(startFloatInt);

    }

    private byte startByte(boolean bool) {
        byte resultByte = bool ? Byte.MAX_VALUE : Byte.MIN_VALUE;
        System.out.println("startByte = " + resultByte);
        return resultByte;
    }

    private short startShort(byte inByte) {
        short resultShort = inByte;
        System.out.println(resultShort);
        return resultShort;
    }

    private int startInt(short inShort) {
        int resultInt = inShort;
        System.out.println(resultInt);
        return resultInt;
    }

    private long startLong(int inInt) {
        long resultLong = inInt;
        System.out.println(resultLong);
        return resultLong;
    }

    private int startInt(char inChar) {
        int resultInt = inChar;
        System.out.println(resultInt);
        return resultInt;
    }

    private float startFloat(int inInt) {
        float resultFloat = inInt;
        System.out.println(resultFloat);
        return resultFloat;
    }

    private float startFloat(long inLong) {
        float resultFloat = inLong;
        System.out.println(resultFloat);
        return resultFloat;
    }

    private double startDouble(long inLong) {
        double resultDouble = inLong;
        System.out.println(resultDouble);
        return resultDouble;
    }

    private double startDouble(int inInt) {
        double resultDouble = inInt;
        System.out.println(resultDouble);
        return resultDouble;
    }

    private double startDouble(float inFloat) {
        double resultDouble = inFloat;
        System.out.println(resultDouble);
        return resultDouble;
    }

}