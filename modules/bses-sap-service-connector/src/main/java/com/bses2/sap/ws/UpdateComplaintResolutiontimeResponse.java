/**
 * UpdateComplaintResolutiontimeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class UpdateComplaintResolutiontimeResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.UpdateComplaintResolutiontimeResponseUpdateComplaintResolutiontimeResult updateComplaintResolutiontimeResult;

    public UpdateComplaintResolutiontimeResponse() {
    }

    public UpdateComplaintResolutiontimeResponse(
           com.bses2.sap.ws.UpdateComplaintResolutiontimeResponseUpdateComplaintResolutiontimeResult updateComplaintResolutiontimeResult) {
           this.updateComplaintResolutiontimeResult = updateComplaintResolutiontimeResult;
    }


    /**
     * Gets the updateComplaintResolutiontimeResult value for this UpdateComplaintResolutiontimeResponse.
     * 
     * @return updateComplaintResolutiontimeResult
     */
    public com.bses2.sap.ws.UpdateComplaintResolutiontimeResponseUpdateComplaintResolutiontimeResult getUpdateComplaintResolutiontimeResult() {
        return updateComplaintResolutiontimeResult;
    }


    /**
     * Sets the updateComplaintResolutiontimeResult value for this UpdateComplaintResolutiontimeResponse.
     * 
     * @param updateComplaintResolutiontimeResult
     */
    public void setUpdateComplaintResolutiontimeResult(com.bses2.sap.ws.UpdateComplaintResolutiontimeResponseUpdateComplaintResolutiontimeResult updateComplaintResolutiontimeResult) {
        this.updateComplaintResolutiontimeResult = updateComplaintResolutiontimeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateComplaintResolutiontimeResponse)) return false;
        UpdateComplaintResolutiontimeResponse other = (UpdateComplaintResolutiontimeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateComplaintResolutiontimeResult==null && other.getUpdateComplaintResolutiontimeResult()==null) || 
             (this.updateComplaintResolutiontimeResult!=null &&
              this.updateComplaintResolutiontimeResult.equals(other.getUpdateComplaintResolutiontimeResult())));
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
        if (getUpdateComplaintResolutiontimeResult() != null) {
            _hashCode += getUpdateComplaintResolutiontimeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateComplaintResolutiontimeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateComplaintResolutiontimeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateComplaintResolutiontimeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateComplaintResolutiontimeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>UpdateComplaintResolutiontimeResponse>UpdateComplaintResolutiontimeResult"));
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
