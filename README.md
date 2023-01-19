# Mule Velocity Module Extension

## What?
This project contains utilities to implement Apache Velocity functionality in a Mule application 

## Why?
The main reason for developing this project is to allow for HTML / Text template usage smoothly within a Mule application without requiring custom java code 

## Changes
### 1.0.0
* Initial implementation
  - Basic implementation that reads in a Velocity template as a string and performs value substitution with key-value pairs

## Using the Process Template processor
The Process Template processor has 3 fields. The template field is for the template or a reference to a variable containing the template as a String. The Log Tag field is for a string that any error logs will be tagged with by Velocity. The Template Substitution Values field contains either a list of key-value pairs defined inline or a reference to a variable containing a Java ArrayList of key-value pairs that will be used to match template variables (indicated by $YOUR_VARIABLE_NAME in the template) with the values from the matching key.

A dataweave transform to take an arbitrary json payload and transform it into something useable by the processor would look something like this:
```
%dw 2.0
output application/java
---
payload pluck ((value,key,index) ->
	(key):value
)
```

Add this dependency to your application pom.xml to use the module:
```xml
<groupId>com.avioconsulting.mule</groupId>
<artifactId>mule-velocity-module</artifactId>
<version>1.0.0</version>
<classifier>mule-plugin</classifier>
```
