


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ResourceNotFoundException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceNotFoundException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceNotFoundException")
public class ResourceNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException() {
		super();
	}
	public ResourceNotFoundException(String message ,Throwable cause) {
		super(message ,cause);
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	public ResourceNotFoundException(Throwable cause) {
		super(cause);
	}
}
