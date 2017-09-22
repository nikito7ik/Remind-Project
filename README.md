# Remind server
Packages
-----------

     src\main\java\com\nikita\remind\server:
          config:
               DatabaseConfig.java
               WebConfig.java
          controller:
               ReminderController.java
          entity:
               Remind.java
          repository:
               RemindRepository.java
          service:
               ReminderService.java
               ReminderServiceImpl.java
          ApplicationInitializer
     pom.xml

What is it?
  ------------
  
  This is a remind server and there are its function:
  
  - Allows you to add a reminder
  - You can add the date for the reminder
  - You can add the name for the reminder
  - You can add the id for the reminder
  
  Dependencies
  ------------
  
  The server is running on a PostgreSQL database, more detailed information about the dependencies can be seen in the file pom.xml
