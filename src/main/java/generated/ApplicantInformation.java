
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicantInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicantInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="demographicDetails" type="{}demographicDetails"/>
 *         &lt;element name="physicalAddress" type="{}physicalAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicantInformation", propOrder = {
    "demographicDetails",
    "physicalAddress"
})
public class ApplicantInformation {

    @XmlElement(required = true)
    protected DemographicDetails demographicDetails;
    @XmlElement(required = true)
    protected PhysicalAddress physicalAddress;

    /**
     * Gets the value of the demographicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicDetails }
     *     
     */
    public DemographicDetails getDemographicDetails() {
        return demographicDetails;
    }

    /**
     * Sets the value of the demographicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicDetails }
     *     
     */
    public void setDemographicDetails(DemographicDetails value) {
        this.demographicDetails = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPhysicalAddress(PhysicalAddress value) {
        this.physicalAddress = value;
    }

}
