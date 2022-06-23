<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>VGP_SOS: To verify Based on Store Category Mapping Categories are displayed in drop down in VGP-SOS screen  

Query:
---------------
SELECT Product_Hierarchy__c,Product_Hierarchy__r.Name FROM Store_Category_Mapping__c where Store__r.Name='KIM JONG UN (Manual Store)' and Related_User__c='0058H000000dkT8' AND Product_Hierarchy__c IN (SELECT Product_Category__c FROM Measure_Mapping__c WHERE Market_Measure_Master__r.Screen_Group__c IN ('VGP-SOS','VGP-SOD','VGP')  AND Store_Hierarchy__r.Name = 'EMART_HM_Small' AND Valid_From__C&lt;= today AND Valid_Upto__c>= today)</description>
   <name>AISS-REGR_VGP_SOS_TC0001</name>
   <tag></tag>
   <elementGuidId>b9fc09a6-efa0-4366-bc10-78c328d2ab53</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
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
      <webElementGuid>0566e5ca-8b5c-4dc8-905e-1e1849716ba8</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content_Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>5e32f154-0931-4e7d-b97d-70073d76de89</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=SELECT Product_Hierarchy__c,Product_Hierarchy__r.Name FROM Store_Category_Mapping__c where Store__r.Name='KIM JONG UN (Manual Store)' and Related_User__c='0058H000000dkT8' AND Product_Hierarchy__c IN (SELECT Product_Category__c FROM Measure_Mapping__c WHERE Market_Measure_Master__r.Screen_Group__c IN ('VGP-SOS','VGP-SOD','VGP')  AND Store_Hierarchy__r.Name = 'EMART_HM_Small' AND Valid_From__C&lt;= today AND Valid_Upto__c>= today)</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.instance_url</defaultValue>
      <description></description>
      <id>9d05aad7-3250-433d-b261-1a90687280a8</id>
      <masked>false</masked>
      <name>instance_url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.AuthToken</defaultValue>
      <description></description>
      <id>8627047d-1eb2-469e-9509-bf7212093969</id>
      <masked>false</masked>
      <name>AuthToken</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
