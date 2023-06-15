package ec.edu.espe.arquitectura.examen.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByEmailLikeOrderByEmail(String emailPattern);

    List<Usuario> findByNombre(String nombrePattern);

    List<Usuario> findByNombreLikeOrderByNombre(String nombrePattern);

    List<Usuario> findByFechaNacimiento(Date fechaNacimiento);

    Usuario findByEmail(String emailPattern);
}
