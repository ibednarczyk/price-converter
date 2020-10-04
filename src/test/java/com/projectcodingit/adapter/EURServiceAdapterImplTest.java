package com.projectcodingit.adapter;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public class EURServiceAdapterImplTest {


    @Test
    void shouldConvertPricesInPLNtoEUR() {
        //given
        EURServiceAdapterImpl priceMapAdapterToEUR = new EURServiceAdapterImpl();
        double currencyRate = 4.0;

        //when
        priceMapAdapterToEUR.addToMap("Shoes", new BigDecimal(BigInteger.valueOf(100)));
        Map<String, BigDecimal> resultMap = priceMapAdapterToEUR.pricesMapInEUR(currencyRate);

        //then
        Assertions.assertTrue(resultMap.containsValue(BigDecimal.valueOf(25)));


    }
}
