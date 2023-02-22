
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class p4 {
@GetMapping("/link")
public String checkApi() throws JsonProcessingException{

p5 response = new p5("Hello!");
ObjectMapper obj=new ObjectMapper();
return obj.writeValueAsString(response);
}

}



