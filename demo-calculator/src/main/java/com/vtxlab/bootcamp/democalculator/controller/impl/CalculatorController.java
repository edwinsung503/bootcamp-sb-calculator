package com.vtxlab.bootcamp.democalculator.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.democalculator.controller.CalculatorOperation;
import com.vtxlab.bootcamp.democalculator.service.CalculatorService;

@RestController
@RequestMapping(value = "/api/v1")
public class CalculatorController implements CalculatorOperation {
 
  @Autowired
  private CalculatorService calculatorService;

  @Override
  public double setMethod(double x, double y, String operation){
    return calculatorService.setMethod(x, y , operation);
  }
}
