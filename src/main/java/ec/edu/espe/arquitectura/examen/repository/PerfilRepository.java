package ec.edu.espe.arquitectura.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, String> {

    List<Perfil> findByNombre(String nombrePattern);

    List<Perfil> findByNombreLikeOrderByNombre(String nombrePattern);

}
