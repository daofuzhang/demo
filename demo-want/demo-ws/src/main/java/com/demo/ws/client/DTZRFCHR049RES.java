
package com.demo.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DT_ZRFCHR049_RES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DT_ZRFCHR049_RES">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IOT_PA0002" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NACHN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="VORNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IOT_PA0185" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ICTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ICNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IOT_PA0105" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="USRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="USRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IOT_PA0529" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RACKY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="PCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IOT_PA9905" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZJJLXRXM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZJJLXRGX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZJJLXRLXFS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZAHTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZHZLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IOT_PA0006" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LAND1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ORT01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LOCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IOT_PA0022" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SLAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SLART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="INSTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AUSBI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IOT_PA0023" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ARBGB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ANSVX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TAETE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZPROFF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZPROFF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IOT_PA0024" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="QUALI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZISSUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IOT_PA0021" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FANAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FAVOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FGBDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FASEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZZPERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ZZRELATY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_ZRFCHR049_RES", propOrder = {
    "iotpa0002",
    "iotpa0185",
    "iotpa0105",
    "iotpa0529",
    "iotpa9905",
    "iotpa0006",
    "iotpa0022",
    "iotpa0023",
    "iotpa0024",
    "iotpa0021"
})
public class DTZRFCHR049RES {

    @XmlElement(name = "IOT_PA0002")
    protected List<DTZRFCHR049RES.IOTPA0002> iotpa0002;
    @XmlElement(name = "IOT_PA0185")
    protected List<DTZRFCHR049RES.IOTPA0185> iotpa0185;
    @XmlElement(name = "IOT_PA0105")
    protected List<DTZRFCHR049RES.IOTPA0105> iotpa0105;
    @XmlElement(name = "IOT_PA0529")
    protected List<DTZRFCHR049RES.IOTPA0529> iotpa0529;
    @XmlElement(name = "IOT_PA9905")
    protected List<DTZRFCHR049RES.IOTPA9905> iotpa9905;
    @XmlElement(name = "IOT_PA0006")
    protected List<DTZRFCHR049RES.IOTPA0006> iotpa0006;
    @XmlElement(name = "IOT_PA0022")
    protected List<DTZRFCHR049RES.IOTPA0022> iotpa0022;
    @XmlElement(name = "IOT_PA0023")
    protected List<DTZRFCHR049RES.IOTPA0023> iotpa0023;
    @XmlElement(name = "IOT_PA0024")
    protected List<DTZRFCHR049RES.IOTPA0024> iotpa0024;
    @XmlElement(name = "IOT_PA0021")
    protected List<DTZRFCHR049RES.IOTPA0021> iotpa0021;

    /**
     * Gets the value of the iotpa0002 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa0002 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA0002().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA0002 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA0002> getIOTPA0002() {
        if (iotpa0002 == null) {
            iotpa0002 = new ArrayList<DTZRFCHR049RES.IOTPA0002>();
        }
        return this.iotpa0002;
    }

    /**
     * Gets the value of the iotpa0185 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa0185 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA0185().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA0185 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA0185> getIOTPA0185() {
        if (iotpa0185 == null) {
            iotpa0185 = new ArrayList<DTZRFCHR049RES.IOTPA0185>();
        }
        return this.iotpa0185;
    }

    /**
     * Gets the value of the iotpa0105 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa0105 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA0105().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA0105 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA0105> getIOTPA0105() {
        if (iotpa0105 == null) {
            iotpa0105 = new ArrayList<DTZRFCHR049RES.IOTPA0105>();
        }
        return this.iotpa0105;
    }

    /**
     * Gets the value of the iotpa0529 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa0529 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA0529().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA0529 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA0529> getIOTPA0529() {
        if (iotpa0529 == null) {
            iotpa0529 = new ArrayList<DTZRFCHR049RES.IOTPA0529>();
        }
        return this.iotpa0529;
    }

    /**
     * Gets the value of the iotpa9905 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa9905 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA9905().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA9905 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA9905> getIOTPA9905() {
        if (iotpa9905 == null) {
            iotpa9905 = new ArrayList<DTZRFCHR049RES.IOTPA9905>();
        }
        return this.iotpa9905;
    }

    /**
     * Gets the value of the iotpa0006 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa0006 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA0006().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA0006 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA0006> getIOTPA0006() {
        if (iotpa0006 == null) {
            iotpa0006 = new ArrayList<DTZRFCHR049RES.IOTPA0006>();
        }
        return this.iotpa0006;
    }

    /**
     * Gets the value of the iotpa0022 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa0022 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA0022().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA0022 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA0022> getIOTPA0022() {
        if (iotpa0022 == null) {
            iotpa0022 = new ArrayList<DTZRFCHR049RES.IOTPA0022>();
        }
        return this.iotpa0022;
    }

    /**
     * Gets the value of the iotpa0023 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa0023 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA0023().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA0023 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA0023> getIOTPA0023() {
        if (iotpa0023 == null) {
            iotpa0023 = new ArrayList<DTZRFCHR049RES.IOTPA0023>();
        }
        return this.iotpa0023;
    }

    /**
     * Gets the value of the iotpa0024 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa0024 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA0024().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA0024 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA0024> getIOTPA0024() {
        if (iotpa0024 == null) {
            iotpa0024 = new ArrayList<DTZRFCHR049RES.IOTPA0024>();
        }
        return this.iotpa0024;
    }

    /**
     * Gets the value of the iotpa0021 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iotpa0021 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIOTPA0021().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTZRFCHR049RES.IOTPA0021 }
     * 
     * 
     */
    public List<DTZRFCHR049RES.IOTPA0021> getIOTPA0021() {
        if (iotpa0021 == null) {
            iotpa0021 = new ArrayList<DTZRFCHR049RES.IOTPA0021>();
        }
        return this.iotpa0021;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NACHN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="VORNA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "nachn",
        "vorna",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA0002 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "NACHN")
        protected String nachn;
        @XmlElement(name = "VORNA")
        protected String vorna;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the nachn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNACHN() {
            return nachn;
        }

        /**
         * Sets the value of the nachn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNACHN(String value) {
            this.nachn = value;
        }

        /**
         * Gets the value of the vorna property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVORNA() {
            return vorna;
        }

        /**
         * Sets the value of the vorna property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVORNA(String value) {
            this.vorna = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LAND1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ORT01" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LOCAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "subty",
        "land1",
        "state",
        "ort01",
        "locat",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA0006 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "SUBTY")
        protected String subty;
        @XmlElement(name = "LAND1")
        protected String land1;
        @XmlElement(name = "STATE")
        protected String state;
        @XmlElement(name = "ORT01")
        protected String ort01;
        @XmlElement(name = "LOCAT")
        protected String locat;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the subty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUBTY() {
            return subty;
        }

        /**
         * Sets the value of the subty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUBTY(String value) {
            this.subty = value;
        }

        /**
         * Gets the value of the land1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLAND1() {
            return land1;
        }

        /**
         * Sets the value of the land1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLAND1(String value) {
            this.land1 = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTATE() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTATE(String value) {
            this.state = value;
        }

        /**
         * Gets the value of the ort01 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORT01() {
            return ort01;
        }

        /**
         * Sets the value of the ort01 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORT01(String value) {
            this.ort01 = value;
        }

        /**
         * Gets the value of the locat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLOCAT() {
            return locat;
        }

        /**
         * Sets the value of the locat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLOCAT(String value) {
            this.locat = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SUBTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FANAM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FAVOR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FGBDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FASEX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZZPERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZZRELATY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "subty",
        "fanam",
        "favor",
        "fgbdt",
        "fasex",
        "zzpernr",
        "zzrelaty",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA0021 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "SUBTY")
        protected String subty;
        @XmlElement(name = "FANAM")
        protected String fanam;
        @XmlElement(name = "FAVOR")
        protected String favor;
        @XmlElement(name = "FGBDT")
        protected String fgbdt;
        @XmlElement(name = "FASEX")
        protected String fasex;
        @XmlElement(name = "ZZPERNR")
        protected String zzpernr;
        @XmlElement(name = "ZZRELATY")
        protected String zzrelaty;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the subty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSUBTY() {
            return subty;
        }

        /**
         * Sets the value of the subty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSUBTY(String value) {
            this.subty = value;
        }

        /**
         * Gets the value of the fanam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFANAM() {
            return fanam;
        }

        /**
         * Sets the value of the fanam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFANAM(String value) {
            this.fanam = value;
        }

        /**
         * Gets the value of the favor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFAVOR() {
            return favor;
        }

        /**
         * Sets the value of the favor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFAVOR(String value) {
            this.favor = value;
        }

        /**
         * Gets the value of the fgbdt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFGBDT() {
            return fgbdt;
        }

        /**
         * Sets the value of the fgbdt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFGBDT(String value) {
            this.fgbdt = value;
        }

        /**
         * Gets the value of the fasex property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFASEX() {
            return fasex;
        }

        /**
         * Sets the value of the fasex property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFASEX(String value) {
            this.fasex = value;
        }

        /**
         * Gets the value of the zzpernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZZPERNR() {
            return zzpernr;
        }

        /**
         * Sets the value of the zzpernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZZPERNR(String value) {
            this.zzpernr = value;
        }

        /**
         * Gets the value of the zzrelaty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZZRELATY() {
            return zzrelaty;
        }

        /**
         * Sets the value of the zzrelaty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZZRELATY(String value) {
            this.zzrelaty = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SLAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SLART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="INSTI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AUSBI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "sland",
        "slart",
        "insti",
        "ausbi",
        "begda",
        "endda",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA0022 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "SLAND")
        protected String sland;
        @XmlElement(name = "SLART")
        protected String slart;
        @XmlElement(name = "INSTI")
        protected String insti;
        @XmlElement(name = "AUSBI")
        protected String ausbi;
        @XmlElement(name = "BEGDA")
        protected String begda;
        @XmlElement(name = "ENDDA")
        protected String endda;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the sland property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSLAND() {
            return sland;
        }

        /**
         * Sets the value of the sland property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSLAND(String value) {
            this.sland = value;
        }

        /**
         * Gets the value of the slart property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSLART() {
            return slart;
        }

        /**
         * Sets the value of the slart property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSLART(String value) {
            this.slart = value;
        }

        /**
         * Gets the value of the insti property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSTI() {
            return insti;
        }

        /**
         * Sets the value of the insti property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSTI(String value) {
            this.insti = value;
        }

        /**
         * Gets the value of the ausbi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUSBI() {
            return ausbi;
        }

        /**
         * Sets the value of the ausbi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUSBI(String value) {
            this.ausbi = value;
        }

        /**
         * Gets the value of the begda property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBEGDA() {
            return begda;
        }

        /**
         * Sets the value of the begda property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBEGDA(String value) {
            this.begda = value;
        }

        /**
         * Gets the value of the endda property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getENDDA() {
            return endda;
        }

        /**
         * Sets the value of the endda property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setENDDA(String value) {
            this.endda = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ARBGB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ANSVX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TAETE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZPROFF1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZPROFF2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "arbgb",
        "ansvx",
        "taete",
        "begda",
        "endda",
        "zproff1",
        "zproff2",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA0023 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "ARBGB")
        protected String arbgb;
        @XmlElement(name = "ANSVX")
        protected String ansvx;
        @XmlElement(name = "TAETE")
        protected String taete;
        @XmlElement(name = "BEGDA")
        protected String begda;
        @XmlElement(name = "ENDDA")
        protected String endda;
        @XmlElement(name = "ZPROFF1")
        protected String zproff1;
        @XmlElement(name = "ZPROFF2")
        protected String zproff2;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the arbgb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getARBGB() {
            return arbgb;
        }

        /**
         * Sets the value of the arbgb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setARBGB(String value) {
            this.arbgb = value;
        }

        /**
         * Gets the value of the ansvx property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getANSVX() {
            return ansvx;
        }

        /**
         * Sets the value of the ansvx property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setANSVX(String value) {
            this.ansvx = value;
        }

        /**
         * Gets the value of the taete property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTAETE() {
            return taete;
        }

        /**
         * Sets the value of the taete property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTAETE(String value) {
            this.taete = value;
        }

        /**
         * Gets the value of the begda property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBEGDA() {
            return begda;
        }

        /**
         * Sets the value of the begda property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBEGDA(String value) {
            this.begda = value;
        }

        /**
         * Gets the value of the endda property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getENDDA() {
            return endda;
        }

        /**
         * Sets the value of the endda property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setENDDA(String value) {
            this.endda = value;
        }

        /**
         * Gets the value of the zproff1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZPROFF1() {
            return zproff1;
        }

        /**
         * Sets the value of the zproff1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZPROFF1(String value) {
            this.zproff1 = value;
        }

        /**
         * Gets the value of the zproff2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZPROFF2() {
            return zproff2;
        }

        /**
         * Sets the value of the zproff2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZPROFF2(String value) {
            this.zproff2 = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="QUALI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BEGDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ENDDA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZISSUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "quali",
        "begda",
        "endda",
        "zissue",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA0024 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "QUALI")
        protected String quali;
        @XmlElement(name = "BEGDA")
        protected String begda;
        @XmlElement(name = "ENDDA")
        protected String endda;
        @XmlElement(name = "ZISSUE")
        protected String zissue;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the quali property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQUALI() {
            return quali;
        }

        /**
         * Sets the value of the quali property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQUALI(String value) {
            this.quali = value;
        }

        /**
         * Gets the value of the begda property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBEGDA() {
            return begda;
        }

        /**
         * Sets the value of the begda property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBEGDA(String value) {
            this.begda = value;
        }

        /**
         * Gets the value of the endda property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getENDDA() {
            return endda;
        }

        /**
         * Sets the value of the endda property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setENDDA(String value) {
            this.endda = value;
        }

        /**
         * Gets the value of the zissue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZISSUE() {
            return zissue;
        }

        /**
         * Sets the value of the zissue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZISSUE(String value) {
            this.zissue = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="USRTY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="USRID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "usrty",
        "usrid",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA0105 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "USRTY")
        protected String usrty;
        @XmlElement(name = "USRID")
        protected String usrid;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the usrty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSRTY() {
            return usrty;
        }

        /**
         * Sets the value of the usrty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSRTY(String value) {
            this.usrty = value;
        }

        /**
         * Gets the value of the usrid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSRID() {
            return usrid;
        }

        /**
         * Sets the value of the usrid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSRID(String value) {
            this.usrid = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ICTYP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ICNUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "ictyp",
        "icnum",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA0185 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "ICTYP")
        protected String ictyp;
        @XmlElement(name = "ICNUM")
        protected String icnum;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the ictyp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getICTYP() {
            return ictyp;
        }

        /**
         * Sets the value of the ictyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setICTYP(String value) {
            this.ictyp = value;
        }

        /**
         * Gets the value of the icnum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getICNUM() {
            return icnum;
        }

        /**
         * Sets the value of the icnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setICNUM(String value) {
            this.icnum = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RACKY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="PCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "racky",
        "pcode",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA0529 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "RACKY")
        protected String racky;
        @XmlElement(name = "PCODE")
        protected String pcode;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the racky property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRACKY() {
            return racky;
        }

        /**
         * Sets the value of the racky property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRACKY(String value) {
            this.racky = value;
        }

        /**
         * Gets the value of the pcode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPCODE() {
            return pcode;
        }

        /**
         * Sets the value of the pcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPCODE(String value) {
            this.pcode = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PERNR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZJJLXRXM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZJJLXRGX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZJJLXRLXFS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZAHTC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ZHZLS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNTYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RETURNMSG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pernr",
        "zjjlxrxm",
        "zjjlxrgx",
        "zjjlxrlxfs",
        "zahtc",
        "zhzls",
        "returntype",
        "returnmsg"
    })
    public static class IOTPA9905 {

        @XmlElement(name = "PERNR")
        protected String pernr;
        @XmlElement(name = "ZJJLXRXM")
        protected String zjjlxrxm;
        @XmlElement(name = "ZJJLXRGX")
        protected String zjjlxrgx;
        @XmlElement(name = "ZJJLXRLXFS")
        protected String zjjlxrlxfs;
        @XmlElement(name = "ZAHTC")
        protected String zahtc;
        @XmlElement(name = "ZHZLS")
        protected String zhzls;
        @XmlElement(name = "RETURNTYPE")
        protected String returntype;
        @XmlElement(name = "RETURNMSG")
        protected String returnmsg;

        /**
         * Gets the value of the pernr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPERNR() {
            return pernr;
        }

        /**
         * Sets the value of the pernr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPERNR(String value) {
            this.pernr = value;
        }

        /**
         * Gets the value of the zjjlxrxm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZJJLXRXM() {
            return zjjlxrxm;
        }

        /**
         * Sets the value of the zjjlxrxm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZJJLXRXM(String value) {
            this.zjjlxrxm = value;
        }

        /**
         * Gets the value of the zjjlxrgx property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZJJLXRGX() {
            return zjjlxrgx;
        }

        /**
         * Sets the value of the zjjlxrgx property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZJJLXRGX(String value) {
            this.zjjlxrgx = value;
        }

        /**
         * Gets the value of the zjjlxrlxfs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZJJLXRLXFS() {
            return zjjlxrlxfs;
        }

        /**
         * Sets the value of the zjjlxrlxfs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZJJLXRLXFS(String value) {
            this.zjjlxrlxfs = value;
        }

        /**
         * Gets the value of the zahtc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZAHTC() {
            return zahtc;
        }

        /**
         * Sets the value of the zahtc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZAHTC(String value) {
            this.zahtc = value;
        }

        /**
         * Gets the value of the zhzls property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZHZLS() {
            return zhzls;
        }

        /**
         * Sets the value of the zhzls property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZHZLS(String value) {
            this.zhzls = value;
        }

        /**
         * Gets the value of the returntype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNTYPE() {
            return returntype;
        }

        /**
         * Sets the value of the returntype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNTYPE(String value) {
            this.returntype = value;
        }

        /**
         * Gets the value of the returnmsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRETURNMSG() {
            return returnmsg;
        }

        /**
         * Sets the value of the returnmsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRETURNMSG(String value) {
            this.returnmsg = value;
        }

    }

}
