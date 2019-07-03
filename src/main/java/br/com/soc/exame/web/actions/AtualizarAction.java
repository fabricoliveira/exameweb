package br.com.soc.exame.web.actions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import br.com.soc.exame.web.services.ExameService;
import br.com.soc.exame.web.services.MedicoService;
import br.com.soc.exame.web.services.PacienteService;
import br.com.soc.exame.web.util.ConverterFormatoData;
import br.com.soc.exame.ws.Exame;
import br.com.soc.exame.ws.Medico;
import br.com.soc.exame.ws.Paciente;
import br.com.soc.exame.ws.ParametroInvalidoException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtualizarAction {

	private List<Paciente> pacientes;
	private Long paciente;
	private List<Medico> medicos;
	private Long medico;
	private LocalDate data;
	private LocalTime hora;
	private Long idExame;
	private String diagnostico;
	
	
	public String execute() throws ParametroInvalidoException {
		carregarCampos();
		return "success";
	}
	
	private void carregarCampos() throws ParametroInvalidoException {
		pacientes = new PacienteService().getTodosPacientes();
		medicos = new MedicoService().getTodosMedicos();
		
		Exame exame = new ExameService().getExamePorId(idExame);
		paciente = exame.getPaciente().getId();
		medico = exame.getMedico().getId();
		data = ConverterFormatoData.ConverterParaLocalDate(exame.getData());
		hora = LocalTime.parse(exame.getHora());
		diagnostico = exame.getDiagnostico();
	}
	
	
}
