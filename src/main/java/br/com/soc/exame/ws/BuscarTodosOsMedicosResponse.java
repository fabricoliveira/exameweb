
package br.com.soc.exame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuscarTodosOsMedicosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuscarTodosOsMedicosResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medicos" type="{http://ws.exame.soc.com.br/}listaMedicosDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarTodosOsMedicosResponse", propOrder = {
    "medicos"
})
public class BuscarTodosOsMedicosResponse {

    protected ListaMedicosDTO medicos;

    /**
     * Gets the value of the medicos property.
     * 
     * @return
     *     possible object is
     *     {@link ListaMedicosDTO }
     *     
     */
    public ListaMedicosDTO getMedicos() {
        return medicos;
    }

    /**
     * Sets the value of the medicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMedicosDTO }
     *     
     */
    public void setMedicos(ListaMedicosDTO value) {
        this.medicos = value;
    }

}
