package br.com.soc.exame.web.services;

import java.util.List;

import br.com.soc.exame.ws.AdicionaExameDTO;
import br.com.soc.exame.ws.AdicionarUmExame;
import br.com.soc.exame.ws.AtualizaExameDTO;
import br.com.soc.exame.ws.AtualizarUmExame;
import br.com.soc.exame.ws.AtualizarUmExameResponse;
import br.com.soc.exame.ws.AutorizacaoException;
import br.com.soc.exame.ws.DeletarUmExame;
import br.com.soc.exame.ws.Exame;
import br.com.soc.exame.ws.ExameValidatorException;
import br.com.soc.exame.ws.ExameWS;
import br.com.soc.exame.ws.ExameWSService;
import br.com.soc.exame.ws.ListaExamesDTO;
import br.com.soc.exame.ws.ParametroInvalidoException;
import br.com.soc.exame.ws.Token;

public class ExameService {
	
	public List<Exame> buscarExames(Long paciente, Long medico) throws ParametroInvalidoException {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
				
		if(paciente != null && medico != null) {
			return exameWS.buscarTodosOsExamesPorMedicoEPaciente(medico, paciente).getExame();
		} else if(paciente != null) {
			return exameWS.buscarTodosOsExamesPorPaciente(paciente).getExame();
		} else if(medico != null) {
			return exameWS.buscarTodosOsExamesPorMedico(medico).getExame();
		} 
		
		return exameWS.buscarTodosOsExames().getExame();
	}
	
	
	public Exame adicionarExame(Token token, AdicionaExameDTO exame) throws AutorizacaoException, ExameValidatorException {	
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		AdicionarUmExame parameters = new AdicionarUmExame();
		parameters.setExame(exame);
		return exameWS.adicionarUmExame(parameters, token).getExame();
	}

	
	public Exame getExamePorId(Long idExame) throws ParametroInvalidoException {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		return exameWS.buscarExamePorId(idExame);
	}
	

	public List<Exame> getTodosExames() {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		return exameWS.buscarTodosOsExames().getExame();
	}
	

	public ListaExamesDTO getTodosExamesPorPaciente(Long idPaciente) throws ParametroInvalidoException {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		return exameWS.buscarTodosOsExamesPorPaciente(idPaciente);
	}

	
	public List<Exame> getTodosExamesPorMedico(Long idMedico) throws ParametroInvalidoException {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		return exameWS.buscarTodosOsExamesPorMedico(idMedico).getExame();
	}
	
	
	public List<Exame> getTodosExamesPorMedicoEPaciente(Long idMedico, Long idPaciente) throws ParametroInvalidoException {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		return exameWS.buscarTodosOsExamesPorMedicoEPaciente(idMedico, idPaciente).getExame();
	}

	
	public Exame atualizarExame(Token token, AtualizaExameDTO exame) throws AutorizacaoException, ExameValidatorException {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		AtualizarUmExame parameters = new AtualizarUmExame();
		parameters.setExame(exame);
		AtualizarUmExameResponse response = exameWS.atualizarUmExame(parameters, token);
		return response.getExame();
	}

	
	public boolean deletarExame(Token token, Long idExame) throws AutorizacaoException, ParametroInvalidoException {
		ExameWSService exameWSService = new ExameWSService();
		ExameWS	exameWS = exameWSService.getExameWS();
		DeletarUmExame parameters = new DeletarUmExame();
		parameters.setIdExame(idExame);
		return exameWS.deletarUmExame(parameters, token).isExame();
	}
	
}
