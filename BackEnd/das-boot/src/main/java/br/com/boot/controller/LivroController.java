package br.com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.boot.model.Livro;
import br.com.boot.repository.LivroRepository;
import br.com.boot.service.LivroService;


@RestController
public class LivroController {
	
	@Autowired
	LivroService livroService;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public List<Livro> list() {
//		return LivroTeste.list();		
//	}
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public void teste() {
//		System.out.println("chamou");		
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<Livro> create(@RequestBody Livro livro){				
		Livro livroCadastrado = livroService.create(livro);
		return new ResponseEntity<Livro>(livroCadastrado, HttpStatus.CREATED); 
	}
		
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Livro> update(@RequestBody Livro livro){				
		Livro livroEditado = livroService.create(livro);
		return new ResponseEntity<Livro>(livroEditado, HttpStatus.CREATED); 
	}
	
	@RequestMapping(value = "/cliente/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Livro> delete(@PathVariable Integer id){				
		livroService.delete(id);
		return new ResponseEntity<Livro>(HttpStatus.OK); 
	}
	
	
	//	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
//	public Livro get(@PathVariable Integer id){
//		return LivroTeste.get(id);
//	}
//	
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public Livro update(@PathVariable Integer id, @RequestBody Livro livro){
//		return LivroTeste.update(id,livro);
//	}
//	
//	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//	public Livro delete(@PathVariable Integer id){
//		return LivroTeste.delete(id);
//	}


}
