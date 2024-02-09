package com.vtxlab.bootcamp.democalculator.service.impl;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import com.vtxlab.bootcamp.democalculator.model.Calculator;
import com.vtxlab.bootcamp.democalculator.model.PostCalculator;
import com.vtxlab.bootcamp.democalculator.service.CalculatorService;

@Service
public class CalculatorServiceHolder implements CalculatorService{

  @Override
  public BigDecimal setMethod(double x,double y, String operation){
    return Calculator.getMethod(x, y, operation);
  }

  
}
