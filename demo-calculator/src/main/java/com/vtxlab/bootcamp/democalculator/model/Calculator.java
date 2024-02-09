package com.vtxlab.bootcamp.democalculator.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
  
  private static BigDecimal amount ;

  public static BigDecimal getMethod(double x,double y, String operation) {
    BigDecimal bx = BigDecimal.valueOf(x);
    BigDecimal by = BigDecimal.valueOf(y);
    if (operation.equals("add")){
      amount = bx.add(by).setScale(5,RoundingMode.HALF_UP);
    } else if (operation.equals("sub")){
      amount = bx.subtract(by).setScale(5,RoundingMode.HALF_UP);
    } else if (operation.equals("mul")){
      amount = bx.multiply(by).setScale(5,RoundingMode.HALF_UP);
    } else if (operation.equals("div")){
      amount = bx.divide(by).setScale(5,RoundingMode.HALF_UP);
    }
    return amount;
  }
}
