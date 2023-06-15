package ec.edu.espe.arquitectura.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.UsuarioPerfil;
import ec.edu.espe.arquitectura.examen.model.UsuarioPerfilPK;

public interface UsuarioPerfilRepository extends JpaRepository<UsuarioPerfil, UsuarioPerfilPK> {

}
