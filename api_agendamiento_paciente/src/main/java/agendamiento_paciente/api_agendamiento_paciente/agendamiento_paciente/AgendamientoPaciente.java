package agendamiento_paciente.api_agendamiento_paciente.agendamiento_paciente;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class AgendamientoPaciente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date fecha;
    private Time hora;
    private String motivo;
    private String psicologo;
    
}
