package com.klu.calc_backend; // ✅ Ensure this matches your package name

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*") // ✅ Allow all origins (can be restricted later)
public class ArithmeticController {

    @GetMapping("/add/{a}/{b}")
    public Result add(@PathVariable int a, @PathVariable int b) {
        return new Result("Addition", a + b);
    }

    // ✅ Inner class to return JSON instead of plain string
    static class Result {
        private String operation;
        private int result;

        public Result(String operation, int result) {
            this.operation = operation;
            this.result = result;
        }

        public String getOperation() {
            return operation;
        }

        public int getResult() {
            return result;
        }
    }
}