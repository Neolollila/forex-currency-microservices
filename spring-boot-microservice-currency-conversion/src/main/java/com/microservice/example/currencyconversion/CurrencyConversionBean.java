package com.microservice.example.currencyconversion;

import java.math.BigDecimal;

public record CurrencyConversionBean(Long id,
                                     String from,
                                     String to,
                                     BigDecimal conversionMultiple,
                                     BigDecimal quantity,
                                     BigDecimal totalCalculatedAmount,
                                     int port) {

}