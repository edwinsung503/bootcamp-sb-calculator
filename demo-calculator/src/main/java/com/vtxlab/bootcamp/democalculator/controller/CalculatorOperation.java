package com.vtxlab.bootcamp.democalculator.controller;

import java.math.BigDecimal;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.vtxlab.bootcamp.democalculator.model.PostRequest;

public interface CalculatorOperation {
  
  //method 1 : Get
  //http://localhost:8080/api/v1/calucations?x=3&y=a&operation=div

  @GetMapping(value = "/calucations")
  @ResponseStatus(value = HttpStatus.OK)
  double setMethod(@RequestParam (value="x",required= false, defaultValue ="0.0") double x,
                  @RequestParam (value="y") double y,
                  @RequestParam(value ="operation") String add);

  //method 2 : Post
  //http://localhost:8080/api/v1/calucate
  @PostMapping(value ="/calucate")
  @ResponseStatus(value = HttpStatus.OK)
  BigDecimal createCalculator(@RequestBody PostRequest calculationRequest);//Object 睇成person
  


  
  //method 3 : Get /{x}/{y}/{operation}
  //http://localhost:8080/api/v1/3/2/div
  @GetMapping(value= "/{x}/{y}/{operation}")
  @ResponseStatus(value = HttpStatus.OK)
  BigDecimal setMethod3(@PathVariable(name = "x") double x, 
                        @PathVariable(name = "y") double y,
                        @PathVariable(name = "operation")String operation);

}
