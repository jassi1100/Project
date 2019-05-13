echo off
cd C:\Users\Jassi\git\Project
del Reports\*.* /q
mvn test -Dsurefire.suiteXmlFiles=testng.xml
exit