package com.vtxlab.bootcamp.democalculator.controller.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.democalculator.controller.CalculatorOperation;
import com.vtxlab.bootcamp.democalculator.dto.request.Calculate;
import com.vtxlab.bootcamp.democalculator.dto.response.CalculationsDTO;
import com.vtxlab.bootcamp.democalculator.dto.response.PostCalculatorDTO;
import com.vtxlab.bootcamp.democalculator.service.CalculatorService;

@RestController
@RequestMapping(value = "/api/v1")
public class CalculatorController implements CalculatorOperation {
 
  @Autowired
  private CalculatorService calculatorService;

  @Override
  public CalculationsDTO setMethod(double x, double y, String operation){
    return calculatorService.setMethod(x, y , operation);
  }

  @Override
  public ResponseEntity<PostCalculatorDTO> createCalculator2(@RequestBody Calculate calculate){
    PostCalculatorDTO createAnwser = calculatorService.createCalculator(calculate);
    return ResponseEntity.ok(createAnwser);
  }

  @Override
  public CalculationsDTO setMethod3(double x, double y, String operation){
    return calculatorService.setMethod3(x, y, operation);
  }

  
}
