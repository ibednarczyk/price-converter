package com.projectcodingit.adapter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.stream.Collectors;

public class EURServiceAdapterImpl implements EURServiceAdapter {

    private PLNService priceMapPLN;

    public EURServiceAdapterImpl() {
        priceMapPLN = new PLNServiceImpl();

    }

    @Override
    public Map<String, BigDecimal> pricesMapInEUR(double currencyRate) {
        return convert(currencyRate);
    }

    @Override
    public void addToMap(String name, BigDecimal price) {
        priceMapPLN.addToMap(name, price);

    }

    private Map<String, BigDecimal> convert(double currencyRate) {

       return priceMapPLN.pricesMapInPLN().entrySet().stream()
               .collect(Collectors.toMap(Map.Entry::getKey,
                       e -> e.getValue().divide(BigDecimal.valueOf(currencyRate), RoundingMode.CEILING)));

    }

}
