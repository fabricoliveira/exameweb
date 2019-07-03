package br.com.soc.exame.web.services;

import java.util.List;

import br.com.soc.exame.ws.ExameWS;
import br.com.soc.exame.ws.ExameWSService;
import br.com.soc.exame.ws.Paciente;

public class PacienteService {
	
	
	public Paciente buscarPacientePorId(Long idPaciente) {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		return exameWS.buscarPacientePorId(idPaciente);
	}


	public List<Paciente> getTodosPacientes() {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		return exameWS.buscarTodosOsPacientes().getPaciente();
	}
	
}
