package com.company.converter;

public class RimDigital1 extends Converter{

    public RimDigital1(String s) {
        super(s);
    }

    public enum RimDigital { I, II, III, IV, V, VI, VII, VIII, IX, X }
    String[] temp = getS().split("[\\W+]");
    static RimDigital[] rimDigital = RimDigital.values();


    public static String[] aAndB(){
        int j =0;
        String [] tempRim = new String[rimDigital.length];
        for(var k: rimDigital){
            tempRim[j] = k.toString();
            j++;
        }
        return tempRim;
    }

    @Override

    public Integer digital() {
        Integer a = 0;
        Integer x= -1;
        Integer y = -1;
        String [] map = aAndB();

        for (String s : temp) {
            for (int k = 0; k < map.length; k++) {
                if (x == -1) {
                    if (s.equals(map[k])) {
                        x = k + 1;
                    }
                }
                if(s.equals(map[k])) {
                    y = k + 1;
                }
            }
        }

        return result(x,y);
    }
}
