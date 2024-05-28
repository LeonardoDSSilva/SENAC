package com.senac.ado02;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

	@GetMapping
	public List<Contato> listarContatos() {
		List<Contato> contatos = new ArrayList<>();
		contatos.add(new Contato(1, "Seu Madruga", "madruga@vila.com"));
		contatos.add(new Contato(2, "Prof. Girafales", "girafales@vila.com"));
		contatos.add(new Contato(3, "Dona Florinda", "florinda@vila.com"));
		return contatos;
	}

	


}
