<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>ProductTagging</name>
   <tag></tag>
   <elementGuidId>59bbffcd-ae92-47b6-8240-f38ea7c4b9d8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
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
      <webElementGuid>3343a4fc-981e-49fc-bbed-ef3b0c033d91</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content_Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>d7724406-b45c-4e12-8d42-a2aa2a45097c</webElementGuid>
   </httpHeaderProperties>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${instance_url}/services/data/v53.0/query/?q=SELECT Name,Record_Type_Name__c FROM ivybase__Product_Hierarchy__c WHERE Record_Type_Name__c = 'Category' AND Location_Hierarchy_Name__c ='Korea SMO' AND  Id IN (SELECT Product_Category__c FROM Measure_Mapping__c WHERE Market_Measure_Master__r.Screen_Group__c IN ('VGP-SOS','VGP-SOD','VGP') AND Store_Hierarchy__c = 'a0g2H000007FzBqQAK'AND Valid_From__C&lt;= today AND Valid_Upto__c>= today)</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.instance_url</defaultValue>
      <description></description>
      <id>870ca531-e2ba-4a94-92c5-69eb658debb8</id>
      <masked>false</masked>
      <name>instance_url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.AuthToken</defaultValue>
      <description></description>
      <id>24b75fd0-2432-46dd-a5da-a849a63ae951</id>
      <masked>false</masked>
      <name>AuthToken</name>
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
