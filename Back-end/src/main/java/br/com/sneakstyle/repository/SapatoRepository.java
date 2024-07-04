package br.com.sneakstyle.repository;

import br.com.sneakstyle.model.Sapato;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SapatoRepository extends JpaRepository<Sapato, Long> {

    Page<Sapato> findAllByAtivoTrue(Pageable pagina);
}
