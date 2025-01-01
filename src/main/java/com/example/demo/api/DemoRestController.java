package com.example.demo.api;

import com.example.demo.entity.Word;
import com.example.demo.entity.WordRepository;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DemoRestController {
    private final WordRepository wordRepository;

    @GetMapping("/random")
    public String random() {
        List<Word> words = wordRepository.findAll();
        Word randomWord = words.get(ThreadLocalRandom.current().nextInt(words.size()));
        return randomWord.getWord();
    }
}
