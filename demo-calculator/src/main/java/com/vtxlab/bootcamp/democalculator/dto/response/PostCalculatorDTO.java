package com.vtxlab.bootcamp.democalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostCalculatorDTO {

    private String x;
    private String y;
    private String operation;
    private String result;
    
}
