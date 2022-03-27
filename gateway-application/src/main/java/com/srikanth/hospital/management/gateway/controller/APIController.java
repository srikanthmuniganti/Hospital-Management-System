package com.srikanth.hospital.management.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	
	/*
	 * @RequestMapping("/doctorsServiceFallback") public Mono<String>
	 * doctorsServiceFallback(){ return
	 * Mono.just("Problem with doctorsService plz try Again After sometime"); }
	 */
	@GetMapping("/doctorsServiceFallback")
	public Object doctorsServiceFallback(){
		return "Problem with doctorsService plz try Again After sometime";
	}
	

}
