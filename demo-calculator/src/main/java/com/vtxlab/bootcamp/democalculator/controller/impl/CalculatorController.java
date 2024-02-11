package com.vtxlab.bootcamp.democalculator.controller.impl;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.democalculator.controller.CalculatorOperation;
import com.vtxlab.bootcamp.democalculator.model.Calculation;
import com.vtxlab.bootcamp.democalculator.service.CalculatorService;

@RestController
@RequestMapping(value = "/api/v1")
public class CalculatorController implements CalculatorOperation {
 
  @Autowired
  private CalculatorService calculatorService;

  @Override
  public BigDecimal setMethod(double x, double y, String operation){
    return calculatorService.setMethod(x, y , operation);
  }
  @Override
  public Calculation createCalculation(Calculation calculation){
    return calculatorService.createCalculation(calculation);
  }

  @Override
  public BigDecimal setMethod3(double x, double y, String operation){
    return calculatorService.setMethod3(x, y, operation);
  }

  
}
