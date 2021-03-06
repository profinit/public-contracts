//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.spacetypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import generated.isvs.micr.schemas.commontypes.v1.RozsireniStructure;


/**
 * Adresa bydli�t�, m�sta podnik�n� apod. pou��van� pro hromadn� p�enos dat jako p�ed�vac� adresa na adresn� m�sto, vyj�d�en� prostorovou identifikac� stavebn�ho objektu v r�mci Cesk� republiky.
 * 
 * 
 * <p>Java class for AdresniMistoAdresaPredavaciStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresniMistoAdresaPredavaciStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}CastObcePredavaciKod"/>
 *         &lt;element ref="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}ObjektCisloDomovni"/>
 *         &lt;element ref="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}UlicePredavaciKod" minOccurs="0"/>
 *         &lt;element ref="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}ObjektCisloOrientacni" minOccurs="0"/>
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
@XmlType(name = "AdresniMistoAdresaPredavaciStructure", propOrder = {
    "castObcePredavaciKod",
    "objektCisloDomovni",
    "ulicePredavaciKod",
    "objektCisloOrientacni",
    "rozsireni"
})
public class AdresniMistoAdresaPredavaciStructure {

    @XmlElement(name = "CastObcePredavaciKod", required = true)
    protected CastObcePredavaciKodType castObcePredavaciKod;
    @XmlElement(name = "ObjektCisloDomovni", required = true)
    protected ObjektCisloDomovniStructure objektCisloDomovni;
    @XmlElement(name = "UlicePredavaciKod")
    protected UlicePredavaciKodType ulicePredavaciKod;
    @XmlElement(name = "ObjektCisloOrientacni")
    protected ObjektCisloOrientacniType objektCisloOrientacni;
    @XmlElement(name = "Rozsireni", namespace = "urn:cz:isvs:micr:schemas:CommonTypes:v1")
    protected RozsireniStructure rozsireni;
    @XmlAttribute(name = "objektID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objektID;

    /**
     * Gets the value of the castObcePredavaciKod property.
     * 
     * @return
     *     possible object is
     *     {@link CastObcePredavaciKodType }
     *     
     */
    public CastObcePredavaciKodType getCastObcePredavaciKod() {
        return castObcePredavaciKod;
    }

    /**
     * Sets the value of the castObcePredavaciKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CastObcePredavaciKodType }
     *     
     */
    public void setCastObcePredavaciKod(CastObcePredavaciKodType value) {
        this.castObcePredavaciKod = value;
    }

    /**
     * Gets the value of the objektCisloDomovni property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektCisloDomovniStructure }
     *     
     */
    public ObjektCisloDomovniStructure getObjektCisloDomovni() {
        return objektCisloDomovni;
    }

    /**
     * Sets the value of the objektCisloDomovni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektCisloDomovniStructure }
     *     
     */
    public void setObjektCisloDomovni(ObjektCisloDomovniStructure value) {
        this.objektCisloDomovni = value;
    }

    /**
     * Gets the value of the ulicePredavaciKod property.
     * 
     * @return
     *     possible object is
     *     {@link UlicePredavaciKodType }
     *     
     */
    public UlicePredavaciKodType getUlicePredavaciKod() {
        return ulicePredavaciKod;
    }

    /**
     * Sets the value of the ulicePredavaciKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link UlicePredavaciKodType }
     *     
     */
    public void setUlicePredavaciKod(UlicePredavaciKodType value) {
        this.ulicePredavaciKod = value;
    }

    /**
     * Gets the value of the objektCisloOrientacni property.
     * 
     * @return
     *     possible object is
     *     {@link ObjektCisloOrientacniType }
     *     
     */
    public ObjektCisloOrientacniType getObjektCisloOrientacni() {
        return objektCisloOrientacni;
    }

    /**
     * Sets the value of the objektCisloOrientacni property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjektCisloOrientacniType }
     *     
     */
    public void setObjektCisloOrientacni(ObjektCisloOrientacniType value) {
        this.objektCisloOrientacni = value;
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
