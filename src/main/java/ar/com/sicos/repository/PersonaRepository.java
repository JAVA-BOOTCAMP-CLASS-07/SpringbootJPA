package ar.com.sicos.repository;

import ar.com.sicos.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

    Iterable<Persona> findAllByNombre(String nombre);

    Optional<Persona> findFirstByNombre(String nombre);

    @Query(value = "SELECT * FROM personas p where p.nombre = :nombre limit 1", nativeQuery = true)
    Optional<Persona> buscarPrimerJuan(String nombre);

}
