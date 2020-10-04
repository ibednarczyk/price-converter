package com.projectcodingit.adapter;

import java.math.BigDecimal;
import java.util.Map;

public interface EURServiceAdapter {


    Map<String, BigDecimal> pricesMapInEUR(double currencyRate);

    void addToMap(String name, BigDecimal price);
}



