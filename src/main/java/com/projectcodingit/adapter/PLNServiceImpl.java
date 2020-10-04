package com.projectcodingit.adapter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class PLNServiceImpl implements PLNService {

    private Map<String, BigDecimal> priceMapPLN;

    PLNServiceImpl() {
        this.priceMapPLN = new HashMap<>();
    }

    @Override
    public Map<String, BigDecimal> pricesMapInPLN() {
        return priceMapPLN;
    }

    @Override
    public void addToMap(String name, BigDecimal price) {
        priceMapPLN.put(name, price);

    }


}
