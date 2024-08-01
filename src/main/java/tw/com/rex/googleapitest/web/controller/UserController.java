package tw.com.rex.googleapitest.web.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/principle")
    public Object principle() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

}
