//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:05:22 오후 KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="mgmtLink" type="{http://www.onem2m.org/xml/protocols}mgmtLinkRef" maxOccurs="unbounded" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mgmtLink"
})
//@XmlRootElement(name = "cmdhDefaults")
@XmlRootElement(name = "cmdf")
public class CmdhDefaults
    extends MgmtResource
{
//	public final static String SCHEMA_LOCATION = "CDT-cmdhDefaults-v1_2_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-cmdhDefaults-v1_6_0.xsd";

    //@XmlElement(required = true)
	@XmlElement(name = "cmlk", required = true)
    protected List<MgmtLinkRef> mgmtLink;

    /**
     * Gets the value of the mgmtLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mgmtLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMgmtLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MgmtLinkRef }
     * 
     * 
     */
    public List<MgmtLinkRef> getMgmtLink() {
//        if (mgmtLink == null) {
//            mgmtLink = new ArrayList<MgmtLinkRef>();
//        }
        return this.mgmtLink;
    }

    public void addMgmtLink(MgmtLinkRef lnkref) {
    	if (mgmtLink == null) {
    		mgmtLink = new ArrayList<MgmtLinkRef>();
    	}
    	this.mgmtLink.add(lnkref);
    }

    
    
    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.mgmtDefinition == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is M on CREATE operation");
			}
			if (this.mgmtLink == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtLink' is M on CREATE operation");
			}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			
			if (this.mgmtDefinition != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is NP on UPDATE operation");
			}
			if (this.objectIDs != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectIDs' is NP on UPDATE operation");
			}
			if (this.objectPaths != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectPaths' is NP on UPDATE operation");
			}
			
		}
	
		super.validate(operation);
		
	}

}
