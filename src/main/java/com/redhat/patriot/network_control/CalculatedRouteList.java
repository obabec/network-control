package com.redhat.patriot.network_control;

import java.util.ArrayList;

/**
 * The type Calculated route list with extended add method to avoid inserting Route to non-existing index.
 *
 * @param <CalcRoute> the type parameter
 */
public class CalculatedRouteList<CalcRoute> extends ArrayList<CalcRoute> {
    @Override
    public void add(int i, CalcRoute o) {
        Integer size = super.size();
        if (size > i && super.get(i) == null) {
            super.set(i, o);
        } else {
            if (super.size() <= i) {
                for (int y = super.size(); y < i; y++) {
                    super.add(null);
                }
            }
            super.add(i, o);
        }
    }

    @Override
    public boolean add(CalcRoute calcRoute) {
        return super.add(calcRoute);
    }
}
