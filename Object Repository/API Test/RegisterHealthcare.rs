<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>RegisterHealthcare</name>
   <tag></tag>
   <elementGuidId>c1a0fcea-8382-4678-a329-9fb3a5a38bb7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;multipart/form-data&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;role&quot;,
      &quot;value&quot;: &quot;healthcare&quot;,
      &quot;type&quot;: &quot;Text&quot;
    },
    {
      &quot;name&quot;: &quot;id_card&quot;,
      &quot;value&quot;: &quot;0000001000&quot;,
      &quot;type&quot;: &quot;Text&quot;
    },
    {
      &quot;name&quot;: &quot;username&quot;,
      &quot;value&quot;: &quot;Lourine&quot;,
      &quot;type&quot;: &quot;Text&quot;
    },
    {
      &quot;name&quot;: &quot;email&quot;,
      &quot;value&quot;: &quot;ernita.susanti86@gmail.com&quot;,
      &quot;type&quot;: &quot;Text&quot;
    },
    {
      &quot;name&quot;: &quot;phone&quot;,
      &quot;value&quot;: &quot;08980000000000&quot;,
      &quot;type&quot;: &quot;Text&quot;
    },
    {
      &quot;name&quot;: &quot;full_name&quot;,
      &quot;value&quot;: &quot;Lourine Alexa&quot;,
      &quot;type&quot;: &quot;Text&quot;
    },
    {
      &quot;name&quot;: &quot;password&quot;,
      &quot;value&quot;: &quot;sehatitelectg1234&quot;,
      &quot;type&quot;: &quot;Text&quot;
    },
    {
      &quot;name&quot;: &quot;user_type&quot;,
      &quot;value&quot;: &quot;Rumah Sakit&quot;,
      &quot;type&quot;: &quot;Text&quot;
    },
    {
      &quot;name&quot;: &quot;region_id&quot;,
      &quot;value&quot;: &quot;191&quot;,
      &quot;type&quot;: &quot;Text&quot;
    },
    {
      &quot;name&quot;: &quot;activated&quot;,
      &quot;value&quot;: &quot;true&quot;,
      &quot;type&quot;: &quot;Text&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>multipart/form-data</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Language</name>
      <type>Main</type>
      <value>id</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiJ9.eyJpZGVudGlmaWVyIjoxLCJleHBpcnlfZGF0ZSI6IjIwMTktMDgtMjkgMTc6NTY6MDMgKzA4MDAifQ.Eel92MeTgsyEp174V8A5k9T4cp0AYTURijTTySBEF7E</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://staging.telectg.co.id/api/v1/register</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
