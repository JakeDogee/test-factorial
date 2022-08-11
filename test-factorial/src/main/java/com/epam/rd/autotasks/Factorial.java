package com.epam.rd.autotasks;

import jdk.jfr.Unsigned;


public class Factorial {
    public String factorial(String n) throws IllegalArgumentException{
        try{
            int num = Integer.parseUnsignedInt(n);
            long fackt = 1;
            for(int i = 1; i <= num;i++){
                fackt *=i;
            }
            return String.valueOf(fackt);
        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }
}
