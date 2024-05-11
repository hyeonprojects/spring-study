package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping()
    public String user() {
        return "get users";
    }

    @GetMapping("/{userId}")
    public String addUser(@PathVariable String userId) {
        return "post user";
    }

}
