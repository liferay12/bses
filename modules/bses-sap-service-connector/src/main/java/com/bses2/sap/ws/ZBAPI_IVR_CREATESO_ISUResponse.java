/**
 * ZBAPI_IVR_CREATESO_ISUResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class ZBAPI_IVR_CREATESO_ISUResponse  implements java.io.Serializable {
    private com.bses2.sap.ws.ZBAPI_IVR_CREATESO_ISUResponseZBAPI_IVR_CREATESO_ISUResult ZBAPI_IVR_CREATESO_ISUResult;

    public ZBAPI_IVR_CREATESO_ISUResponse() {
    }

    public ZBAPI_IVR_CREATESO_ISUResponse(
           com.bses2.sap.ws.ZBAPI_IVR_CREATESO_ISUResponseZBAPI_IVR_CREATESO_ISUResult ZBAPI_IVR_CREATESO_ISUResult) {
           this.ZBAPI_IVR_CREATESO_ISUResult = ZBAPI_IVR_CREATESO_ISUResult;
    }


    /**
     * Gets the ZBAPI_IVR_CREATESO_ISUResult value for this ZBAPI_IVR_CREATESO_ISUResponse.
     * 
     * @return ZBAPI_IVR_CREATESO_ISUResult
     */
    public com.bses2.sap.ws.ZBAPI_IVR_CREATESO_ISUResponseZBAPI_IVR_CREATESO_ISUResult getZBAPI_IVR_CREATESO_ISUResult() {
        return ZBAPI_IVR_CREATESO_ISUResult;
    }


    /**
     * Sets the ZBAPI_IVR_CREATESO_ISUResult value for this ZBAPI_IVR_CREATESO_ISUResponse.
     * 
     * @param ZBAPI_IVR_CREATESO_ISUResult
     */
    public void setZBAPI_IVR_CREATESO_ISUResult(com.bses2.sap.ws.ZBAPI_IVR_CREATESO_ISUResponseZBAPI_IVR_CREATESO_ISUResult ZBAPI_IVR_CREATESO_ISUResult) {
        this.ZBAPI_IVR_CREATESO_ISUResult = ZBAPI_IVR_CREATESO_ISUResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZBAPI_IVR_CREATESO_ISUResponse)) return false;
        ZBAPI_IVR_CREATESO_ISUResponse other = (ZBAPI_IVR_CREATESO_ISUResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ZBAPI_IVR_CREATESO_ISUResult==null && other.getZBAPI_IVR_CREATESO_ISUResult()==null) || 
             (this.ZBAPI_IVR_CREATESO_ISUResult!=null &&
              this.ZBAPI_IVR_CREATESO_ISUResult.equals(other.getZBAPI_IVR_CREATESO_ISUResult())));
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
        if (getZBAPI_IVR_CREATESO_ISUResult() != null) {
            _hashCode += getZBAPI_IVR_CREATESO_ISUResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZBAPI_IVR_CREATESO_ISUResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ZBAPI_IVR_CREATESO_ISUResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZBAPI_IVR_CREATESO_ISUResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZBAPI_IVR_CREATESO_ISUResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>ZBAPI_IVR_CREATESO_ISUResponse>ZBAPI_IVR_CREATESO_ISUResult"));
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
