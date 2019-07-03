package br.com.soc.exame.web.services;

import java.util.List;

import br.com.soc.exame.ws.ExameWS;
import br.com.soc.exame.ws.ExameWSService;
import br.com.soc.exame.ws.Medico;

public class MedicoService {
	
	
	public Medico buscarMedicoPorId(Long idMedico) {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		return exameWS.buscarMedicoPorId(idMedico);
	}
	
	
	public List<Medico> getTodosMedicos() {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		return exameWS.buscarTodosOsMedicos().getMedico();
	}
	
}
