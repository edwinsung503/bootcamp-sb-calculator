package com.vtxlab.bootcamp.democalculator.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Syscode {
  OK("00000", "OK."),
  INVALID_VALUE_X("90001","Invalid value of X."),
  INVALID_VALUE_Y("90002","Invalid value of Y."),
  INVALID_VALUE_OPERATION("90003","Invalid value of Operation."),
  INVALID_VALUE_RESPONSE("90004","Invalid value of Response."),
  UNKNOWN_ERROR("90005","Unknown Error");


  private String code;
  private String message;
  
}
