

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class p6 {
private String studentName="Geethan!";
@GetMapping("/name")
public String getName() {
return "Welcome "+studentName;
}

}

