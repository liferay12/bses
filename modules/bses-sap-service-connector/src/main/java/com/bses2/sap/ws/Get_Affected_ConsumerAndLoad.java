/**
 * Get_Affected_ConsumerAndLoad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Affected_ConsumerAndLoad  implements java.io.Serializable {
    private java.lang.String dtlist;

    public Get_Affected_ConsumerAndLoad() {
    }

    public Get_Affected_ConsumerAndLoad(
           java.lang.String dtlist) {
           this.dtlist = dtlist;
    }


    /**
     * Gets the dtlist value for this Get_Affected_ConsumerAndLoad.
     * 
     * @return dtlist
     */
    public java.lang.String getDtlist() {
        return dtlist;
    }


    /**
     * Sets the dtlist value for this Get_Affected_ConsumerAndLoad.
     * 
     * @param dtlist
     */
    public void setDtlist(java.lang.String dtlist) {
        this.dtlist = dtlist;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Affected_ConsumerAndLoad)) return false;
        Get_Affected_ConsumerAndLoad other = (Get_Affected_ConsumerAndLoad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtlist==null && other.getDtlist()==null) || 
             (this.dtlist!=null &&
              this.dtlist.equals(other.getDtlist())));
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
        if (getDtlist() != null) {
            _hashCode += getDtlist().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Affected_ConsumerAndLoad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Affected_ConsumerAndLoad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtlist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dtlist"));
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
