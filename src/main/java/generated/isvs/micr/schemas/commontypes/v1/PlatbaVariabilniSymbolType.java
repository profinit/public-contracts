//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.commontypes.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import generated.isvs.micr.schemas.corecomponenttypes.v1.IdentifikatorType;


/**
 * Datov� prvek pro ��seln� �daj, obsahuj�c� identifikaci platby, kter� pl�tce uv�d� v p��padech, kdy to po�aduje p��jemce platby, kter� se uskute��uje prost�ednictv�m ��tu, veden�ho u banky. Struktura variabiln�ho symbolu nen� stanovena. Obsah variabiln�ho symbolu ur�uje p��jemce platby.
 * 
 * <p>Java class for PlatbaVariabilniSymbolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlatbaVariabilniSymbolType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;urn:cz:isvs:micr:schemas:CoreComponentTypes:v1>IdentifikatorType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatbaVariabilniSymbolType")
public class PlatbaVariabilniSymbolType
    extends IdentifikatorType
{


}
