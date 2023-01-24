package agendamiento_psicologo.api_agendamiento_psicologo.agendamiento_psicologo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamientoPsicologoRepository extends JpaRepository<AgendamientoPsicologo, Long> {
 public List<AgendamientoPsicologo> findAll();

}
