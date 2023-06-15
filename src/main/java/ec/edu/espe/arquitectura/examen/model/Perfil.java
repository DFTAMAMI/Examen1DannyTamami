package ec.edu.espe.arquitectura.examen.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_PERFIL")
public class Perfil {

    @Id
    @Column(name = "COD_PERFIL", length = 8, nullable = false)
    private String codigo;
    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    public Perfil() {
    }

    public Perfil(String codigo) {
        this.codigo = codigo;
    }

}
