package com.vtxlab.bootcamp.democalculator.dto.request;

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
public class Calculate {

    private String x;
    private String y;
    private String operation;
    
}
