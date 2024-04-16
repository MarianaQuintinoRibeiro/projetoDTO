package dto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.DTO.LivroDTO;
import dto.entities.Livro;
import dto.repositories.LivroRepository;

@Service
public class LivroService {

	private final LivroRepository livroRepository;

	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	public List<Livro> buscaTodos() {
		return livroRepository.findAll();
	}

	public Livro buscaPorId(Long id) {
		return livroRepository.findById(id).orElse(null);
	}
	public LivroDTO salvar(Livro livro) { 
		Livro salvarLivro =	 livroRepository.save(livro); 
		return new LivroDTO(salvarLivro.
			 }
	 /* 
	 * public LivroDTO atualizar (Long id, Livro livro) { Livro exiteLivro =
	 * livroRepository.findById(id) .orElseThrow(() -> new RuntimeException("livro "
	 * + "não encontrado")); exiteLivro.setTitulo(livro.getTitulo());
	 * exiteLivro.setAutor(livroAutor()); Livro updateLivro =
	 * livroRepository.save(exiteLivro); return new LivroDTO (updateLivro.getId(),
	 * updateLivro.getTitulo(), updateLivro.getAutor()); }
	 * 
	 * public boolean deletar (Long id) { Optional<Livro> exiteLivro =
	 * livroRepository.findById(id); if (exiteLivro.isPresent()) {
	 * livroRepository.deleteById(id); return true; } else { return false; } }
	 */

}
