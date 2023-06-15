package ec.edu.espe.arquitectura.examen.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.model.Usuario;
import ec.edu.espe.arquitectura.examen.repository.UsuarioRepository;
import jakarta.transaction.Transactional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Optional<Usuario> obtainByCode(Integer code) {
        return this.usuarioRepository.findById(code);
    }

    @Transactional(value = Transactional.TxType.REQUIRED)
    public Usuario create(Usuario usuario) {

        Usuario usuarioTmp = this.usuarioRepository.findByEmail(usuario.getEmail());

        if (usuarioTmp == null) {
            return this.usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("Usuario ya existe");
        }
    }
}
