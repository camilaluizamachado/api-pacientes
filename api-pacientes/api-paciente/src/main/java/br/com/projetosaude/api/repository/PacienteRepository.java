package br.com.projetosaude.api.repository;

import br.com.projetosaude.api.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    // Os métodos básicos do JpaRepository já são suficientes por agora.
}
