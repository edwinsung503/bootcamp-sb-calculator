package com.vtxlab.bootcamp.democalculator.service;

import com.vtxlab.bootcamp.democalculator.dto.request.Calculate;
import com.vtxlab.bootcamp.democalculator.dto.response.CalculationsDTO;
import com.vtxlab.bootcamp.democalculator.dto.response.PostCalculatorDTO;

public interface CalculatorService {
  

  CalculationsDTO setMethod(double x, double y, String operation);
  
  PostCalculatorDTO createCalculator(Calculate calculate);

  CalculationsDTO setMethod3(double x, double y, String operation);

  
}
