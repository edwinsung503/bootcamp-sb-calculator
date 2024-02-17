package com.vtxlab.bootcamp.democalculator.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
  
  
  public static BigDecimal getMethod(double x,double y, String operation) {
    BigDecimal bx = BigDecimal.valueOf(x);
    BigDecimal by = BigDecimal.valueOf(y);
    BigDecimal amount = BigDecimal.valueOf(0);

    switch(operation) {
      case "add":
          amount = bx.add(by).setScale(5, RoundingMode.HALF_UP);
          break;
      case "sub":
          amount = bx.subtract(by).setScale(5, RoundingMode.HALF_UP);
          break;
      case "mul":
          amount = bx.multiply(by).setScale(5, RoundingMode.HALF_UP);
          break;
      case "div":
          if(by.compareTo(BigDecimal.ZERO) == 0){
              throw new ArithmeticException("Cannot divide by zero");
          }
          amount = bx.divide(by, 5, RoundingMode.HALF_UP);
          break;
      default:
          throw new IllegalArgumentException("Invalid operation: " + operation);
    }
  return amount;
  }

  public static BigDecimal getMethod2(PostRequest calculationRequest){
    double x = Double.parseDouble(calculationRequest.getX());
    double y = Double.parseDouble(calculationRequest.getY());
    String operation = calculationRequest.getOperation();

    BigDecimal result = getMethod(x, y, operation);
    
    return result;
  }
}
