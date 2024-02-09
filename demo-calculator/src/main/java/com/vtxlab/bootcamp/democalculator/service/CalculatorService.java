package com.vtxlab.bootcamp.democalculator.service;

import java.math.BigDecimal;
import com.vtxlab.bootcamp.democalculator.model.PostCalculator;

public interface CalculatorService {
  
  BigDecimal setMethod(double x, double y, String operation);

  
}
