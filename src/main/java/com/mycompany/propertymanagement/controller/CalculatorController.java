package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.dto.CalculatorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {
//    http://localhost:8080/api/v1/calculator/add?num1=9&num2=2
    @GetMapping("/add")
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2){
         return num1+num2;
    }


    @GetMapping("/subs/{num1}/{num2}")
    public Double subs(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2){
        Double result = null;
        if(num1<num2)
            result = num2 - num1;
        else
            result = num1 - num2;
        return result;
    }

    @PostMapping("/mul")
    public ResponseEntity<Double> Multiply(@RequestBody CalculatorDTO calculatordto){

        Double result = null;
        result = calculatordto.getNum1() * calculatordto.getNum2() * calculatordto.getNum3() * calculatordto.getNum4();
        ResponseEntity<Double> responseEntity = new ResponseEntity<Double>(result, HttpStatus.CREATED);
        return responseEntity;
    }


}
