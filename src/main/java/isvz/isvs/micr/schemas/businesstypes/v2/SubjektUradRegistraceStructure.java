//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package isvz.isvs.micr.schemas.businesstypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import isvz.isvs.micr.schemas.spacetypes.v1.MestskaCastKodType;
import isvz.isvs.micr.schemas.spacetypes.v1.ObecKodType;


/**
 * Ud�v� n�zev a obec s�dla ��adu kompetentn�ho k registraci ekonomick�ho subjektu.
 * 
 * 
 * <p>Java class for SubjektUradRegistraceStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjektUradRegistraceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:cz:isvs:micr:schemas:BusinessTypes:v2}SubjektUradRegistraceKod"/>
 *         &lt;choice>
 *           &lt;element name="ObecKod" type="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}ObecKodType"/>
 *           &lt;element name="MestskaCastKod" type="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}MestskaCastKodType"/>
 *         &lt;/choice>
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
@XmlType(name = "SubjektUradRegistraceStructure", propOrder = {
    "subjektUradRegistraceKod",
    "obecKod",
    "mestskaCastKod"
})
public class SubjektUradRegistraceStructure {

    @XmlElement(name = "SubjektUradRegistraceKod", required = true)
    protected SubjektUradRegistraceKodType subjektUradRegistraceKod;
    @XmlElement(name = "ObecKod")
    protected ObecKodType obecKod;
    @XmlElement(name = "MestskaCastKod")
    protected MestskaCastKodType mestskaCastKod;
    @XmlAttribute(name = "objektID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objektID;

    /**
     * Gets the value of the subjektUradRegistraceKod property.
     * 
     * @return
     *     possible object is
     *     {@link SubjektUradRegistraceKodType }
     *     
     */
    public SubjektUradRegistraceKodType getSubjektUradRegistraceKod() {
        return subjektUradRegistraceKod;
    }

    /**
     * Sets the value of the subjektUradRegistraceKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjektUradRegistraceKodType }
     *     
     */
    public void setSubjektUradRegistraceKod(SubjektUradRegistraceKodType value) {
        this.subjektUradRegistraceKod = value;
    }

    /**
     * Gets the value of the obecKod property.
     * 
     * @return
     *     possible object is
     *     {@link ObecKodType }
     *     
     */
    public ObecKodType getObecKod() {
        return obecKod;
    }

    /**
     * Sets the value of the obecKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObecKodType }
     *     
     */
    public void setObecKod(ObecKodType value) {
        this.obecKod = value;
    }

    /**
     * Gets the value of the mestskaCastKod property.
     * 
     * @return
     *     possible object is
     *     {@link MestskaCastKodType }
     *     
     */
    public MestskaCastKodType getMestskaCastKod() {
        return mestskaCastKod;
    }

    /**
     * Sets the value of the mestskaCastKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MestskaCastKodType }
     *     
     */
    public void setMestskaCastKod(MestskaCastKodType value) {
        this.mestskaCastKod = value;
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