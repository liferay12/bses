/**
 * Get_Cable_section_detail1.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bses2.sap.ws;

public class Get_Cable_section_detail1  implements java.io.Serializable {
    private java.lang.String cblID;

    public Get_Cable_section_detail1() {
    }

    public Get_Cable_section_detail1(
           java.lang.String cblID) {
           this.cblID = cblID;
    }


    /**
     * Gets the cblID value for this Get_Cable_section_detail1.
     * 
     * @return cblID
     */
    public java.lang.String getCblID() {
        return cblID;
    }


    /**
     * Sets the cblID value for this Get_Cable_section_detail1.
     * 
     * @param cblID
     */
    public void setCblID(java.lang.String cblID) {
        this.cblID = cblID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Cable_section_detail1)) return false;
        Get_Cable_section_detail1 other = (Get_Cable_section_detail1) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cblID==null && other.getCblID()==null) || 
             (this.cblID!=null &&
              this.cblID.equals(other.getCblID())));
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
        if (getCblID() != null) {
            _hashCode += getCblID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Cable_section_detail1.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Cable_section_detail1"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cblID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CblID"));
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
