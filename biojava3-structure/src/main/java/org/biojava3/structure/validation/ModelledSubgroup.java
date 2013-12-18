//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.17 at 03:04:15 PM PST 
//


package org.biojava3.structure.validation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}angle-outlier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}clash" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}bond-outlier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}mog-angle-outlier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{}symm-clash" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{}mog-bond-outlier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="NatomsEDS" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="altcode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="avgoccu" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="chain" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="ent" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="flippable-sidechain" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="icode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ligRSRZ" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ligRSRnbrMean" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ligRSRnbrStdev" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="ligRSRnumnbrs" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="model" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="mogul-ignore" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="num-H-reduce" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="owab" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="phi" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="psi" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rama" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="resname" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="resnum" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="rota" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="rscc" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rsr" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="rsrz" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="said" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="seq" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "angleOutlier",
    "clash",
    "bondOutlier",
    "mogAngleOutlier",
    "symmClash",
    "mogBondOutlier"
})
@XmlRootElement(name = "ModelledSubgroup")
public class ModelledSubgroup {

    @XmlElement(name = "angle-outlier")
    protected List<AngleOutlier> angleOutlier;
    protected List<Clash> clash;
    @XmlElement(name = "bond-outlier")
    protected List<BondOutlier> bondOutlier;
    @XmlElement(name = "mog-angle-outlier")
    protected List<MogAngleOutlier> mogAngleOutlier;
    @XmlElement(name = "symm-clash")
    protected List<SymmClash> symmClash;
    @XmlElement(name = "mog-bond-outlier")
    protected List<MogBondOutlier> mogBondOutlier;
    @XmlAttribute(name = "NatomsEDS", required = true)
    protected BigInteger natomsEDS;
    @XmlAttribute(name = "altcode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String altcode;
    @XmlAttribute(name = "avgoccu", required = true)
    protected BigDecimal avgoccu;
    @XmlAttribute(name = "chain", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String chain;
    @XmlAttribute(name = "ent", required = true)
    protected BigInteger ent;
    @XmlAttribute(name = "flippable-sidechain")
    protected BigInteger flippableSidechain;
    @XmlAttribute(name = "icode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String icode;
    @XmlAttribute(name = "ligRSRZ")
    protected BigDecimal ligRSRZ;
    @XmlAttribute(name = "ligRSRnbrMean")
    protected BigDecimal ligRSRnbrMean;
    @XmlAttribute(name = "ligRSRnbrStdev")
    protected BigDecimal ligRSRnbrStdev;
    @XmlAttribute(name = "ligRSRnumnbrs")
    protected BigInteger ligRSRnumnbrs;
    @XmlAttribute(name = "model", required = true)
    protected BigInteger model;
    @XmlAttribute(name = "mogul-ignore")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String mogulIgnore;
    @XmlAttribute(name = "num-H-reduce")
    protected BigInteger numHReduce;
    @XmlAttribute(name = "owab", required = true)
    protected BigDecimal owab;
    @XmlAttribute(name = "phi")
    protected BigDecimal phi;
    @XmlAttribute(name = "psi")
    protected BigDecimal psi;
    @XmlAttribute(name = "rama")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String rama;
    @XmlAttribute(name = "resname", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String resname;
    @XmlAttribute(name = "resnum", required = true)
    protected BigInteger resnum;
    @XmlAttribute(name = "rota")
    @XmlSchemaType(name = "anySimpleType")
    protected String rota;
    @XmlAttribute(name = "rscc", required = true)
    protected BigDecimal rscc;
    @XmlAttribute(name = "rsr", required = true)
    protected BigDecimal rsr;
    @XmlAttribute(name = "rsrz")
    protected BigDecimal rsrz;
    @XmlAttribute(name = "said", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String said;
    @XmlAttribute(name = "seq", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String seq;

    /**
     * Gets the value of the angleOutlier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the angleOutlier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAngleOutlier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AngleOutlier }
     * 
     * 
     */
    public List<AngleOutlier> getAngleOutlier() {
        if (angleOutlier == null) {
            angleOutlier = new ArrayList<AngleOutlier>();
        }
        return this.angleOutlier;
    }

    /**
     * Gets the value of the clash property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clash property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clash }
     * 
     * 
     */
    public List<Clash> getClash() {
        if (clash == null) {
            clash = new ArrayList<Clash>();
        }
        return this.clash;
    }

    /**
     * Gets the value of the bondOutlier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bondOutlier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBondOutlier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BondOutlier }
     * 
     * 
     */
    public List<BondOutlier> getBondOutlier() {
        if (bondOutlier == null) {
            bondOutlier = new ArrayList<BondOutlier>();
        }
        return this.bondOutlier;
    }

    /**
     * Gets the value of the mogAngleOutlier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mogAngleOutlier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMogAngleOutlier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MogAngleOutlier }
     * 
     * 
     */
    public List<MogAngleOutlier> getMogAngleOutlier() {
        if (mogAngleOutlier == null) {
            mogAngleOutlier = new ArrayList<MogAngleOutlier>();
        }
        return this.mogAngleOutlier;
    }

    /**
     * Gets the value of the symmClash property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symmClash property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymmClash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SymmClash }
     * 
     * 
     */
    public List<SymmClash> getSymmClash() {
        if (symmClash == null) {
            symmClash = new ArrayList<SymmClash>();
        }
        return this.symmClash;
    }

    /**
     * Gets the value of the mogBondOutlier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mogBondOutlier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMogBondOutlier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MogBondOutlier }
     * 
     * 
     */
    public List<MogBondOutlier> getMogBondOutlier() {
        if (mogBondOutlier == null) {
            mogBondOutlier = new ArrayList<MogBondOutlier>();
        }
        return this.mogBondOutlier;
    }

    /**
     * Gets the value of the natomsEDS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNatomsEDS() {
        return natomsEDS;
    }

    /**
     * Sets the value of the natomsEDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNatomsEDS(BigInteger value) {
        this.natomsEDS = value;
    }

    /**
     * Gets the value of the altcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltcode() {
        return altcode;
    }

    /**
     * Sets the value of the altcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltcode(String value) {
        this.altcode = value;
    }

    /**
     * Gets the value of the avgoccu property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvgoccu() {
        return avgoccu;
    }

    /**
     * Sets the value of the avgoccu property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvgoccu(BigDecimal value) {
        this.avgoccu = value;
    }

    /**
     * Gets the value of the chain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChain() {
        return chain;
    }

    /**
     * Sets the value of the chain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChain(String value) {
        this.chain = value;
    }

    /**
     * Gets the value of the ent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEnt() {
        return ent;
    }

    /**
     * Sets the value of the ent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEnt(BigInteger value) {
        this.ent = value;
    }

    /**
     * Gets the value of the flippableSidechain property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlippableSidechain() {
        return flippableSidechain;
    }

    /**
     * Sets the value of the flippableSidechain property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlippableSidechain(BigInteger value) {
        this.flippableSidechain = value;
    }

    /**
     * Gets the value of the icode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcode() {
        return icode;
    }

    /**
     * Sets the value of the icode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcode(String value) {
        this.icode = value;
    }

    /**
     * Gets the value of the ligRSRZ property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLigRSRZ() {
        return ligRSRZ;
    }

    /**
     * Sets the value of the ligRSRZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLigRSRZ(BigDecimal value) {
        this.ligRSRZ = value;
    }

    /**
     * Gets the value of the ligRSRnbrMean property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLigRSRnbrMean() {
        return ligRSRnbrMean;
    }

    /**
     * Sets the value of the ligRSRnbrMean property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLigRSRnbrMean(BigDecimal value) {
        this.ligRSRnbrMean = value;
    }

    /**
     * Gets the value of the ligRSRnbrStdev property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLigRSRnbrStdev() {
        return ligRSRnbrStdev;
    }

    /**
     * Sets the value of the ligRSRnbrStdev property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLigRSRnbrStdev(BigDecimal value) {
        this.ligRSRnbrStdev = value;
    }

    /**
     * Gets the value of the ligRSRnumnbrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLigRSRnumnbrs() {
        return ligRSRnumnbrs;
    }

    /**
     * Sets the value of the ligRSRnumnbrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLigRSRnumnbrs(BigInteger value) {
        this.ligRSRnumnbrs = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setModel(BigInteger value) {
        this.model = value;
    }

    /**
     * Gets the value of the mogulIgnore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMogulIgnore() {
        return mogulIgnore;
    }

    /**
     * Sets the value of the mogulIgnore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMogulIgnore(String value) {
        this.mogulIgnore = value;
    }

    /**
     * Gets the value of the numHReduce property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumHReduce() {
        return numHReduce;
    }

    /**
     * Sets the value of the numHReduce property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumHReduce(BigInteger value) {
        this.numHReduce = value;
    }

    /**
     * Gets the value of the owab property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwab() {
        return owab;
    }

    /**
     * Sets the value of the owab property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOwab(BigDecimal value) {
        this.owab = value;
    }

    /**
     * Gets the value of the phi property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPhi() {
        return phi;
    }

    /**
     * Sets the value of the phi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPhi(BigDecimal value) {
        this.phi = value;
    }

    /**
     * Gets the value of the psi property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPsi() {
        return psi;
    }

    /**
     * Sets the value of the psi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPsi(BigDecimal value) {
        this.psi = value;
    }

    /**
     * Gets the value of the rama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRama() {
        return rama;
    }

    /**
     * Sets the value of the rama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRama(String value) {
        this.rama = value;
    }

    /**
     * Gets the value of the resname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResname() {
        return resname;
    }

    /**
     * Sets the value of the resname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResname(String value) {
        this.resname = value;
    }

    /**
     * Gets the value of the resnum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getResnum() {
        return resnum;
    }

    /**
     * Sets the value of the resnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setResnum(BigInteger value) {
        this.resnum = value;
    }

    /**
     * Gets the value of the rota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRota() {
        return rota;
    }

    /**
     * Sets the value of the rota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRota(String value) {
        this.rota = value;
    }

    /**
     * Gets the value of the rscc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRscc() {
        return rscc;
    }

    /**
     * Sets the value of the rscc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRscc(BigDecimal value) {
        this.rscc = value;
    }

    /**
     * Gets the value of the rsr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRsr() {
        return rsr;
    }

    /**
     * Sets the value of the rsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRsr(BigDecimal value) {
        this.rsr = value;
    }

    /**
     * Gets the value of the rsrz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRsrz() {
        return rsrz;
    }

    /**
     * Sets the value of the rsrz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRsrz(BigDecimal value) {
        this.rsrz = value;
    }

    /**
     * Gets the value of the said property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaid() {
        return said;
    }

    /**
     * Sets the value of the said property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaid(String value) {
        this.said = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeq(String value) {
        this.seq = value;
    }

}
