package com.registration.test.ws;

public class UserDetails {

	String firstName;
	String secondName;
	int phoneNumber;
	String address;
	
	public UserDetails(String firstName,
					String secondName,
					int phoneNumber,
					String address){
		this.firstName = firstName;
		this.secondName = secondName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	
	 private static org.apache.axis.description.TypeDesc typeDesc =
		        new org.apache.axis.description.TypeDesc(UserDetails.class, true);
	 static {
		 
		 typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "UserDetails"));
	        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
	        elemField.setFieldName("firstName");
	        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FirstName"));
	        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
	        elemField.setMinOccurs(0);
	        elemField.setNillable(false);
	        typeDesc.addFieldDesc(elemField);
	        elemField = new org.apache.axis.description.ElementDesc();
	        elemField.setFieldName("secondName");
	        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SecondName"));
	        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
	        elemField.setMinOccurs(0);
	        elemField.setNillable(false);
	        typeDesc.addFieldDesc(elemField);
	        elemField = new org.apache.axis.description.ElementDesc();
	        elemField.setFieldName("phoneNumber");
	        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PhoneNumber"));
	        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
	        elemField.setMinOccurs(0);
	        elemField.setNillable(false);
	        typeDesc.addFieldDesc(elemField);
	        elemField = new org.apache.axis.description.ElementDesc();
	        elemField.setFieldName("address");
	        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Address"));
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
}
