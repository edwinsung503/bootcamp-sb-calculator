package com.vtxlab.bootcamp.democalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CalculationsDTO {

    private String x;
    private String y;
    private String operation;
    private String result;
    
}
