package br.com.sneakstyle.repository;

import br.com.sneakstyle.model.Sapato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SapatoRepository extends JpaRepository<Sapato, Long> {

}
