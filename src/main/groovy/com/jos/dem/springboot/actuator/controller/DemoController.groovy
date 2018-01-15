package com.jos.dem.springboot.actuator

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.boot.actuate.metrics.CounterService
import org.springframework.beans.factory.annotation.Autowired

@RestController
class DemoController {

	@Autowired
	CounterService counterService

  @RequestMapping("/")
  String index(){
  	counterService.increment("com.jos.dem.springboot.actuator.DemoController.index");
    'Hello World!'
  }

}