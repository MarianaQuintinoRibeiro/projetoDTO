package dto.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import dto.DTO.LivroDTO;
import dto.entities.Livro;
import dto.services.LivroService;
import jakarta.validation.Valid;

public class LivroController {
	/*
	private final LivroService livroService;
	
	@Autowired
	public LivroControler(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> buscarLivroId(@PathVariable Long id) {
		Livro livro = livroService.buscaPorId(id);
		if (livro != null) {
			return ResponseEntity.ok(livro);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping
	public ResponseEntity<List<Livro>> buscaTodosLivros() {
		List<Livro> livro = livroService.buscaTodos();
		return ResponseEntity.ok(livro);
	}
	
	@PostMapping
	public ResponseEntity<LivroDTO> criar(@RequestBody @Valid Livro livro) {
		LivroDTO salvarLivro = livroService.salvar(livro);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvarLivro);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<LivroDTO> alterarLivro (@PathVariable Long id, @RequestBody @Valid Livro livro) {
		LivroDTO alterarLivroDTO = livroService.atualizar(id, livro);
		if (alterarLivroDTO != null) {
			return ResponseEntity.ok(alterarLivroDTO);
		} else {
			return ResponseEntity.notFound().build();		
	 }

}
	@DeleteMapping("/{id}")
	public ResponseEntity<Livro> deletarLivro(@PathVariable Long id) {
		boolean apagar = livroService.deletar(id);
		if (apagar) {
			
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
	}
	*/
	
}
