package cl.duoc.repuestos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.duoc.repuestos.model.Repuestos;

import java.util.Optional;

@Repository
public interface RepuestosRepository extends JpaRepository<Repuestos, Long>{
    Optional<Repuestos> findByNombre(String nombre);
}
