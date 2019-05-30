package io.finrev.auth.authapp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hellouser")
    @PreAuthorize("hasRole('ROLE_USER')")
    String helloUser() {
        org.springframework.security.core.userdetails.User activeUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "Hello User (" + activeUser.getUsername() + ")";
    }

    @GetMapping("/helloadmin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    String helloAdmin() {
        org.springframework.security.core.userdetails.User activeUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "Hello Admin (" + activeUser.getUsername() + ")";
    }

    @GetMapping("/hello")
    String hello() {
        org.springframework.security.core.userdetails.User activeUser = (org.springframework.security.core.userdetails.User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "Hello (" + activeUser.getUsername() + ")";
    }

    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping(method = RequestMethod.GET, value = "/foos/{id}")
    @ResponseBody
    public String findById(@PathVariable long id) {
        return "!!!!";
    }
}
