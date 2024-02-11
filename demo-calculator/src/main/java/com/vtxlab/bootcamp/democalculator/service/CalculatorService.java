package com.vtxlab.bootcamp.democalculator.service;

import java.math.BigDecimal;
import java.util.List;
import com.vtxlab.bootcamp.democalculator.model.Calculation;

public interface CalculatorService {
  
  List<Calculation> getCalculations();

  BigDecimal setMethod(double x, double y, String operation);
  
  Calculation createCalculation(Calculation calculation);

  BigDecimal setMethod3(double x, double y, String operation);

  
}
