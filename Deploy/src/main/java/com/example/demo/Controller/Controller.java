package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {

	@RequestMapping("api/hello")
	public String getAllMovies()
	{
		return "hello please check ";
	}
}
