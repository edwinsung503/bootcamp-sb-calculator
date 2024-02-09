package com.vtxlab.bootcamp.democalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorOperation {
  
  //method 1 : Get
  //http://localhost:8080/api/v1/db/names?x=1.0&y=2.0&operation=add
  @GetMapping(value = "/db/names")
  double setMethod(@RequestParam (value="x",required= false, defaultValue ="0.0") double x,
                  @RequestParam (value="y") double y,
                  @RequestParam(value ="operation") String add);
}
