package Controllers;

import Models.User;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private Map<Integer, User> employeeCache = new HashMap<>();

    @GetMapping(value = "/user/{id}")
    public JSONObject getUser(@PathVariable int id) {
        return new JSONObject();
    }
}
