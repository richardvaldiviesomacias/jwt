package net.valdivieso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @GetMapping("/users")
    public @ResponseBody
    String getUsers() {
        return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Valdivieso\"}," +
                "{\"firstname\":\"Katie\",\"lastname\":\"Oquist\"}]}";
    }
}
