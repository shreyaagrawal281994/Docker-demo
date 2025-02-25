package controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class DockerDemoController {

    //sample controller
    public String method() {
        return "jenkins integration test";
    }
}
