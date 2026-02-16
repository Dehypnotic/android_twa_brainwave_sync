@echo off
setlocal
set BASEDIR=%~dp0
set JAVA_EXE=java
if not "%JAVA_HOME%"=="" set JAVA_EXE=%JAVA_HOME%\bin\java
"%JAVA_EXE%" -jar "%BASEDIR%\gradle\wrapper\gradle-wrapper.jar" %*
endlocal

