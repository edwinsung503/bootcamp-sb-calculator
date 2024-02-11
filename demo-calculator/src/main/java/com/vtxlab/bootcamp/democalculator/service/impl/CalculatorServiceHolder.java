package com.vtxlab.bootcamp.democalculator.service.impl;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;
import com.vtxlab.bootcamp.democalculator.model.Calculator;
import com.vtxlab.bootcamp.democalculator.model.Calculation;
import com.vtxlab.bootcamp.democalculator.service.CalculatorService;

@Service
public class CalculatorServiceHolder implements CalculatorService{

  @Override
  List<Calculation> getCalculations(){
    return Calculator.getMethod(x, y, operation);
  }
  @Override
  public BigDecimal setMethod(double x,double y, String operation){
    return Calculator.getMethod(x, y, operation);
  }

  @Override
  public Calculation createCalculation (Calculation calculation){
    return Calculator.createCalculation(calculation);
  }

  @Override
  public BigDecimal setMethod3(double x,double y, String operation){
    return Calculator.getMethod(x, y, operation);
  }

  
}
