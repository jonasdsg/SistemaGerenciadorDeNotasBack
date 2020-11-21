
package edu.uni.SistemaGerenciadorDeNotas.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for avaliacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="avaliacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aps1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="aps2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="av1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="av2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="av3" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "avaliacao", propOrder = {
    "aps1",
    "aps2",
    "av1",
    "av2",
    "av3"
})
public class Avaliacao {

    protected Double aps1;
    protected Double aps2;
    protected Double av1;
    protected Double av2;
    protected Double av3;

    
    public Avaliacao() {}
    
	public Avaliacao(Double aps1, Double aps2, Double av1, Double av2, Double av3) {
		super();
		this.aps1 = aps1;
		this.aps2 = aps2;
		this.av1 = av1;
		this.av2 = av2;
		this.av3 = av3;
	}

	/**
     * Gets the value of the aps1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAps1() {
        return aps1;
    }

    /**
     * Sets the value of the aps1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAps1(Double value) {
        this.aps1 = value;
    }

    /**
     * Gets the value of the aps2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAps2() {
        return aps2;
    }

    /**
     * Sets the value of the aps2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAps2(Double value) {
        this.aps2 = value;
    }

    /**
     * Gets the value of the av1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAv1() {
        return av1;
    }

    /**
     * Sets the value of the av1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAv1(Double value) {
        this.av1 = value;
    }

    /**
     * Gets the value of the av2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAv2() {
        return av2;
    }

    /**
     * Sets the value of the av2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAv2(Double value) {
        this.av2 = value;
    }

    /**
     * Gets the value of the av3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAv3() {
        return av3;
    }

    /**
     * Sets the value of the av3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAv3(Double value) {
        this.av3 = value;
    }

}
