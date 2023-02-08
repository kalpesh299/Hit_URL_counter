package com.example.HitCounter.Service;

import com.example.HitCounter.Counter.Counter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CounterService {

    static Map<String, Integer> map = new HashMap<>();

    public Counter getUserName(String userName){
        int count = map.getOrDefault(userName, 0)+1;
        map.put(userName, count);
        return new Counter(userName, count);
    }

}
