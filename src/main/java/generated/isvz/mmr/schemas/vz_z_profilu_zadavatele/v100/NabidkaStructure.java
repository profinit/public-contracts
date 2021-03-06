//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvz.mmr.schemas.vz_z_profilu_zadavatele.v100;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import generated.isvs.micr.schemas.corecomponenttypes.v1.CenaType;
import generated.isvs.micr.schemas.corecomponenttypes.v1.KodType;
import org.w3c.dom.Element;


/**
 * <p>Java class for NabidkaStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NabidkaStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cislo_casti" type="{urn:cz:isvs:micr:schemas:CoreComponentTypes:v1}KodType" minOccurs="0"/>
 *         &lt;element name="nabidkova_cena_s_dph" type="{urn:cz:isvs:micr:schemas:CoreComponentTypes:v1}CenaType" minOccurs="0"/>
 *         &lt;any processContents='skip' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NabidkaStructure", propOrder = {
        "cisloCasti",
        "nabidkovaCenaSDph",
    "any"
})
public class NabidkaStructure {

    @XmlElement(name = "cislo_casti")
    protected KodType cisloCasti;
    @XmlElement(name = "nabidkova_cena_s_dph")
    protected CenaType nabidkovaCenaSDph;
    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the cisloCasti property.
     * 
     * @return
     *     possible object is
     *     {@link KodType }
     *     
     */
    public KodType getCisloCasti() {
        return cisloCasti;
    }

    /**
     * Sets the value of the cisloCasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodType }
     *     
     */
    public void setCisloCasti(KodType value) {
        this.cisloCasti = value;
    }

    /**
     * Gets the value of the nabidkovaCenaSDph property.
     * 
     * @return
     *     possible object is
     *     {@link CenaType }
     *     
     */
    public CenaType getNabidkovaCenaSDph() {
        return nabidkovaCenaSDph;
    }

    /**
     * Sets the value of the nabidkovaCenaSDph property.
     * 
     * @param value
     *     allowed object is
     *     {@link CenaType }
     *     
     */
    public void setNabidkovaCenaSDph(CenaType value) {
        this.nabidkovaCenaSDph = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

}
