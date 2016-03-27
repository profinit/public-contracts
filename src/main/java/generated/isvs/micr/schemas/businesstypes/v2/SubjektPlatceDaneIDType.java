//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:46:39 AM CET 
//


package generated.isvs.micr.schemas.businesstypes.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import generated.isvs.micr.schemas.corecomponenttypes.v1.IdentifikatorType;


/**
 * Datov� prvek, kter� slou�� k identifikaci a registraci pl�tce dan�. Je vytvo�en podle jedn� z mo�nost�:
 * a) rodn� ��slo u fyzick�ch osob
 *  1. ob�an� CR,
 *  2. cizinc�, kte�� maj� povoleno podnikat na �zem� CR a bylo jim p�id�leno rodn� ��slo
 * b) IC u pr�vnick�ch osob,
 * c) vlastn� ��slo pl�tce p�id�luje finan�n� ��ad v p��pad�
 *  1. ob�an� CR s duplicitn�m rodn�m ��slem
 *  2. fyzick� osoby � cizince, kter� m� povolen� podnikat v CR a nem� p�id�leno rodn� ��slo
 *  3. pr�vnick� osoby pokud nem� p�id�leno IC (r�zn� spolky)
 * d) ��slo pl�tcovy pokladny � p�id�luje finan�n� ��ad podle � 4 odst. 9 a 10 z�kona �. 337/92 Sb., o spr�v� dan� a poplatk� ve zn�n� z�kona �. 35/93 Sb.
 * 
 * <p>Java class for SubjektPlatceDaneIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjektPlatceDaneIDType">
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
@XmlType(name = "SubjektPlatceDaneIDType")
public class SubjektPlatceDaneIDType
    extends IdentifikatorType
{


}
