<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Product SKU Count</name>
   <tag></tag>
   <elementGuidId>6a29782f-eb88-4ef2-89a4-298da631e585</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>OAuth ${AuthToken}</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content_Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=SELECT ivybase__Product__r.Category__c,ivybase__Product__r.Category_Local_Name__c,ivybase__Product__r.Name,ivybase__Product__r.ivybase__Short_Description__c from ivybase__Product_Group_Detail__c where ivybase__Product_Group__c In(SELECT ivybase__Product_Group__c from ivybase__Product_Group_Mapping__c where ivybase__Store_Hierarchy__c IN('a0g2H000007FzBqQAK')) and Active__c=true and End_Date__c > TODAY and ivybase__Product_Group__r.RecordType.Name='Stock Check'</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.instance_url</defaultValue>
      <description></description>
      <id>7fd1ef47-1508-4a1f-93ad-98edbc0d52ee</id>
      <masked>false</masked>
      <name>instance_url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.AuthToken</defaultValue>
      <description></description>
      <id>e2329d4c-2536-4c9d-8127-bf985d9bd86b</id>
      <masked>false</masked>
      <name>AuthToken</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.StoreCode</defaultValue>
      <description></description>
      <id>8b8b1422-1372-4871-8930-bac59f74d8e5</id>
      <masked>false</masked>
      <name>StoreCode</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.UserCode</defaultValue>
      <description></description>
      <id>cd62051e-deb1-4a16-b983-c8dc1dde28ff</id>
      <masked>false</masked>
      <name>UserCode</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
