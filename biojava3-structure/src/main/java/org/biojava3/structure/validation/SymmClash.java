//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.17 at 03:04:15 PM PST 
//


package org.biojava3.structure.validation;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="atom" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="clashmag" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="dist" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="scid" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="symop" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "symm-clash")
public class SymmClash {

    @XmlAttribute(name = "atom", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String atom;
    @XmlAttribute(name = "clashmag", required = true)
    protected BigDecimal clashmag;
    @XmlAttribute(name = "dist", required = true)
    protected BigDecimal dist;
    @XmlAttribute(name = "scid", required = true)
    protected BigInteger scid;
    @XmlAttribute(name = "symop", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String symop;

    /**
     * Gets the value of the atom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtom() {
        return atom;
    }

    /**
     * Sets the value of the atom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtom(String value) {
        this.atom = value;
    }

    /**
     * Gets the value of the clashmag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClashmag() {
        return clashmag;
    }

    /**
     * Sets the value of the clashmag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClashmag(BigDecimal value) {
        this.clashmag = value;
    }

    /**
     * Gets the value of the dist property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDist() {
        return dist;
    }

    /**
     * Sets the value of the dist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDist(BigDecimal value) {
        this.dist = value;
    }

    /**
     * Gets the value of the scid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getScid() {
        return scid;
    }

    /**
     * Sets the value of the scid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setScid(BigInteger value) {
        this.scid = value;
    }

    /**
     * Gets the value of the symop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymop() {
        return symop;
    }

    /**
     * Sets the value of the symop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymop(String value) {
        this.symop = value;
    }

}
