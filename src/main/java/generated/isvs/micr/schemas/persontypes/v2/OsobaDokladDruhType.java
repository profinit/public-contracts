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

import generated.isvs.micr.schemas.persontypes.v.al0092.v1.OsobaDokladDruhContentType;


/**
 * Slovn� ozna�en� druhu dokladu toto�nosti, pop�. druhu dokladu, podle kter�ho byla toto�nost zji�t�na. Uvede se ozna�en� v souladu s ��seln�kem. U doklad� � ob�ansk� pr�kaz� lze uv�st zkratku � OP�, u �idi�sk�ho pr�kazu �RP�.
 * 
 * <p>Java class for OsobaDokladDruhType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OsobaDokladDruhType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:cz:isvs:micr:schemas:PersonTypes:v:AL0092:v1>OsobaDokladDruhContentType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OsobaDokladDruhType", propOrder = {
    "value"
})
public class OsobaDokladDruhType {

    @XmlValue
    protected OsobaDokladDruhContentType value;

    /**
     * Slovn� ozna�en� druhu dokladu toto�nosti, pop�. druhu dokladu, podle kter�ho byla toto�nost zji�t�na. Uvede se ozna�en� v souladu s ��seln�kem. U doklad� � ob�ansk� pr�kaz� lze uv�st zkratku � OP�, u �idi�sk�ho pr�kazu �RP�.
     * 
     * @return
     *     possible object is
     *     {@link OsobaDokladDruhContentType }
     *     
     */
    public OsobaDokladDruhContentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaDokladDruhContentType }
     *     
     */
    public void setValue(OsobaDokladDruhContentType value) {
        this.value = value;
    }

}
