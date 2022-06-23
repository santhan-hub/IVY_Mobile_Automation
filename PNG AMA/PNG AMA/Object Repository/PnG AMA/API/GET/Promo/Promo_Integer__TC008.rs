<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Promo_Integer__TC008</name>
   <tag></tag>
   <elementGuidId>8e401fd6-0394-4628-81fb-c523d1ac6ac8</elementGuidId>
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
   <restUrl>${instance_url}/services/data/v53.0/query/?q=SELECT Category__c,Instruction__c ,Target__c,Market_Measure_Master__r.Type__c, Market_Measure_Master__r.Screen_Group__c FROM Measure_Mapping__c WHERE Market_Measure_Master__r.Screen_Group__c = 'PROMOTION' AND Market_Measure_Master__r.Type__c = 'Integer' AND Store_Hierarchy__c = 'a0g2H000007FzBqQAK' AND Valid_From__C&lt;= today AND Valid_Upto__c>= today</restUrl>
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
      <defaultValue>GlobalVariable.store_Hierarchy_Code</defaultValue>
      <description></description>
      <id>8b8b1422-1372-4871-8930-bac59f74d8e5</id>
      <masked>false</masked>
      <name>store_Hierarchy_Code</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


assertThat(response.getStatusCode()).isIn(Arrays.asList(200, 201, 202))</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
