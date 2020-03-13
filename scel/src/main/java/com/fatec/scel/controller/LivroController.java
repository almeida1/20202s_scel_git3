package com.fatec.scel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.fatec.scel.model.Livro;

@Controller
@RequestMapping("/livros")
public class LivroController {
	@GetMapping("/menu") // Define a url que quando for requisitada chamara o metodo
	public String home() {
		// Retorna a view que deve ser chamada, neste exemplo a pagina home (html)
		return "menu";
	}
}
