
package br.com.soc.exame.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExameWS", targetNamespace = "http://ws.exame.soc.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExameWS {


    /**
     * 
     * @param idPaciente
     * @return
     *     returns br.com.soc.exame.ws.ListaExamesDTO
     * @throws ParametroInvalidoException
     */
    @WebMethod(operationName = "BuscarTodosOsExamesPorPaciente", action = "BuscarTodosOsExamesPorPaciente")
    @WebResult(name = "exames", targetNamespace = "")
    @RequestWrapper(localName = "BuscarTodosOsExamesPorPaciente", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsExamesPorPaciente")
    @ResponseWrapper(localName = "BuscarTodosOsExamesPorPacienteResponse", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsExamesPorPacienteResponse")
    public ListaExamesDTO buscarTodosOsExamesPorPaciente(
        @WebParam(name = "idPaciente", targetNamespace = "")
        Long idPaciente)
        throws ParametroInvalidoException
    ;

    /**
     * 
     * @return
     *     returns br.com.soc.exame.ws.ListaMedicosDTO
     */
    @WebMethod(operationName = "BuscarTodosOsMedicos", action = "BuscarTodosOsMedicos")
    @WebResult(name = "medicos", targetNamespace = "")
    @RequestWrapper(localName = "BuscarTodosOsMedicos", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsMedicos")
    @ResponseWrapper(localName = "BuscarTodosOsMedicosResponse", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsMedicosResponse")
    public ListaMedicosDTO buscarTodosOsMedicos();

    /**
     * 
     * @return
     *     returns br.com.soc.exame.ws.ListaExamesDTO
     */
    @WebMethod(operationName = "BuscarTodosOsExames", action = "BuscarTodosOsExames")
    @WebResult(name = "exames", targetNamespace = "")
    @RequestWrapper(localName = "BuscarTodosOsExames", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsExames")
    @ResponseWrapper(localName = "BuscarTodosOsExamesResponse", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsExamesResponse")
    public ListaExamesDTO buscarTodosOsExames();

    /**
     * 
     * @param parameters
     * @param token
     * @return
     *     returns br.com.soc.exame.ws.AdicionarUmExameResponse
     * @throws AutorizacaoException
     * @throws ExameValidatorException
     */
    @WebMethod(operationName = "AdicionarUmExame", action = "AdicionarUmExame")
    @WebResult(name = "AdicionarUmExameResponse", targetNamespace = "http://ws.exame.soc.com.br/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public AdicionarUmExameResponse adicionarUmExame(
        @WebParam(name = "AdicionarUmExame", targetNamespace = "http://ws.exame.soc.com.br/", partName = "parameters")
        AdicionarUmExame parameters,
        @WebParam(name = "token", targetNamespace = "http://ws.exame.soc.com.br/", header = true, partName = "token")
        Token token)
        throws AutorizacaoException, ExameValidatorException
    ;

    /**
     * 
     * @param idExame
     * @return
     *     returns br.com.soc.exame.ws.Exame
     * @throws ParametroInvalidoException
     */
    @WebMethod(operationName = "BuscarExamePorId", action = "BuscarExamePorId")
    @WebResult(name = "exame", targetNamespace = "")
    @RequestWrapper(localName = "BuscarExamePorId", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarExamePorId")
    @ResponseWrapper(localName = "BuscarExamePorIdResponse", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarExamePorIdResponse")
    public Exame buscarExamePorId(
        @WebParam(name = "idExame", targetNamespace = "")
        Long idExame)
        throws ParametroInvalidoException
    ;

    /**
     * 
     * @param parameters
     * @param token
     * @return
     *     returns br.com.soc.exame.ws.DeletarUmExameResponse
     * @throws AutorizacaoException
     * @throws ParametroInvalidoException
     */
    @WebMethod(operationName = "DeletarUmExame", action = "DeletarUmExame")
    @WebResult(name = "DeletarUmExameResponse", targetNamespace = "http://ws.exame.soc.com.br/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public DeletarUmExameResponse deletarUmExame(
        @WebParam(name = "DeletarUmExame", targetNamespace = "http://ws.exame.soc.com.br/", partName = "parameters")
        DeletarUmExame parameters,
        @WebParam(name = "token", targetNamespace = "http://ws.exame.soc.com.br/", header = true, partName = "token")
        Token token)
        throws AutorizacaoException, ParametroInvalidoException
    ;

    /**
     * 
     * @param idPaciente
     * @return
     *     returns br.com.soc.exame.ws.Paciente
     */
    @WebMethod(operationName = "BuscarPacientePorId", action = "BuscarPacientePorId")
    @WebResult(name = "paciente", targetNamespace = "")
    @RequestWrapper(localName = "BuscarPacientePorId", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarPacientePorId")
    @ResponseWrapper(localName = "BuscarPacientePorIdResponse", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarPacientePorIdResponse")
    public Paciente buscarPacientePorId(
        @WebParam(name = "idPaciente", targetNamespace = "")
        Long idPaciente);

    /**
     * 
     * @param parameters
     * @param token
     * @return
     *     returns br.com.soc.exame.ws.AtualizarUmExameResponse
     * @throws AutorizacaoException
     * @throws ExameValidatorException
     */
    @WebMethod(operationName = "AtualizarUmExame", action = "AtualizarUmExame")
    @WebResult(name = "AtualizarUmExameResponse", targetNamespace = "http://ws.exame.soc.com.br/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public AtualizarUmExameResponse atualizarUmExame(
        @WebParam(name = "AtualizarUmExame", targetNamespace = "http://ws.exame.soc.com.br/", partName = "parameters")
        AtualizarUmExame parameters,
        @WebParam(name = "token", targetNamespace = "http://ws.exame.soc.com.br/", header = true, partName = "token")
        Token token)
        throws AutorizacaoException, ExameValidatorException
    ;

    /**
     * 
     * @param idPaciente
     * @param idMedico
     * @return
     *     returns br.com.soc.exame.ws.ListaExamesDTO
     * @throws ParametroInvalidoException
     */
    @WebMethod(operationName = "BuscarTodosOsExamesPorMedicoEPaciente", action = "BuscarTodosOsExamesPorMedicoEPaciente")
    @WebResult(name = "exames", targetNamespace = "")
    @RequestWrapper(localName = "BuscarTodosOsExamesPorMedicoEPaciente", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsExamesPorMedicoEPaciente")
    @ResponseWrapper(localName = "BuscarTodosOsExamesPorMedicoEPacienteResponse", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsExamesPorMedicoEPacienteResponse")
    public ListaExamesDTO buscarTodosOsExamesPorMedicoEPaciente(
        @WebParam(name = "idMedico", targetNamespace = "")
        Long idMedico,
        @WebParam(name = "idPaciente", targetNamespace = "")
        Long idPaciente)
        throws ParametroInvalidoException
    ;

    /**
     * 
     * @param idMedico
     * @return
     *     returns br.com.soc.exame.ws.Medico
     */
    @WebMethod(operationName = "BuscarMedicoPorId", action = "BuscarMedicoPorId")
    @WebResult(name = "medico", targetNamespace = "")
    @RequestWrapper(localName = "BuscarMedicoPorId", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarMedicoPorId")
    @ResponseWrapper(localName = "BuscarMedicoPorIdResponse", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarMedicoPorIdResponse")
    public Medico buscarMedicoPorId(
        @WebParam(name = "idMedico", targetNamespace = "")
        Long idMedico);

    /**
     * 
     * @return
     *     returns br.com.soc.exame.ws.ListaPacientesDTO
     */
    @WebMethod(operationName = "BuscarTodosOsPacientes", action = "BuscarTodosOsPacientes")
    @WebResult(name = "pacientes", targetNamespace = "")
    @RequestWrapper(localName = "BuscarTodosOsPacientes", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsPacientes")
    @ResponseWrapper(localName = "BuscarTodosOsPacientesResponse", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsPacientesResponse")
    public ListaPacientesDTO buscarTodosOsPacientes();

    /**
     * 
     * @param idMedico
     * @return
     *     returns br.com.soc.exame.ws.ListaExamesDTO
     * @throws ParametroInvalidoException
     */
    @WebMethod(operationName = "BuscarTodosOsExamesPorMedico", action = "BuscarTodosOsExamesPorMedico")
    @WebResult(name = "exames", targetNamespace = "")
    @RequestWrapper(localName = "BuscarTodosOsExamesPorMedico", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsExamesPorMedico")
    @ResponseWrapper(localName = "BuscarTodosOsExamesPorMedicoResponse", targetNamespace = "http://ws.exame.soc.com.br/", className = "br.com.soc.exame.ws.BuscarTodosOsExamesPorMedicoResponse")
    public ListaExamesDTO buscarTodosOsExamesPorMedico(
        @WebParam(name = "idMedico", targetNamespace = "")
        Long idMedico)
        throws ParametroInvalidoException
    ;

}
