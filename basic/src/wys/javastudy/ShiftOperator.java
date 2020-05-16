package wys.javastudy;
/**
 * @author WYS
 * @version 0.0.1
 * @since java version "1.8.0_211" Java(TM) SE Runtime Environment (build 1.8.0_211-b12) Java HotSpot(TM) 64-Bit Server VM (build 25.211-b12, mixed mode)
 */
public class ShiftOperator {
    public ShiftOperator(){}
    public short shortDataZero = 0x2AAA;
    public short shortDataOne = 0x5555;
    public void operator (){
         short rightShift = (short) (shortDataZero >> 2);
         short leftShift = (short)(shortDataZero << 2);
         short unsigndeRightShift = (short) (shortDataZero >>> 2);
         short and = (short) (shortDataZero & shortDataOne);
         short or = (short) (shortDataZero | shortDataZero);
         short xor = (short) (shortDataZero ^ shortDataOne);
        System.out.println("操作shortDataZero = ' " + Integer.toBinaryString(shortDataZero) + " ' 和 shortDataOne = '" + Integer.toBinaryString(shortDataOne) + "'!");
        System.out.println("有符号右移操作 shortDataZero " + Integer.toBinaryString(rightShift));
        System.out.println("左移      操作 shortDataZero " + Integer.toBinaryString(leftShift));
        System.out.println("无符号右移操作 shortDataZero " + Integer.toBinaryString(unsigndeRightShift));
        System.out.println("与    操   作 " + Integer.toBinaryString(and));
        System.out.println("或    操   作 " + Integer.toBinaryString(or));
        System.out.println("异或      操作 " + Integer.toBinaryString(xor));
    }

    public static void main(final String args[]) {
        final ShiftOperator shiftOperator = new ShiftOperator();
        shiftOperator.operator();
    }
}