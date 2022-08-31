package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {
	
	@RequestMapping("/eventos/form")
	public String form() {
		System.out.println("Chamou o método form!");
		return "formEvento";
	}
	@RequestMapping("/eventos/submit")
	public String submit(String nome, String data, String local, String horario)  {
		System.out.println("nome");
		System.out.println("data");
		System.out.println("local");
		System.out.println("horario");
		return "submit";
	}
}
