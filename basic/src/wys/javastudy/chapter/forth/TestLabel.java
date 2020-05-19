package wys.javastudy.chapter.forth;

import java.io.*;
public class TestLabel{
    public TestLabel(){

    }

    public void label(){
        int i = 0;

        outer: //Can't have statements here
        for(;true;){
            inner://Can't have statements here
            for(;i < 10; i++){
                System.out.println("i : "+i);
                if(i == 2){
                    System.out.println("continue");
                    continue;
                }
                if(i == 3){
                    System.out.println("break");
                    i++;
                    break;
                }
                if( i == 7){
                    System.out.println("continue outer");
                    i++;
                    break outer;
                }
                if( i == 8){
                    System.out.println("continue inner");
                    continue inner;
                }
            }
        }
    }
}