package com.vtxlab.bootcamp.democalculator.mapper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import com.vtxlab.bootcamp.democalculator.dto.request.Calculate;
import com.vtxlab.bootcamp.democalculator.dto.response.CalculationsDTO;
import com.vtxlab.bootcamp.democalculator.dto.response.PostCalculatorDTO;

public class Calculator {
  
  
  public static CalculationsDTO getMethod(double x,double y, String operation) {
    BigDecimal bx = BigDecimal.valueOf(x);
    BigDecimal by = BigDecimal.valueOf(y);
    BigDecimal amount = BigDecimal.valueOf(0);

    switch(operation.toLowerCase()) {
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
  return CalculationsDTO.builder()
          .x(String.valueOf(x))
          .y(String.valueOf(y))
          .operation(operation)
          .result(String.valueOf(amount))
          .build();
  }

  public static PostCalculatorDTO getMethod2(Calculate calculate){
    BigDecimal bx = BigDecimal.valueOf(Double.parseDouble(calculate.getX()));
    BigDecimal by = BigDecimal.valueOf(Double.parseDouble(calculate.getY()));
    String operation = calculate.getOperation();
    BigDecimal amount = BigDecimal.valueOf(0);

    switch(operation.toLowerCase()) {
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
    return PostCalculatorDTO.builder()
          .x(String.valueOf(calculate.getX()))
          .y(String.valueOf(calculate.getY()))
          .operation(operation)
          .result(String.valueOf(amount))
          .build();
  }
}
