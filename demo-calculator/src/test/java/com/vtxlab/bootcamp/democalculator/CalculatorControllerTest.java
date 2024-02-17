package com.vtxlab.bootcamp.democalculator;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import com.vtxlab.bootcamp.democalculator.controller.impl.CalculatorController;
import com.vtxlab.bootcamp.democalculator.service.CalculatorService;

@WebMvcTest(CalculatorController.class)
class CalculatorControllerTest {

    @MockBean
    private CalculatorService calculatorService;

    @Autowired
    private MockMvc mockMvc;

    //@Test
    //void testSetMethod() throws Exception {
    //    BigDecimal bigDecimal = new Big
    //}
    
}
