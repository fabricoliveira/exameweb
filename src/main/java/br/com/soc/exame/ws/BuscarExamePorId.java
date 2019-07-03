
package br.com.soc.exame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuscarExamePorId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuscarExamePorId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idExame" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarExamePorId", propOrder = {
    "idExame"
})
public class BuscarExamePorId {

    protected Long idExame;

    /**
     * Gets the value of the idExame property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdExame() {
        return idExame;
    }

    /**
     * Sets the value of the idExame property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdExame(Long value) {
        this.idExame = value;
    }

}
