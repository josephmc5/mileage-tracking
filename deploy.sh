#!/bin/bash

mvn package
catalina stop
sleep 3
cp target/mileage-tracking.war /usr/local/tomcat/webapps/ROOT.war
rm -frv /usr/local/tomcat/webapps/ROOT
catalina start
