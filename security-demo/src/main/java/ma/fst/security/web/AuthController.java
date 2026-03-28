package ma.fst.security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }

    @GetMapping("/admin/dashboard")
    public String adminView() {
        return "admin-dashboard";
    }

    @GetMapping("/user/dashboard")
    public String userView() {
        return "user-dashboard";
    }
}