package br.com.boot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.boot.model.Livro;

public class LivroTeste {
	private static Map<Integer, Livro> livros = new HashMap<Integer, Livro>();
	private static Integer idIndex = 3;

	static {
		Livro a = new Livro(1, "teste", "teste", "teste", "teste", "teste");
		livros.put(1, a);
		Livro b = new Livro(2, "teste", "teste", "teste", "teste", "teste");
		livros.put(2, b);
		Livro c = new Livro(3, "teste", "teste", "teste", "teste", "teste");
		livros.put(3, c);
	}

	public static List<Livro> list() {
		return new ArrayList<Livro>(livros.values());
	}

	public static Livro create(Livro livro) {
		idIndex += idIndex;
		livro.setId(idIndex);
		livros.put(idIndex, livro);
		return livro;
	}

	public static Livro get(Integer id) {
		return livros.get(id);
	}

	public static Livro update(Integer id, Livro livro) {
		livros.put(id, livro);
		return livro;
	}

	public static Livro delete(Integer id) {
		return livros.remove(id);
	}
}
