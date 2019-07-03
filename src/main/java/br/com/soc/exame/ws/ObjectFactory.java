
package br.com.soc.exame.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.soc.exame.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarTodosOsExamesPorPaciente_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsExamesPorPaciente");
    private final static QName _AdicionarUmExame_QNAME = new QName("http://ws.exame.soc.com.br/", "AdicionarUmExame");
    private final static QName _BuscarTodosOsExamesResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsExamesResponse");
    private final static QName _BuscarTodosOsExamesPorMedicoResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsExamesPorMedicoResponse");
    private final static QName _AdicionaExameDTO_QNAME = new QName("http://ws.exame.soc.com.br/", "adicionaExameDTO");
    private final static QName _AtualizarUmExame_QNAME = new QName("http://ws.exame.soc.com.br/", "AtualizarUmExame");
    private final static QName _BuscarTodosOsExamesPorMedicoEPaciente_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsExamesPorMedicoEPaciente");
    private final static QName _Exame_QNAME = new QName("http://ws.exame.soc.com.br/", "exame");
    private final static QName _DeletarUmExameResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "DeletarUmExameResponse");
    private final static QName _BuscarTodosOsPacientes_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsPacientes");
    private final static QName _ExameFault_QNAME = new QName("http://ws.exame.soc.com.br/", "ExameFault");
    private final static QName _BuscarMedicoPorIdResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarMedicoPorIdResponse");
    private final static QName _Token_QNAME = new QName("http://ws.exame.soc.com.br/", "token");
    private final static QName _BuscarTodosOsExamesPorMedico_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsExamesPorMedico");
    private final static QName _AtualizaExameDTO_QNAME = new QName("http://ws.exame.soc.com.br/", "atualizaExameDTO");
    private final static QName _ListaPacientesDTO_QNAME = new QName("http://ws.exame.soc.com.br/", "listaPacientesDTO");
    private final static QName _BuscarTodosOsExames_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsExames");
    private final static QName _BuscarTodosOsMedicos_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsMedicos");
    private final static QName _BuscarExamePorIdResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarExamePorIdResponse");
    private final static QName _ParametroInvalidoFault_QNAME = new QName("http://ws.exame.soc.com.br/", "ParametroInvalidoFault");
    private final static QName _AdicionarUmExameResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "AdicionarUmExameResponse");
    private final static QName _BuscarExamePorId_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarExamePorId");
    private final static QName _BuscarTodosOsMedicosResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsMedicosResponse");
    private final static QName _DeletarUmExame_QNAME = new QName("http://ws.exame.soc.com.br/", "DeletarUmExame");
    private final static QName _BuscarPacientePorId_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarPacientePorId");
    private final static QName _ListaMedicosDTO_QNAME = new QName("http://ws.exame.soc.com.br/", "listaMedicosDTO");
    private final static QName _ListaExamesDTO_QNAME = new QName("http://ws.exame.soc.com.br/", "listaExamesDTO");
    private final static QName _BuscarTodosOsExamesPorMedicoEPacienteResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsExamesPorMedicoEPacienteResponse");
    private final static QName _BuscarMedicoPorId_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarMedicoPorId");
    private final static QName _BuscarTodosOsPacientesResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsPacientesResponse");
    private final static QName _AutorizacaoFault_QNAME = new QName("http://ws.exame.soc.com.br/", "AutorizacaoFault");
    private final static QName _BuscarPacientePorIdResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarPacientePorIdResponse");
    private final static QName _BuscarTodosOsExamesPorPacienteResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "BuscarTodosOsExamesPorPacienteResponse");
    private final static QName _AtualizarUmExameResponse_QNAME = new QName("http://ws.exame.soc.com.br/", "AtualizarUmExameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.soc.exame.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarTodosOsExamesPorMedicoEPacienteResponse }
     * 
     */
    public BuscarTodosOsExamesPorMedicoEPacienteResponse createBuscarTodosOsExamesPorMedicoEPacienteResponse() {
        return new BuscarTodosOsExamesPorMedicoEPacienteResponse();
    }

    /**
     * Create an instance of {@link BuscarTodosOsPacientesResponse }
     * 
     */
    public BuscarTodosOsPacientesResponse createBuscarTodosOsPacientesResponse() {
        return new BuscarTodosOsPacientesResponse();
    }

    /**
     * Create an instance of {@link BuscarMedicoPorId }
     * 
     */
    public BuscarMedicoPorId createBuscarMedicoPorId() {
        return new BuscarMedicoPorId();
    }

    /**
     * Create an instance of {@link BuscarTodosOsExamesPorPacienteResponse }
     * 
     */
    public BuscarTodosOsExamesPorPacienteResponse createBuscarTodosOsExamesPorPacienteResponse() {
        return new BuscarTodosOsExamesPorPacienteResponse();
    }

    /**
     * Create an instance of {@link BuscarPacientePorIdResponse }
     * 
     */
    public BuscarPacientePorIdResponse createBuscarPacientePorIdResponse() {
        return new BuscarPacientePorIdResponse();
    }

    /**
     * Create an instance of {@link AtualizarUmExameResponse }
     * 
     */
    public AtualizarUmExameResponse createAtualizarUmExameResponse() {
        return new AtualizarUmExameResponse();
    }

    /**
     * Create an instance of {@link ListaPacientesDTO }
     * 
     */
    public ListaPacientesDTO createListaPacientesDTO() {
        return new ListaPacientesDTO();
    }

    /**
     * Create an instance of {@link BuscarExamePorIdResponse }
     * 
     */
    public BuscarExamePorIdResponse createBuscarExamePorIdResponse() {
        return new BuscarExamePorIdResponse();
    }

    /**
     * Create an instance of {@link BuscarTodosOsExames }
     * 
     */
    public BuscarTodosOsExames createBuscarTodosOsExames() {
        return new BuscarTodosOsExames();
    }

    /**
     * Create an instance of {@link BuscarTodosOsMedicos }
     * 
     */
    public BuscarTodosOsMedicos createBuscarTodosOsMedicos() {
        return new BuscarTodosOsMedicos();
    }

    /**
     * Create an instance of {@link AdicionarUmExameResponse }
     * 
     */
    public AdicionarUmExameResponse createAdicionarUmExameResponse() {
        return new AdicionarUmExameResponse();
    }

    /**
     * Create an instance of {@link BuscarExamePorId }
     * 
     */
    public BuscarExamePorId createBuscarExamePorId() {
        return new BuscarExamePorId();
    }

    /**
     * Create an instance of {@link BuscarTodosOsMedicosResponse }
     * 
     */
    public BuscarTodosOsMedicosResponse createBuscarTodosOsMedicosResponse() {
        return new BuscarTodosOsMedicosResponse();
    }

    /**
     * Create an instance of {@link BuscarPacientePorId }
     * 
     */
    public BuscarPacientePorId createBuscarPacientePorId() {
        return new BuscarPacientePorId();
    }

    /**
     * Create an instance of {@link DeletarUmExame }
     * 
     */
    public DeletarUmExame createDeletarUmExame() {
        return new DeletarUmExame();
    }

    /**
     * Create an instance of {@link ListaExamesDTO }
     * 
     */
    public ListaExamesDTO createListaExamesDTO() {
        return new ListaExamesDTO();
    }

    /**
     * Create an instance of {@link ListaMedicosDTO }
     * 
     */
    public ListaMedicosDTO createListaMedicosDTO() {
        return new ListaMedicosDTO();
    }

    /**
     * Create an instance of {@link BuscarTodosOsExamesPorMedicoEPaciente }
     * 
     */
    public BuscarTodosOsExamesPorMedicoEPaciente createBuscarTodosOsExamesPorMedicoEPaciente() {
        return new BuscarTodosOsExamesPorMedicoEPaciente();
    }

    /**
     * Create an instance of {@link Exame }
     * 
     */
    public Exame createExame() {
        return new Exame();
    }

    /**
     * Create an instance of {@link DeletarUmExameResponse }
     * 
     */
    public DeletarUmExameResponse createDeletarUmExameResponse() {
        return new DeletarUmExameResponse();
    }

    /**
     * Create an instance of {@link BuscarTodosOsPacientes }
     * 
     */
    public BuscarTodosOsPacientes createBuscarTodosOsPacientes() {
        return new BuscarTodosOsPacientes();
    }

    /**
     * Create an instance of {@link BuscarMedicoPorIdResponse }
     * 
     */
    public BuscarMedicoPorIdResponse createBuscarMedicoPorIdResponse() {
        return new BuscarMedicoPorIdResponse();
    }

    /**
     * Create an instance of {@link BuscarTodosOsExamesPorMedico }
     * 
     */
    public BuscarTodosOsExamesPorMedico createBuscarTodosOsExamesPorMedico() {
        return new BuscarTodosOsExamesPorMedico();
    }

    /**
     * Create an instance of {@link AtualizaExameDTO }
     * 
     */
    public AtualizaExameDTO createAtualizaExameDTO() {
        return new AtualizaExameDTO();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link BuscarTodosOsExamesPorPaciente }
     * 
     */
    public BuscarTodosOsExamesPorPaciente createBuscarTodosOsExamesPorPaciente() {
        return new BuscarTodosOsExamesPorPaciente();
    }

    /**
     * Create an instance of {@link AdicionarUmExame }
     * 
     */
    public AdicionarUmExame createAdicionarUmExame() {
        return new AdicionarUmExame();
    }

    /**
     * Create an instance of {@link BuscarTodosOsExamesResponse }
     * 
     */
    public BuscarTodosOsExamesResponse createBuscarTodosOsExamesResponse() {
        return new BuscarTodosOsExamesResponse();
    }

    /**
     * Create an instance of {@link BuscarTodosOsExamesPorMedicoResponse }
     * 
     */
    public BuscarTodosOsExamesPorMedicoResponse createBuscarTodosOsExamesPorMedicoResponse() {
        return new BuscarTodosOsExamesPorMedicoResponse();
    }

    /**
     * Create an instance of {@link AdicionaExameDTO }
     * 
     */
    public AdicionaExameDTO createAdicionaExameDTO() {
        return new AdicionaExameDTO();
    }

    /**
     * Create an instance of {@link AtualizarUmExame }
     * 
     */
    public AtualizarUmExame createAtualizarUmExame() {
        return new AtualizarUmExame();
    }

    /**
     * Create an instance of {@link Paciente }
     * 
     */
    public Paciente createPaciente() {
        return new Paciente();
    }

    /**
     * Create an instance of {@link Medico }
     * 
     */
    public Medico createMedico() {
        return new Medico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsExamesPorPaciente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsExamesPorPaciente")
    public JAXBElement<BuscarTodosOsExamesPorPaciente> createBuscarTodosOsExamesPorPaciente(BuscarTodosOsExamesPorPaciente value) {
        return new JAXBElement<BuscarTodosOsExamesPorPaciente>(_BuscarTodosOsExamesPorPaciente_QNAME, BuscarTodosOsExamesPorPaciente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarUmExame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "AdicionarUmExame")
    public JAXBElement<AdicionarUmExame> createAdicionarUmExame(AdicionarUmExame value) {
        return new JAXBElement<AdicionarUmExame>(_AdicionarUmExame_QNAME, AdicionarUmExame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsExamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsExamesResponse")
    public JAXBElement<BuscarTodosOsExamesResponse> createBuscarTodosOsExamesResponse(BuscarTodosOsExamesResponse value) {
        return new JAXBElement<BuscarTodosOsExamesResponse>(_BuscarTodosOsExamesResponse_QNAME, BuscarTodosOsExamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsExamesPorMedicoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsExamesPorMedicoResponse")
    public JAXBElement<BuscarTodosOsExamesPorMedicoResponse> createBuscarTodosOsExamesPorMedicoResponse(BuscarTodosOsExamesPorMedicoResponse value) {
        return new JAXBElement<BuscarTodosOsExamesPorMedicoResponse>(_BuscarTodosOsExamesPorMedicoResponse_QNAME, BuscarTodosOsExamesPorMedicoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionaExameDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "adicionaExameDTO")
    public JAXBElement<AdicionaExameDTO> createAdicionaExameDTO(AdicionaExameDTO value) {
        return new JAXBElement<AdicionaExameDTO>(_AdicionaExameDTO_QNAME, AdicionaExameDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarUmExame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "AtualizarUmExame")
    public JAXBElement<AtualizarUmExame> createAtualizarUmExame(AtualizarUmExame value) {
        return new JAXBElement<AtualizarUmExame>(_AtualizarUmExame_QNAME, AtualizarUmExame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsExamesPorMedicoEPaciente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsExamesPorMedicoEPaciente")
    public JAXBElement<BuscarTodosOsExamesPorMedicoEPaciente> createBuscarTodosOsExamesPorMedicoEPaciente(BuscarTodosOsExamesPorMedicoEPaciente value) {
        return new JAXBElement<BuscarTodosOsExamesPorMedicoEPaciente>(_BuscarTodosOsExamesPorMedicoEPaciente_QNAME, BuscarTodosOsExamesPorMedicoEPaciente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "exame")
    public JAXBElement<Exame> createExame(Exame value) {
        return new JAXBElement<Exame>(_Exame_QNAME, Exame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarUmExameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "DeletarUmExameResponse")
    public JAXBElement<DeletarUmExameResponse> createDeletarUmExameResponse(DeletarUmExameResponse value) {
        return new JAXBElement<DeletarUmExameResponse>(_DeletarUmExameResponse_QNAME, DeletarUmExameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsPacientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsPacientes")
    public JAXBElement<BuscarTodosOsPacientes> createBuscarTodosOsPacientes(BuscarTodosOsPacientes value) {
        return new JAXBElement<BuscarTodosOsPacientes>(_BuscarTodosOsPacientes_QNAME, BuscarTodosOsPacientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "ExameFault")
    public JAXBElement<String> createExameFault(String value) {
        return new JAXBElement<String>(_ExameFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMedicoPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarMedicoPorIdResponse")
    public JAXBElement<BuscarMedicoPorIdResponse> createBuscarMedicoPorIdResponse(BuscarMedicoPorIdResponse value) {
        return new JAXBElement<BuscarMedicoPorIdResponse>(_BuscarMedicoPorIdResponse_QNAME, BuscarMedicoPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsExamesPorMedico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsExamesPorMedico")
    public JAXBElement<BuscarTodosOsExamesPorMedico> createBuscarTodosOsExamesPorMedico(BuscarTodosOsExamesPorMedico value) {
        return new JAXBElement<BuscarTodosOsExamesPorMedico>(_BuscarTodosOsExamesPorMedico_QNAME, BuscarTodosOsExamesPorMedico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizaExameDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "atualizaExameDTO")
    public JAXBElement<AtualizaExameDTO> createAtualizaExameDTO(AtualizaExameDTO value) {
        return new JAXBElement<AtualizaExameDTO>(_AtualizaExameDTO_QNAME, AtualizaExameDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPacientesDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "listaPacientesDTO")
    public JAXBElement<ListaPacientesDTO> createListaPacientesDTO(ListaPacientesDTO value) {
        return new JAXBElement<ListaPacientesDTO>(_ListaPacientesDTO_QNAME, ListaPacientesDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsExames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsExames")
    public JAXBElement<BuscarTodosOsExames> createBuscarTodosOsExames(BuscarTodosOsExames value) {
        return new JAXBElement<BuscarTodosOsExames>(_BuscarTodosOsExames_QNAME, BuscarTodosOsExames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsMedicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsMedicos")
    public JAXBElement<BuscarTodosOsMedicos> createBuscarTodosOsMedicos(BuscarTodosOsMedicos value) {
        return new JAXBElement<BuscarTodosOsMedicos>(_BuscarTodosOsMedicos_QNAME, BuscarTodosOsMedicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarExamePorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarExamePorIdResponse")
    public JAXBElement<BuscarExamePorIdResponse> createBuscarExamePorIdResponse(BuscarExamePorIdResponse value) {
        return new JAXBElement<BuscarExamePorIdResponse>(_BuscarExamePorIdResponse_QNAME, BuscarExamePorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "ParametroInvalidoFault")
    public JAXBElement<String> createParametroInvalidoFault(String value) {
        return new JAXBElement<String>(_ParametroInvalidoFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdicionarUmExameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "AdicionarUmExameResponse")
    public JAXBElement<AdicionarUmExameResponse> createAdicionarUmExameResponse(AdicionarUmExameResponse value) {
        return new JAXBElement<AdicionarUmExameResponse>(_AdicionarUmExameResponse_QNAME, AdicionarUmExameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarExamePorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarExamePorId")
    public JAXBElement<BuscarExamePorId> createBuscarExamePorId(BuscarExamePorId value) {
        return new JAXBElement<BuscarExamePorId>(_BuscarExamePorId_QNAME, BuscarExamePorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsMedicosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsMedicosResponse")
    public JAXBElement<BuscarTodosOsMedicosResponse> createBuscarTodosOsMedicosResponse(BuscarTodosOsMedicosResponse value) {
        return new JAXBElement<BuscarTodosOsMedicosResponse>(_BuscarTodosOsMedicosResponse_QNAME, BuscarTodosOsMedicosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarUmExame }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "DeletarUmExame")
    public JAXBElement<DeletarUmExame> createDeletarUmExame(DeletarUmExame value) {
        return new JAXBElement<DeletarUmExame>(_DeletarUmExame_QNAME, DeletarUmExame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPacientePorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarPacientePorId")
    public JAXBElement<BuscarPacientePorId> createBuscarPacientePorId(BuscarPacientePorId value) {
        return new JAXBElement<BuscarPacientePorId>(_BuscarPacientePorId_QNAME, BuscarPacientePorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaMedicosDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "listaMedicosDTO")
    public JAXBElement<ListaMedicosDTO> createListaMedicosDTO(ListaMedicosDTO value) {
        return new JAXBElement<ListaMedicosDTO>(_ListaMedicosDTO_QNAME, ListaMedicosDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaExamesDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "listaExamesDTO")
    public JAXBElement<ListaExamesDTO> createListaExamesDTO(ListaExamesDTO value) {
        return new JAXBElement<ListaExamesDTO>(_ListaExamesDTO_QNAME, ListaExamesDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsExamesPorMedicoEPacienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsExamesPorMedicoEPacienteResponse")
    public JAXBElement<BuscarTodosOsExamesPorMedicoEPacienteResponse> createBuscarTodosOsExamesPorMedicoEPacienteResponse(BuscarTodosOsExamesPorMedicoEPacienteResponse value) {
        return new JAXBElement<BuscarTodosOsExamesPorMedicoEPacienteResponse>(_BuscarTodosOsExamesPorMedicoEPacienteResponse_QNAME, BuscarTodosOsExamesPorMedicoEPacienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarMedicoPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarMedicoPorId")
    public JAXBElement<BuscarMedicoPorId> createBuscarMedicoPorId(BuscarMedicoPorId value) {
        return new JAXBElement<BuscarMedicoPorId>(_BuscarMedicoPorId_QNAME, BuscarMedicoPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsPacientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsPacientesResponse")
    public JAXBElement<BuscarTodosOsPacientesResponse> createBuscarTodosOsPacientesResponse(BuscarTodosOsPacientesResponse value) {
        return new JAXBElement<BuscarTodosOsPacientesResponse>(_BuscarTodosOsPacientesResponse_QNAME, BuscarTodosOsPacientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "AutorizacaoFault")
    public JAXBElement<String> createAutorizacaoFault(String value) {
        return new JAXBElement<String>(_AutorizacaoFault_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPacientePorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarPacientePorIdResponse")
    public JAXBElement<BuscarPacientePorIdResponse> createBuscarPacientePorIdResponse(BuscarPacientePorIdResponse value) {
        return new JAXBElement<BuscarPacientePorIdResponse>(_BuscarPacientePorIdResponse_QNAME, BuscarPacientePorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarTodosOsExamesPorPacienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "BuscarTodosOsExamesPorPacienteResponse")
    public JAXBElement<BuscarTodosOsExamesPorPacienteResponse> createBuscarTodosOsExamesPorPacienteResponse(BuscarTodosOsExamesPorPacienteResponse value) {
        return new JAXBElement<BuscarTodosOsExamesPorPacienteResponse>(_BuscarTodosOsExamesPorPacienteResponse_QNAME, BuscarTodosOsExamesPorPacienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarUmExameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.exame.soc.com.br/", name = "AtualizarUmExameResponse")
    public JAXBElement<AtualizarUmExameResponse> createAtualizarUmExameResponse(AtualizarUmExameResponse value) {
        return new JAXBElement<AtualizarUmExameResponse>(_AtualizarUmExameResponse_QNAME, AtualizarUmExameResponse.class, null, value);
    }

}
