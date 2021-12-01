package com.company_1.actions;

public class Amount implements Action {

    @Override
    public int apply(int x, int y) {
        return x + y;
    }
}
