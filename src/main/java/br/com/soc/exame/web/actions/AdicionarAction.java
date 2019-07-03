package br.com.soc.exame.web.actions;

import java.util.List;

import br.com.soc.exame.web.services.MedicoService;
import br.com.soc.exame.web.services.PacienteService;
import br.com.soc.exame.ws.Medico;
import br.com.soc.exame.ws.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdicionarAction {

	
	private List<Paciente> pacientes;
	private List<Medico> medicos;

	
	public String execute() {
		carregarCampos();
		return "success";
	}
	
	
	private void carregarCampos() {
		pacientes = new PacienteService().getTodosPacientes();
		medicos = new MedicoService().getTodosMedicos();
	}

}
