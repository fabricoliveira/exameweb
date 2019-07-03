
package br.com.soc.exame.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdicionarUmExame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdicionarUmExame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exame" type="{http://ws.exame.soc.com.br/}adicionaExameDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdicionarUmExame", propOrder = {
    "exame"
})
public class AdicionarUmExame {

    protected AdicionaExameDTO exame;

    /**
     * Gets the value of the exame property.
     * 
     * @return
     *     possible object is
     *     {@link AdicionaExameDTO }
     *     
     */
    public AdicionaExameDTO getExame() {
        return exame;
    }

    /**
     * Sets the value of the exame property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdicionaExameDTO }
     *     
     */
    public void setExame(AdicionaExameDTO value) {
        this.exame = value;
    }

}
