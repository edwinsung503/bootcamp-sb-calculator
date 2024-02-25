package com.vtxlab.bootcamp.democalculator.service.impl;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import com.vtxlab.bootcamp.democalculator.dto.request.Calculate;
import com.vtxlab.bootcamp.democalculator.dto.response.CalculationsDTO;
import com.vtxlab.bootcamp.democalculator.dto.response.PostCalculatorDTO;
import com.vtxlab.bootcamp.democalculator.mapper.Calculator;
import com.vtxlab.bootcamp.democalculator.service.CalculatorService;

@Service
public class CalculatorServiceHolder implements CalculatorService{

  
  @Override
  public CalculationsDTO setMethod(double x,double y, String operation){
    return Calculator.getMethod(x, y, operation);
  }

  @Override
  public PostCalculatorDTO createCalculator2(Calculate calculate){
    return Calculator.getMethod2(calculate);
  }

  @Override
  public CalculationsDTO setMethod3(double x,double y, String operation){
    return Calculator.getMethod(x, y, operation);
  }
  
}
