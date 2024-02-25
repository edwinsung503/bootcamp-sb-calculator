package com.vtxlab.bootcamp.democalculator;

import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.vtxlab.bootcamp.democalculator.controller.impl.CalculatorController;
import com.vtxlab.bootcamp.democalculator.dto.request.Calculate;
import com.vtxlab.bootcamp.democalculator.dto.response.CalculationsDTO;
import com.vtxlab.bootcamp.democalculator.dto.response.PostCalculatorDTO;
import com.vtxlab.bootcamp.democalculator.service.CalculatorService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(CalculatorController.class)
class CalculatorControllerTest {

    @MockBean
    private CalculatorService calculatorService;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetMethod() throws Exception {

        CalculationsDTO calculations = new CalculationsDTO("10","20","add","30");

        Mockito.when(calculatorService.setMethod(10,20,"add"))
                .thenReturn(calculations);

        mockMvc.perform(get("/api/v1/calucations")
                .param("x", "10")
                .param("y", "20")
                .param("operation", "add"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON)) 
                .andExpect(jsonPath("$.x").value("10"))
                .andExpect(jsonPath("$.y").value("20"))
                .andExpect(jsonPath("$.operation").value("add"))
                .andExpect(jsonPath("$.result").value("30"))
                .andDo(print());
    }

    @Test
    public void testPostMethod() throws Exception {
        
    
        Calculate calculate = new Calculate("8","2","div");
        PostCalculatorDTO postCalculator = new PostCalculatorDTO("8","2","div","4");
        
        Mockito.when(calculatorService.createCalculator2(Mockito.any(Calculate.class))).thenReturn(postCalculator);
        
        String contentStr = new ObjectMapper().writeValueAsString(calculate);
        
        mockMvc.perform(post("/api/v1/calculate")
                .contentType(MediaType.APPLICATION_JSON)
                .content(contentStr))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.x").value("8"))
                .andExpect(jsonPath("$.y").value("2"))
                .andExpect(jsonPath("$.operation").value("div"))
                .andExpect(jsonPath("$.result").value("4"))
                .andDo(print());
      
    }

    @Test
    public void testGetMethod2() throws Exception {
        
        double x = 3;
        double y = 2;
        String operation = "div";
        CalculationsDTO calculations = new CalculationsDTO("3","2","div","1.5");
        Mockito.when(calculatorService.setMethod3(x, y, operation)).thenReturn(calculations);

        
        mockMvc.perform(get("/api/v1/{x}/{y}/{operation}", x, y, operation)
                            .contentType(MediaType.APPLICATION_JSON))
                            .andExpect(status().isOk())
                            .andExpect(jsonPath("$.result").value("1.5"))
                            .andDo(print());
    
    }
}
