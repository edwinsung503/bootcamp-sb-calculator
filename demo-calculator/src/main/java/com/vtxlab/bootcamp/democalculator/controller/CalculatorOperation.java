package com.vtxlab.bootcamp.democalculator.controller;

import java.math.BigDecimal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.vtxlab.bootcamp.democalculator.model.PostCalculator;

public interface CalculatorOperation {
  
  //method 1 : Get
  //http://localhost:8080/api/v1/db/names?x=1.0&y=2.0&operation=add
  @GetMapping(value = "/calucations")
  BigDecimal setMethod(@RequestParam (value="x",required= false, defaultValue ="0.0") double x,
                  @RequestParam (value="y") double y,
                  @RequestParam(value ="operation") String add);

  
  
  
}
