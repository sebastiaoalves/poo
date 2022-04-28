package br.uern.di.poo.exemplos.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.uern.di.poo.exemplos.spring.services.CalcService;

@RestController
@RequestMapping (value = "/calc")
public class CalcController {
    
    @Autowired
    private CalcService calcService;
    
    @GetMapping
    @RequestMapping (value = "/sum")
    public ResponseEntity<Integer> soma (@RequestParam Integer a, 
    		@RequestParam Integer b ) {
        Integer response = calcService.sum(a, b);
        return ResponseEntity.ok(response);
    }
    
    @GetMapping
    @RequestMapping (value = "/sub")
    public ResponseEntity<Integer> subtracao (@RequestParam Integer a, 
    		@RequestParam Integer b ) {
        Integer response = calcService.sub(a, b);
        return ResponseEntity.ok(response);
    }

}
