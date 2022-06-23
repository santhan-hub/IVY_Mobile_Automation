<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>VGP_SOS: To verify user is not enforcing to select mandatory Reason Code in VGP-SOS screen when user tap on other screen or proceed to summary button without selecting reason code for the visited category when VGP_SOS_REASON_MANDATE confg is disabled

Query:
---------------
select Is_ReasonCode_Required__c,Instruction__c,Collection_Method__c,Product_Category__r.name,Product_Hierarchy__r.name from Measure_Mapping__c where Market_Measure_Master__r.Screen_Group__c ='VGP-SOS' and Store_Hierarchy__r.ivybase__Internal_Id__c ='416'  and Valid_Upto__c >=TODAY and  Is_ReasonCode_Required__c = true order by Collection_Method__c,Product_Category__r.Name,Product_Hierarchy__r.Name</description>
   <name>AISS-REGR_VGP_SOS_TC0079_MANDATE</name>
   <tag></tag>
   <elementGuidId>b40fd7de-a1d0-4782-b635-e1a7c7abd762</elementGuidId>
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
   <restUrl>${instance_url}/services/data/v53.0/query/?q=Select name,ivybase__Location_Hierarchy__r.Name,ivybase__Resource_Type__r.Name,ivybase__flag__c from ivybase__HHTModule_Master__c where name = 'VGP_SOS_REASON_MANDATE' AND ivybase__Resource_Type__r.Name= 'KR SalesRep Sage' And ivybase__flag__c=0</restUrl>
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
