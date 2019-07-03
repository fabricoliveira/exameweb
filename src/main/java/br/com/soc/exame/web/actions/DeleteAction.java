package br.com.soc.exame.web.actions;

import com.opensymphony.xwork2.ActionSupport;

import br.com.soc.exame.web.services.ExameService;
import br.com.soc.exame.ws.AutorizacaoException;
import br.com.soc.exame.ws.ParametroInvalidoException;
import br.com.soc.exame.ws.Token;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeleteAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private Long medico;
	private Long paciente;
	private Long idExame;
	
	
	public String execute() throws AutorizacaoException, ParametroInvalidoException {
		deletarExame();
		return "success";
	}
	
	
	public String deletarExame() throws AutorizacaoException, ParametroInvalidoException {
		Token token = new Token();
		token.setToken("BBB");
		
		try {
			new ExameService().deletarExame(token, idExame);
			return SUCCESS;			
		} catch(Exception e) {
			addActionError(e.getMessage());
			return ERROR;
		}
		
	}
	
}
