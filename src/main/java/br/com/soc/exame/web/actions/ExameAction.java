package br.com.soc.exame.web.actions;

import java.util.List;

import br.com.soc.exame.web.services.ExameService;
import br.com.soc.exame.web.services.MedicoService;
import br.com.soc.exame.web.services.PacienteService;
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
public class ExameAction {

	
	private List<Paciente> pacientes;
	private Long paciente;
	private List<Medico> medicos;
	private Long medico;
	private List<Exame> exames;
	private Long idExame;
	
	
	public String execute() {
		carregarCampos();
		
		return "success";
	}
	
	
	private void carregarCampos() {
		pacientes = new PacienteService().getTodosPacientes();
		medicos = new MedicoService().getTodosMedicos();
	}
	
	
	public String buscarExames() throws ParametroInvalidoException {
		carregarCampos();
		exames = new ExameService().buscarExames(paciente, medico);
		return "success";
	}

	
}
