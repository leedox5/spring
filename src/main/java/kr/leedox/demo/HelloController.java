package kr.leedox.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.leedox.demo.model.Game;

@Controller
public class HelloController {
    @GetMapping("/")
    public String index(Model model) {
        return "main";
    }

    @GetMapping("/test")
    public String test(Model model) {
        return "main";
    }

    @GetMapping("/main")
    public String home(Model model) {
        List<Game> gameList = new ArrayList<>();
        gameList.add(new Game(1, "[2021.11.11]", "leedox"));
        gameList.add(new Game(2, "[2021.11.12]", "leedox"));
        gameList.add(new Game(3, "[2021.11.13]", "leedox"));
        model.addAttribute("gameList", gameList);
        return "main";
    }
}
