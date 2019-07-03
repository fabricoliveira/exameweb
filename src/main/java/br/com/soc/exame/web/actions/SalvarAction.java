package br.com.soc.exame.web.actions;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.soc.exame.web.services.ExameService;
import br.com.soc.exame.web.services.MedicoService;
import br.com.soc.exame.web.services.PacienteService;
import br.com.soc.exame.web.util.ConverterFormatoData;
import br.com.soc.exame.ws.AdicionaExameDTO;
import br.com.soc.exame.ws.AtualizaExameDTO;
import br.com.soc.exame.ws.AutorizacaoException;
import br.com.soc.exame.ws.ExameValidatorException;
import br.com.soc.exame.ws.Medico;
import br.com.soc.exame.ws.Paciente;
import br.com.soc.exame.ws.Token;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalvarAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	
	private List<Paciente> pacientes;
	private Long paciente;
	private List<Medico> medicos;
	private Long medico;
	private String data;
	private String hora;
	private Long idExame;
	private String diagnostico;
	
	
	public String execute() throws AutorizacaoException, ExameValidatorException {
		Token token = new Token();
		token.setToken("BBB");
		
		data = ConverterFormatoData.converterParaDiaMesAno(data);
		try {
			if(idExame == null) {
				AdicionaExameDTO exame = new AdicionaExameDTO();
				exame.setData(data);
				exame.setHora(hora);
				exame.setDiagnostico(diagnostico);
				exame.setIdPaciente(paciente);
				exame.setIdMedico(medico);
				new ExameService().adicionarExame(token, exame);
				return SUCCESS;
			} else {
				AtualizaExameDTO exame = new AtualizaExameDTO();
				exame.setId(idExame);
				exame.setData(data);
				exame.setHora(hora);
				exame.setDiagnostico(diagnostico);
				exame.setIdPaciente(paciente);
				exame.setIdMedico(medico);
				new ExameService().atualizarExame(token, exame);
				return SUCCESS;
			}
		} catch(Exception e) {
			carregarCampos();
			addActionError(e.getMessage());
			return ERROR;
		}
		
	}
	
	
	private void carregarCampos() {
		pacientes = new PacienteService().getTodosPacientes();
		medicos = new MedicoService().getTodosMedicos();
	}
	
	
	@Override
	public void validate() {
		
		super.validate();
		
		if(paciente == null) {
			addActionError("O campo Paciente não pode ficar em branco.");
		}
		
		if(medico == null) {
			addActionError("O campo Médico não pode ficar em branco.");
		}
		
		if(data == null || data.trim().equals("")) {
			addActionError("O campo Data não pode ficar em branco.");
		}
		
		if(hora == null || hora.trim().equals("")) {
			addActionError("O campo Hora não pode ficar em branco.");
		}
		
		if(diagnostico != null && !diagnostico.trim().equals("")) {
			if(diagnostico.length() < 3 || diagnostico.length() > 250) {
				addActionError("O campo Diagnóstico deve conter no mínimo 3 e no máximo 250 caracteres.");
			}
		}
		
		if(hasActionErrors()) {
			carregarCampos();
		}
		
	}

}
