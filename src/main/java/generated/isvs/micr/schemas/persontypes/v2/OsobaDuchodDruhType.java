//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.persontypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import generated.isvs.micr.schemas.persontypes.v.al0090.v1.OsobaDuchodDruhContentType;


/**
 * Slovn� vyj�d�en� druhu d�chodu. Jestli�e obyvatel pob�r� n�kolik d�chod�, uvedou se v�echny druhy pob�ran�ch d�chod� jako seznam.
 * 
 * <p>Java class for OsobaDuchodDruhType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsobaDuchodDruhType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cz:isvs:micr:schemas:PersonTypes:v:AL0090:v1>OsobaDuchodDruhContentType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsobaDuchodDruhType", propOrder = {
    "value"
})
public class OsobaDuchodDruhType {

    @XmlValue
    protected OsobaDuchodDruhContentType value;

    /**
     * Slovn� vyj�d�en� druhu d�chodu. Jestli�e obyvatel pob�r� n�kolik d�chod�, uvedou se v�echny druhy pob�ran�ch d�chod� jako seznam.
     * 
     * @return
     *     possible object is
     *     {@link OsobaDuchodDruhContentType }
     *     
     */
    public OsobaDuchodDruhContentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaDuchodDruhContentType }
     *     
     */
    public void setValue(OsobaDuchodDruhContentType value) {
        this.value = value;
    }

}