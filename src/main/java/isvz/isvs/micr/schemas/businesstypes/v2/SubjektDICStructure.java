//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package isvz.isvs.micr.schemas.businesstypes.v2;

import isvz.isvs.micr.schemas.spacetypes.v1.StatKodOmezenyType;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * DIC je slo�en� datov� prvek, kter� slou�� k identifikaci a registraci pl�tce dan�. DIC se skl�d� z d�l��ch datov�ch prvk�:
 *  1. z t��m�stn�ho k�du p��slu�n�ho finan�n�ho ��adu
 *  2. k�du pl�tce dan�
 * 
 * 
 * <p>Java class for SubjektDICStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjektDICStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{urn:cz:isvs:micr:schemas:BusinessTypes:v2}FinancniUradKod"/>
 *             &lt;element ref="{urn:cz:isvs:micr:schemas:BusinessTypes:v2}SubjektPlatceDaneID"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="StatKod" type="{urn:cz:isvs:micr:schemas:SpaceTypes:v1}StatKodOmezenyType"/>
 *             &lt;element ref="{urn:cz:isvs:micr:schemas:BusinessTypes:v2}SubjektPlatceDaneEUiD"/>
 *           &lt;/sequence>
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
@XmlType(name = "SubjektDICStructure", propOrder = {
    "financniUradKod",
    "subjektPlatceDaneID",
    "statKod",
    "subjektPlatceDaneEUiD"
})
public class SubjektDICStructure {

    @XmlElement(name = "FinancniUradKod")
    protected FinancniUradKodType financniUradKod;
    @XmlElement(name = "SubjektPlatceDaneID")
    protected SubjektPlatceDaneIDType subjektPlatceDaneID;
    @XmlElement(name = "StatKod")
    protected StatKodOmezenyType statKod;
    @XmlElement(name = "SubjektPlatceDaneEUiD")
    protected SubjektPlatceDaneEUiDType subjektPlatceDaneEUiD;
    @XmlAttribute(name = "objektID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objektID;

    /**
     * Gets the value of the financniUradKod property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUradKodType }
     *     
     */
    public FinancniUradKodType getFinancniUradKod() {
        return financniUradKod;
    }

    /**
     * Sets the value of the financniUradKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUradKodType }
     *     
     */
    public void setFinancniUradKod(FinancniUradKodType value) {
        this.financniUradKod = value;
    }

    /**
     * Gets the value of the subjektPlatceDaneID property.
     * 
     * @return
     *     possible object is
     *     {@link SubjektPlatceDaneIDType }
     *     
     */
    public SubjektPlatceDaneIDType getSubjektPlatceDaneID() {
        return subjektPlatceDaneID;
    }

    /**
     * Sets the value of the subjektPlatceDaneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjektPlatceDaneIDType }
     *     
     */
    public void setSubjektPlatceDaneID(SubjektPlatceDaneIDType value) {
        this.subjektPlatceDaneID = value;
    }

    /**
     * Gets the value of the statKod property.
     * 
     * @return
     *     possible object is
     *     {@link StatKodOmezenyType }
     *     
     */
    public StatKodOmezenyType getStatKod() {
        return statKod;
    }

    /**
     * Sets the value of the statKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatKodOmezenyType }
     *     
     */
    public void setStatKod(StatKodOmezenyType value) {
        this.statKod = value;
    }

    /**
     * Gets the value of the subjektPlatceDaneEUiD property.
     * 
     * @return
     *     possible object is
     *     {@link SubjektPlatceDaneEUiDType }
     *     
     */
    public SubjektPlatceDaneEUiDType getSubjektPlatceDaneEUiD() {
        return subjektPlatceDaneEUiD;
    }

    /**
     * Sets the value of the subjektPlatceDaneEUiD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjektPlatceDaneEUiDType }
     *     
     */
    public void setSubjektPlatceDaneEUiD(SubjektPlatceDaneEUiDType value) {
        this.subjektPlatceDaneEUiD = value;
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