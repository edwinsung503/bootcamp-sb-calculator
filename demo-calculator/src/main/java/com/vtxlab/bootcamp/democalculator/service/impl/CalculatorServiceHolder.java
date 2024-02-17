package com.vtxlab.bootcamp.democalculator.service.impl;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import com.vtxlab.bootcamp.democalculator.model.PostRequest;
import com.vtxlab.bootcamp.democalculator.model.Calculator;
import com.vtxlab.bootcamp.democalculator.service.CalculatorService;

@Service
public class CalculatorServiceHolder implements CalculatorService{

  //@Override
  //List<Calculation> getCalculations(){
  //  return Calculator.getMethod(x, y, operation);
  //}
  @Override
  public double setMethod(double x,double y, String operation){
    return Calculator.getMethod(x, y, operation);
  }

  @Override
  public BigDecimal createCalculator(PostRequest calculationRequest){
    return Calculator.getMethod2(calculationRequest);
  }

  @Override
  public BigDecimal setMethod3(double x,double y, String operation){
    return Calculator.getMethod(x, y, operation);
  }
  
}
