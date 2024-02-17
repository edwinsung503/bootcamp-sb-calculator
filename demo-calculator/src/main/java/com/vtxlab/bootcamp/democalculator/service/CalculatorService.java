package com.vtxlab.bootcamp.democalculator.service;

import java.math.BigDecimal;
import com.vtxlab.bootcamp.democalculator.model.PostRequest;

public interface CalculatorService {
  
  //List<Calculation> getCalculations();

  double setMethod(double x, double y, String operation);
  
  BigDecimal createCalculator(PostRequest calculationRequest);

  BigDecimal setMethod3(double x, double y, String operation);

  
}
