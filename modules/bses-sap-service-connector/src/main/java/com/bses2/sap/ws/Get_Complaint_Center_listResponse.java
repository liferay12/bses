/**
 * Get_Complaint_Center_listResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Complaint_Center_listResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult get_Complaint_Center_listResult;

    public Get_Complaint_Center_listResponse() {
    }

    public Get_Complaint_Center_listResponse(
           com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult get_Complaint_Center_listResult) {
           this.get_Complaint_Center_listResult = get_Complaint_Center_listResult;
    }


    /**
     * Gets the get_Complaint_Center_listResult value for this Get_Complaint_Center_listResponse.
     * 
     * @return get_Complaint_Center_listResult
     */
    public com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult getGet_Complaint_Center_listResult() {
        return get_Complaint_Center_listResult;
    }


    /**
     * Sets the get_Complaint_Center_listResult value for this Get_Complaint_Center_listResponse.
     * 
     * @param get_Complaint_Center_listResult
     */
    public void setGet_Complaint_Center_listResult(com.bses2.sap.ws.Get_Complaint_Center_listResponseGet_Complaint_Center_listResult get_Complaint_Center_listResult) {
        this.get_Complaint_Center_listResult = get_Complaint_Center_listResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Complaint_Center_listResponse)) return false;
        Get_Complaint_Center_listResponse other = (Get_Complaint_Center_listResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Complaint_Center_listResult==null && other.getGet_Complaint_Center_listResult()==null) || 
             (this.get_Complaint_Center_listResult!=null &&
              this.get_Complaint_Center_listResult.equals(other.getGet_Complaint_Center_listResult())));
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
        if (getGet_Complaint_Center_listResult() != null) {
            _hashCode += getGet_Complaint_Center_listResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Complaint_Center_listResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Complaint_Center_listResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Complaint_Center_listResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Complaint_Center_listResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Get_Complaint_Center_listResponse>Get_Complaint_Center_listResult"));
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
