package org.tempuri.areaservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.6.3
 * 2017-03-03T16:43:48.824+05:30
 * Generated source version: 2.6.3
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/AreaService/", name = "AreaService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AreaService {

    @WebMethod(operationName = "CalculateRectArea", action = "http://tempuri.org/AreaService/NewOperation")
    @WebResult(name = "area", targetNamespace = "http://tempuri.org/AreaService/", partName = "area")
    public float calculateRectArea(
        @WebParam(partName = "parameters", name = "parameters", targetNamespace = "http://tempuri.org/AreaService/")
        Dimensions parameters
    );
}
