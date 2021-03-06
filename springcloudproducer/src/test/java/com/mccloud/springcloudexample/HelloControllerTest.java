package com.mccloud.springcloudexample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc

public class HelloControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getSayHelloTest() throws Exception {
		mockMvc.perform( MockMvcRequestBuilders
			      .get("/azurecicd/hello")
			      .accept(org.springframework.http.MediaType.APPLICATION_JSON))
		          .andExpect(MockMvcResultMatchers.status().isOk())
		          .andExpect(MockMvcResultMatchers.content().string("Hello Cyril !!! Welcome to world of Spring throughCICD"));
			     
	

}
	
	
}
