package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class DemosController {
	@GetMapping("/getName")
	public @ResponseBody String getName() {
        return "Kamesh";
    }

}
