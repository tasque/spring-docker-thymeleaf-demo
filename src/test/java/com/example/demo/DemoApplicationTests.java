package com.example.demo;

import com.example.demo.entity.WordRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private WordRepository wordRepository;

	@Test
	void contextLoads() {
	}

}
