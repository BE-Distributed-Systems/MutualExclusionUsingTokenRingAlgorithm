# MutualExclusionUsingTokenRingAlgorithm
Mutual exclusion using token ring algorithm

## Setup
 
 - Make sure the code is compiling with Java 1.8. Java 1.8 can download from [here](https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=436&field_architecture_target_id=391&field_java_package_target_id=396). Download the JDK as zip. Un-zip the zip file. 
 - Set the JDK in the environment variable.
     - Go to The PC -> properties -> Advance System Settings -> Environment Variable 
        - variable name : JAVA_HOME 
        - variable value : JDK path
     - Also set the JDK/bin path to the path variable of system variables. 
     
     Note : If path variable is not there you can create a new one with 
       - Variable Name : path 
       - Variable value : JDK/bin)
 - Make sure the eclipse is installed in the system [download](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2023-03/R/eclipse-inst-jre-win64.exe)
 - Right click on project in eclipse Go to properties->Java Compiler -> Set Java Compliance to 1.8

## Testing the System
 - Create a Java Project.
 - Set the JRE to point to JDK-1.8
 - Create a Java Class with main method.
 - Run basic *System.out.println("Running");* to check the system is ready with Java Setup.
 

## Running the program 
 - Run Server.java
 - Run ClientOne.Java
 - Run ClientTwo.java
 - Enter Yes to ClientOne.java console. Then enter the data need to be sent to server. The data should be received by server.
 