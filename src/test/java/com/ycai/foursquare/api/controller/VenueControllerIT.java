package com.ycai.foursquare.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class VenueControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSearchWhenUseDefaultValue() throws Exception {
        this.mockMvc.perform(get("/venues/search")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.venues").isArray())
                .andExpect((jsonPath("$.venues[0].name")).value("Costa Coffee"));
    }
    
    @Test
    public void testSearchWhenHasParams() throws Exception {
    	final String near = "52.48,1.89"; //birmingham
    	final String name = "premierinn";
        this.mockMvc.perform(get("/venues/search?near=" + near + "&name=" + name)).andDo(print())
        		.andExpect(status().isOk())
        		.andExpect(jsonPath("$.venues").isArray());
    }
    
    @Test
    public void testSearchWhenHasInvalidInvalid() throws Exception {
    	final String near = "xxxx"; //invalid param
    	final String name = "premierinn";
        this.mockMvc.perform(get("/venues/search?near=" + near + "&name=" + name)).andDo(print())
        		.andExpect(status().isOk());
        		//.andExpect(jsonPath("$.venues").isArray());
    }

}
