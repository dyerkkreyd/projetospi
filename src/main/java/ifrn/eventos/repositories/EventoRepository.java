package ifrn.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {
	

}
