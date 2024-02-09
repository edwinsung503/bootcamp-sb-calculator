package com.vtxlab.bootcamp.democalculator.service;

import java.math.BigDecimal;

public interface CalculatorService {
  
  BigDecimal setMethod(double x, double y, String operation);
}
