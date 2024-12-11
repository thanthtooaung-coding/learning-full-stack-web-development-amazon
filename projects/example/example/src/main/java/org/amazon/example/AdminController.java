// TODO 5: Create an AdminController class in src/main/java/org/amazon/example.
package org.amazon.example;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    // TODO 6: Create an adminDashboard() method in the class to ensure that only users with ADMIN role can access admin dashboard. @PreAuthorize("hasRole('ADMIN')") ensures that only users with the ADMIN role can access the admin dashboard.
    @GetMapping("/dashboard")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminDashboard() {
        return "Welcome to the Admin Dashboard!";
    }

    // TODO 7: Create a userProfile() method in the class to ensure that only users with USER role, can access the user profile. @PreAuthorize("hasRole('USER')") ensures that only users with the USER role can access the user profile.
    @GetMapping("/profile")
    @PreAuthorize("hasRole('USER')")
    public String userProfile() {
        return "Welcome to the User Profile!";
    }
}