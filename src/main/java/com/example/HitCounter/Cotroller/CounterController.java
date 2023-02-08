package com.example.HitCounter.Cotroller;

import com.example.HitCounter.Counter.Counter;
import com.example.HitCounter.Service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class CounterController {
@Autowired
    CounterService counterservice;
@GetMapping("/username/{username}/Countt")
    public Counter URLcount(@PathVariable String username){
    return counterservice.getUserName(username);
}


}
