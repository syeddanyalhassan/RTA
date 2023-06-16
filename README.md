# RTA

Before execution of RTA need to execute the following

Setting the environment variables JAVA_HOME, MAVEN_HOME and  PATH  via the system property settings may not be effective sometimes.In the command prompt, echo %JAVA_HOME% ,%MAVEN_HOME%, %PATH% and check the values if they are correctly set and included in the PATH as well. if not, you need to set those Environment variables via the command prompt using the following command:

setx JAVA_HOME "C:\Program Files\Java\jdk1.8.0_211"

setx PATH "%PATH%;%JAVA_HOME%\bin";
same for MAVEN_HOME as well.

setx MAVEN_HOME "C:\Program Files\apache-maven-3.6.1"

setx PATH "%PATH%;%MAVEN_HOME%\bin";
You can check if these are set appropriately by running the commands:  java -version and mvn --version on the command prompt.

Once done , clone the repository and run 

mvn clean install 

After that run 

allure serve allure-results
