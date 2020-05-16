package wys.javastudy;
import java.io.*;

import jdk.nashorn.internal.ir.BinaryNode;

public class BasicType{
    public char character;
    byte bytes;
    public BasicType(){

    }
    public void operatBasicType(){
        char temp;
        temp = 'x';
        character = 'a';
        // char 经过加减乘除后的运算结果 以 int类型存储 需进行强制转换

        char sum = (char) (temp * character);       //和
        char quotient = (char) (temp / character);  //商
        char product = (char) (temp * character);   //积
        char difference = (char) (temp - character);//差

        System.out.println("char "+temp + "  " + character + "operated by addition subtraction multiplication and division:");
        System.out.println("addition " + sum);
        System.out.println("substraction " + difference);
        System.out.println("multiplication " + product);
        System.out.println("division " + quotient );

        byte temp_byte = Byte.MAX_VALUE;
        bytes = Byte.MIN_VALUE;
        byte sum_byte = (byte) (bytes + temp_byte);
        // byte quotient = 

    }
    public static void main(String args[]){
        BasicType basicType = new BasicType();
        basicType.operatBasicType();
    }
}