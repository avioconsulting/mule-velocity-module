# Mule Velocity Module Extension

## What?
This project contains utilities to implement Apache Velocity functionality in a Mule application

## Why?
The main reason for developing this project is to allow for HTML / Text template usage smoothly within a Mule application without requiring custom java code

## Changes
### 1.0.0
* Initial implementation
  - Basic implementation that reads in a Velocity template as a string and performs value substitution with key-value pairs

## Dependency
Add this dependency to your application pom.xml to use the module:
```xml
<groupId>com.avioconsulting.mule</groupId>
<artifactId>mule-velocity-module</artifactId>
<version>1.0.0</version>
<classifier>mule-plugin</classifier>
```

## Using the Process Template processor
The Process Template processor has 3 fields. The template field is for the template or a reference to a variable containing the template as a String. The Log Tag field is for a string that any error logs will be tagged with by Velocity. The Template Substitution Values field accepts a Map of String key-value pairs either defined inline or as an expression/reference to a variable that will be used to match template variables (indicated by a $ in the template) with the values from the matching key. A simple JSON can be transformed into a usable map in dataweave by setting the output to application/java. One thing to note is that currently a '-' character breaks the variable substitution, and so variables should be a single word or string.

### Using Velocity Templates
At a basic level, this module is able to process a Velocity template containing variables marked with a $ and substitute those variables for provided values. Velocity templates can get more complex than that, and for further documentation on the syntax of Velocity please see their own user guide documentation  [here](https://velocity.apache.org/engine/2.3/user-guide.html)
