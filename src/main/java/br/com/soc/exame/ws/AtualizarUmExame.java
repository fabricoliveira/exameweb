
package br.com.soc.exame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtualizarUmExame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtualizarUmExame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exame" type="{http://ws.exame.soc.com.br/}atualizaExameDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtualizarUmExame", propOrder = {
    "exame"
})
public class AtualizarUmExame {

    protected AtualizaExameDTO exame;

    /**
     * Gets the value of the exame property.
     * 
     * @return
     *     possible object is
     *     {@link AtualizaExameDTO }
     *     
     */
    public AtualizaExameDTO getExame() {
        return exame;
    }

    /**
     * Sets the value of the exame property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtualizaExameDTO }
     *     
     */
    public void setExame(AtualizaExameDTO value) {
        this.exame = value;
    }

}
