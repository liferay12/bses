/**
 * WebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class WebServiceLocator extends org.apache.axis.client.Service implements com.bses2.sap.ws.WebService {

    public WebServiceLocator() {
    }


    public WebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceSoap
//   private java.lang.String WebServiceSoap_address = "http://115.249.67.73:7870/Isuservice.asmx";
   
    private java.lang.String WebServiceSoap_address = "http://115.249.67.73:7870/Isuservice.asmx";
    
    
//    private java.lang.String WebServiceSoap_address = "";
    
    public java.lang.String getWebServiceSoapAddress() {
        return WebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceSoapWSDDServiceName = "WebServiceSoap";

    public java.lang.String getWebServiceSoapWSDDServiceName() {
        return WebServiceSoapWSDDServiceName;
    }

    public void setWebServiceSoapWSDDServiceName(java.lang.String name) {
        WebServiceSoapWSDDServiceName = name;
    }

    public com.bses2.sap.ws.WebServiceSoap getWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceSoap(endpoint);
    }

    public com.bses2.sap.ws.WebServiceSoap getWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bses2.sap.ws.WebServiceSoapStub _stub = new com.bses2.sap.ws.WebServiceSoapStub(portAddress, this);
            _stub.setPortName(getWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceSoapEndpointAddress(java.lang.String address) {
        WebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bses2.sap.ws.WebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bses2.sap.ws.WebServiceSoapStub _stub = new com.bses2.sap.ws.WebServiceSoapStub(new java.net.URL(WebServiceSoap_address), this);
                _stub.setPortName(getWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServiceSoap".equals(inputPortName)) {
            return getWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceSoap".equals(portName)) {
            setWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
