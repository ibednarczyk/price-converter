package com.projectcodingit.adapter;

import java.math.BigDecimal;

import java.util.Map;

public interface PLNService {

    Map<String, BigDecimal> pricesMapInPLN();

    void addToMap(String name, BigDecimal price);
}
