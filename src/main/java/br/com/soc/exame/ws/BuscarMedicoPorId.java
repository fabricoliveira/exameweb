
package br.com.soc.exame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuscarMedicoPorId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuscarMedicoPorId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMedico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarMedicoPorId", propOrder = {
    "idMedico"
})
public class BuscarMedicoPorId {

    protected Long idMedico;

    /**
     * Gets the value of the idMedico property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMedico() {
        return idMedico;
    }

    /**
     * Sets the value of the idMedico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMedico(Long value) {
        this.idMedico = value;
    }

}
