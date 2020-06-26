# Repository for learning javacore


In studying process the following book was used:<br/>
Author: *__Herbert Schildt__* <br/>
Book's name: __Java.__ **_The Complete Reference_** Ninth Edition


![alt text](src/main/java/com/andreyDelay/javacore/images/Schildt.jpg)

***
###Chapter that already passed and all the exercises are done:

1. ####Chapter №10

    * Exceptions' hierarchy
    * Try/catch with resources structure 
    * Block finally
    * Custom exception classes<br/>
     ![alt text](src/main/java/com/andreyDelay/javacore/images/Exceptions-in-Java.png)
    ```java
    import java.io.File;import java.io.FileInputStream;public class Main {
       public static void main(String[] args){
   //Открытие ресурса в блоке finally 
             try(FileInputStream inputStream = 
                   new FileInputStream(
                   new File(
                   "src/main/java/com/andreyDelay/javacore/images/Exceptions-in-Java.png")))   
           {
               //do something
           } catch(IOExeption e) {
              throw new RuntimeException(e);
           }
       }
   }
    ```
2. ####Chapter №13

    * 