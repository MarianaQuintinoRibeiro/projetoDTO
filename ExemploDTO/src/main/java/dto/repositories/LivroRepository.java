package dto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro,Long> {

}
