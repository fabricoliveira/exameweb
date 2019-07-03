
package br.com.soc.exame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuscarTodosOsExamesPorMedicoEPacienteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuscarTodosOsExamesPorMedicoEPacienteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exames" type="{http://ws.exame.soc.com.br/}listaExamesDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarTodosOsExamesPorMedicoEPacienteResponse", propOrder = {
    "exames"
})
public class BuscarTodosOsExamesPorMedicoEPacienteResponse {

    protected ListaExamesDTO exames;

    /**
     * Gets the value of the exames property.
     * 
     * @return
     *     possible object is
     *     {@link ListaExamesDTO }
     *     
     */
    public ListaExamesDTO getExames() {
        return exames;
    }

    /**
     * Sets the value of the exames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaExamesDTO }
     *     
     */
    public void setExames(ListaExamesDTO value) {
        this.exames = value;
    }

}
