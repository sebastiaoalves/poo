package br.uern.di.poo.exemplos.spring.services;

import org.springframework.stereotype.Service;

@Service
public class CalcService {

    public Integer sum(Integer a, Integer b) {
        return a + b;
    }
    
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }
    
}
