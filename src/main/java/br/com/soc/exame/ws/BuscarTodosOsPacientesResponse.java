
package br.com.soc.exame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuscarTodosOsPacientesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuscarTodosOsPacientesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pacientes" type="{http://ws.exame.soc.com.br/}listaPacientesDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarTodosOsPacientesResponse", propOrder = {
    "pacientes"
})
public class BuscarTodosOsPacientesResponse {

    protected ListaPacientesDTO pacientes;

    /**
     * Gets the value of the pacientes property.
     * 
     * @return
     *     possible object is
     *     {@link ListaPacientesDTO }
     *     
     */
    public ListaPacientesDTO getPacientes() {
        return pacientes;
    }

    /**
     * Sets the value of the pacientes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaPacientesDTO }
     *     
     */
    public void setPacientes(ListaPacientesDTO value) {
        this.pacientes = value;
    }

}
