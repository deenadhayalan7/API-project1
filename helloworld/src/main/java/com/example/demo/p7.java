
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class p7 {

@Value("${hello.val}")
private String welcomestring;

@GetMapping("/helloworld")
public String mainf() {
return welcomestring + " World!";
}
}