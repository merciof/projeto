package br.com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.boot.model.Livro;

@RestController
@RequestMapping("api/v1")
public class LivroController {

	@RequestMapping(value = "livros", method = RequestMethod.GET)
	public List<Livro> list() {
		return LivroTeste.list();
		
	}

	@RequestMapping(value = "livros", method = RequestMethod.POST)
	public Livro create(@RequestBody Livro livro){
		return LivroTeste.create(livro);
	}
	
	@RequestMapping(value = "livros/{id}", method = RequestMethod.GET)
	public Livro get(@PathVariable Integer id){
		return LivroTeste.get(id);
	}
	
	@RequestMapping(value = "livros/{id}", method = RequestMethod.PUT)
	public Livro update(@PathVariable Integer id, @RequestBody Livro livro){
		return LivroTeste.update(id,livro);
	}
	
	@RequestMapping(value = "livros/{id}", method = RequestMethod.DELETE)
	public Livro delete(@PathVariable Integer id){
		return LivroTeste.delete(id);
	}


}
