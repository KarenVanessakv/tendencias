package agendamiento_paciente.api_agendamiento_paciente.agendamiento_paciente;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamientoPacienteRepository extends JpaRepository<AgendamientoPaciente, Long> {
 public List<AgendamientoPaciente> findAll();

}
