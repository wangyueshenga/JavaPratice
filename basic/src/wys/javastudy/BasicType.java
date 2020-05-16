package wys.javastudy;

/**
 * @author WYS
 * @since java version "1.8.0_211" Java(TM) SE Runtime Environment (build 1.8.0_211-b12) Java HotSpot(TM) 64-Bit Server VM (build 25.211-b12, mixed mode)
 * @version 0.0.1 基础
 */
import jdk.nashorn.internal.ir.BinaryNode;

public class BasicType{
    public char character;
    byte bytes;
    public BasicType(){ }
    public void operatBasicType(){
        /**
         * Char after operations the result will convert to integer (int), while hope to store the result in its original type , you should coerce it to the original type! 
         * The Void (and void ) cannot convert to anything~
        */
        char temp;
        temp = 'x';
        character = 'a';
        final char sum = (char) (temp * character); // 和
        final char quotient = (char) (temp / character); // 商
        final char product = (char) (temp * character); // 积
        final char difference = (char) (temp - character);// 差

        System.out.println("char '" + temp + "' and '" + character + "' operated by addition subtraction multiplication and division:");
        System.out.println("addition " + sum);
        System.out.println("\tBinary " + Integer.toBinaryString((int) sum));
        System.out.println("substraction " + difference);
        System.out.println("\tBinary " + Integer.toBinaryString((int) difference));
        System.out.println("multiplication " + product);
        System.out.println("\tBinary " + Integer.toBinaryString((int) product));
        System.out.println("division " + quotient);
        System.out.println("\tBinary " + Integer.toBinaryString((int) quotient));
        final byte temp_byte = Byte.MAX_VALUE;
        bytes = Byte.MIN_VALUE;
        final byte sum_byte = (byte) (bytes + temp_byte);
        final Void void1 = null;
        System.out.println("Void type" + void1);
        // System.out.println("\tBinary"+ Integer.toBinaryString((int)void1));
    }

    public static void main(final String args[]) {
        final BasicType basicType = new BasicType();
        basicType.operatBasicType();
    }
}