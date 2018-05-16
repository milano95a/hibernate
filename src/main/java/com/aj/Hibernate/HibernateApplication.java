package com.aj.Hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
@RestController
public class HibernateApplication {
	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}


	@GetMapping(value = "/")
	public @ResponseBody
	Object home() {
		return new RedirectView("/swagger-ui.html");
	}










	@Autowired
	AnswerRepo answerRepo;

	@Autowired
	QuestionRepo questionRepo;

	@GetMapping("/q")
	public @ResponseBody Object getQuestion() {
		return questionRepo.findAll();
	}

	@PostMapping("/q")
	public @ResponseBody Object postQuestion(@RequestBody Question postedQuestion) {
		return questionRepo.save(postedQuestion);
	}

	@GetMapping("/a")
	public @ResponseBody Object getAnswer() {
		return answerRepo.findAll();
	}

	@PostMapping("/a")
	public @ResponseBody Object postAnswer(@RequestBody Answer postedAnswer) {
		return answerRepo.save(postedAnswer);
	}
}
