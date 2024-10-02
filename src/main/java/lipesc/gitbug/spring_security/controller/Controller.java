package lipesc.gitbug.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/public")
  String publicRoute() {
    return "<h1> This page has public access </h1>";
  }

  @GetMapping("/private")
  String privateRoute() {
    return "<h1> This page it's for allowed users only </h1>";
  }
}
