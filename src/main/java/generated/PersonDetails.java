
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="globalData" type="{}globalData"/>
 *         &lt;element name="metaData" type="{}metaData"/>
 *         &lt;element name="formData" type="{}formData"/>
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
    "globalData",
    "metaData",
    "formData"
})
@XmlRootElement(name = "PersonDetails")
public class PersonDetails {

    @XmlElement(required = true, nillable = true)
    protected GlobalData globalData;
    @XmlElement(required = true, nillable = true)
    protected MetaData metaData;
    @XmlElement(required = true, nillable = true)
    protected FormData formData;

    /**
     * Gets the value of the globalData property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalData }
     *     
     */
    public GlobalData getGlobalData() {
        return globalData;
    }

    /**
     * Sets the value of the globalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalData }
     *     
     */
    public void setGlobalData(GlobalData value) {
        this.globalData = value;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * @return
     *     possible object is
     *     {@link MetaData }
     *     
     */
    public MetaData getMetaData() {
        return metaData;
    }

    /**
     * Sets the value of the metaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaData }
     *     
     */
    public void setMetaData(MetaData value) {
        this.metaData = value;
    }

    /**
     * Gets the value of the formData property.
     * 
     * @return
     *     possible object is
     *     {@link FormData }
     *     
     */
    public FormData getFormData() {
        return formData;
    }

    /**
     * Sets the value of the formData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormData }
     *     
     */
    public void setFormData(FormData value) {
        this.formData = value;
    }

}
