package com.redhat.patriot.network_controll;

import java.util.ArrayList;

/**
 * The type C route list.
 *
 * @param <CalcRoute> the type parameter
 */
public class CalculatedRouteList<CalcRoute> extends ArrayList<CalcRoute> {
    @Override
    public void add(int i, CalcRoute o) {
        if (super.size() <= i) {
                for (int y = super.size(); y <= i; y++) {
                    super.add(null);
                }
        }

        super.add(i, o);
    }

    @Override
    public boolean add(CalcRoute calcRoute) {
        return super.add(calcRoute);
    }
}