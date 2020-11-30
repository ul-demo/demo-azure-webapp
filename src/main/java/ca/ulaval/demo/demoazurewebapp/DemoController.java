package ca.ulaval.demo.demoazurewebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String allo() {
        return "Allo feature";
    }
}
