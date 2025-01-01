package com.example.demo.api;

import com.example.demo.entity.Word;
import com.example.demo.entity.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class TemplateController {
    private final WordRepository wordRepository;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allwords", wordRepository.findAll().stream().map(Word::getWord).toList());
        return "index";
    }
}
