/**
 * Get_cableslengthResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_cableslengthResponse  implements java.io.Serializable {
    private java.lang.String get_cableslengthResult;

    public Get_cableslengthResponse() {
    }

    public Get_cableslengthResponse(
           java.lang.String get_cableslengthResult) {
           this.get_cableslengthResult = get_cableslengthResult;
    }


    /**
     * Gets the get_cableslengthResult value for this Get_cableslengthResponse.
     * 
     * @return get_cableslengthResult
     */
    public java.lang.String getGet_cableslengthResult() {
        return get_cableslengthResult;
    }


    /**
     * Sets the get_cableslengthResult value for this Get_cableslengthResponse.
     * 
     * @param get_cableslengthResult
     */
    public void setGet_cableslengthResult(java.lang.String get_cableslengthResult) {
        this.get_cableslengthResult = get_cableslengthResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_cableslengthResponse)) return false;
        Get_cableslengthResponse other = (Get_cableslengthResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_cableslengthResult==null && other.getGet_cableslengthResult()==null) || 
             (this.get_cableslengthResult!=null &&
              this.get_cableslengthResult.equals(other.getGet_cableslengthResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGet_cableslengthResult() != null) {
            _hashCode += getGet_cableslengthResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_cableslengthResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_cableslengthResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_cableslengthResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_cableslengthResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
