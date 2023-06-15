package ec.edu.espe.arquitectura.examen.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.model.Perfil;
import ec.edu.espe.arquitectura.examen.repository.PerfilRepository;

@Service
public class PerfilService {
    private final PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    public List<Perfil> obtainAllPerfilOrderByNombre(String perfilPattern) {
        if (perfilPattern != null) {
            return this.perfilRepository.findByNombreLikeOrderByNombre(perfilPattern);
        } else {
            return this.perfilRepository.findAll();
        }
    }
}
