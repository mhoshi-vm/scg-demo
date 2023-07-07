package jp.co.vmware.tanzu.scgdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScgController {

    String getMessage;

    public ScgController(@Value("${demo.get:Hello World}") String getMessage) {
        this.getMessage = getMessage;
    }

    @GetMapping("/api/get")
    public String get(){
        return getMessage;
    }

}
