package br.ufrpe.boot.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ufrpe.boot.model.Livro;
import br.ufrpe.boot.repository.LivroRepository;
import br.ufrpe.boot.service.LivroService;


@RestController
public class LivroController {
	
//	@Autowired
//	LivroService livroService;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public List<Livro> list() {
//		return LivroTeste.list();		
//	}
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public void teste() {
//		System.out.println("chamou");		
//	}

	//injeção de dependência
	@Autowired
	LivroService livroService;
	
	
	//End Point
	@RequestMapping(value = "/livro", 
			method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro){	
		Livro livroCadastrado = livroService.cadastrar(livro); 
		return new ResponseEntity<Livro>(livroCadastrado, HttpStatus.CREATED); 		
	}
	
	
	@RequestMapping(value = "/livro", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Livro>> buscarTodosLivros(){			
		Collection<Livro> livrosBuscados= livroService.buscarTodos(); 		
		return new ResponseEntity<Collection<Livro>>(livrosBuscados, HttpStatus.OK); 		
	}
	
	@RequestMapping(value = "/livro/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Collection<Livro>> removerLivro(@PathVariable String id){			
		Livro livroEncontrado = livroService.buscarPorId(Integer.parseInt(id)); 
		if(livroEncontrado == null) {
			return new ResponseEntity<Collection<Livro>>(HttpStatus.NOT_FOUND);
		}
		livroService.excluir(livroEncontrado);
		return new ResponseEntity<Collection<Livro>>(HttpStatus.OK); 		
	}

	@RequestMapping(value = "/livro", 
			method = RequestMethod.PUT, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Livro> alterartrarLivro(@RequestBody Livro livro){	
		Livro livroAlterado = livroService.alterar(livro); 
		return new ResponseEntity<Livro>(livroAlterado, HttpStatus.CREATED); 		
	}
	
	
//	@RequestMapping(value = "/cliente", method = RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Livro> create(@RequestBody Livro livro){				
//		Livro livroCadastrado = livroService.create(livro);
//		return new ResponseEntity<Livro>(livroCadastrado, HttpStatus.CREATED); 
//	}
//		
//	@RequestMapping(value = "/cliente", method = RequestMethod.POST)
//	public ResponseEntity<Livro> update(@RequestBody Livro livro){				
//		Livro livroEditado = livroService.create(livro);
//		return new ResponseEntity<Livro>(livroEditado, HttpStatus.CREATED); 
//	}
//	
//	@RequestMapping(value = "/cliente/{id}", method = RequestMethod.DELETE)
//	public ResponseEntity<Livro> delete(@PathVariable Integer id){				
//		livroService.delete(id);
//		return new ResponseEntity<Livro>(HttpStatus.OK); 
//	}
	
	
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
