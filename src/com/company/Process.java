package com.company;

import com.company.converter.Converter;
import com.company.converter.RimDigital1;

public class Process {
   static InPutData inPutData = new InPutData();

    static RimDigital1 rimDigital1 = new RimDigital1(inPutData.inPutData());

    static String [] temp = rimDigital1.aAndB();

    public static int proc()   {
        int i = 0;
        int a = 0;
        String[] string = Converter.getS().split("[\\D+]");
        for (String str : temp) {
            if(string[i].equals(str)){
                a = 1;
            }
        }
        return a;
    }
}
