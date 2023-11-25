package co.abi.learning.jenkinstestapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/home")
    public String home(){
        return "Welcome home";
    }
}
