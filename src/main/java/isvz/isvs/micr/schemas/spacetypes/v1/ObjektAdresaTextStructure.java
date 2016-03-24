//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package isvz.isvs.micr.schemas.spacetypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import isvz.isvs.micr.schemas.commontypes.v1.RozsireniStructure;


/**
 * Adresa textem je alternativou k ostatn�m typ�m adres v p��pad�, kdy nen� mo�n� dodr�et standardn� strukturov�n� objektu adresy. Pou��v� se p�edev��m u zahrani�n�ch adres.
 * 
 * <p>Java class for ObjektAdresaTextStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjektAdresaTextStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatKod" type="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}StatKodType"/>
 *         &lt;element name="AdresaText" type="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}AdresaTextType"/>
 *         &lt;element name="AdresaKvalifikatorKod" type="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}AdresaKvalifikatorKodType" minOccurs="0"/>
 *         &lt;element ref="{urn:cz:isvs:micr:schemas:CommonTypes:v1}Rozsireni" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="objektID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjektAdresaTextStructure", propOrder = {
    "statKod",
    "adresaText",
    "adresaKvalifikatorKod",
    "rozsireni"
})
public class ObjektAdresaTextStructure {

    @XmlElement(name = "StatKod", required = true)
    protected StatKodType statKod;
    @XmlElement(name = "AdresaText", required = true)
    protected AdresaTextType adresaText;
    @XmlElement(name = "AdresaKvalifikatorKod")
    protected AdresaKvalifikatorKodType adresaKvalifikatorKod;
    @XmlElement(name = "Rozsireni", namespace = "urn:cz:isvs:micr:schemas:CommonTypes:v1")
    protected RozsireniStructure rozsireni;
    @XmlAttribute(name = "objektID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objektID;

    /**
     * Gets the value of the statKod property.
     * 
     * @return
     *     possible object is
     *     {@link StatKodType }
     *     
     */
    public StatKodType getStatKod() {
        return statKod;
    }

    /**
     * Sets the value of the statKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatKodType }
     *     
     */
    public void setStatKod(StatKodType value) {
        this.statKod = value;
    }

    /**
     * Gets the value of the adresaText property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaTextType }
     *     
     */
    public AdresaTextType getAdresaText() {
        return adresaText;
    }

    /**
     * Sets the value of the adresaText property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaTextType }
     *     
     */
    public void setAdresaText(AdresaTextType value) {
        this.adresaText = value;
    }

    /**
     * Gets the value of the adresaKvalifikatorKod property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaKvalifikatorKodType }
     *     
     */
    public AdresaKvalifikatorKodType getAdresaKvalifikatorKod() {
        return adresaKvalifikatorKod;
    }

    /**
     * Sets the value of the adresaKvalifikatorKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaKvalifikatorKodType }
     *     
     */
    public void setAdresaKvalifikatorKod(AdresaKvalifikatorKodType value) {
        this.adresaKvalifikatorKod = value;
    }

    /**
     * Gets the value of the rozsireni property.
     * 
     * @return
     *     possible object is
     *     {@link RozsireniStructure }
     *     
     */
    public RozsireniStructure getRozsireni() {
        return rozsireni;
    }

    /**
     * Sets the value of the rozsireni property.
     * 
     * @param value
     *     allowed object is
     *     {@link RozsireniStructure }
     *     
     */
    public void setRozsireni(RozsireniStructure value) {
        this.rozsireni = value;
    }

    /**
     * Gets the value of the objektID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjektID() {
        return objektID;
    }

    /**
     * Sets the value of the objektID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjektID(String value) {
        this.objektID = value;
    }

}