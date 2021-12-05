package com.company.converter;
import java.util.HashMap;


public class ArabicDigital extends Converter {

    public ArabicDigital(String s) {
        super(s);
    }

    private HashMap<Integer, Integer> aAndB(){
        HashMap<Integer, Integer> map = new HashMap<>();
        var temp = getS().split("\\D+");
        for (int i = 0; i < temp.length; i++){
             map.put(i, Integer.parseInt(temp[i]));
        }
        return  map;
    }

    @Override
    public Integer digital() {
        Integer a = 0;
        Integer x= -1;
        Integer y = -1;
        HashMap <Integer, Integer> map = aAndB();


        for(Integer k : map.values()){
            if(!x.equals(map.get(0))){
                x = k;
            }
            y = k;
        }
        return result(x,y);
    }


}
