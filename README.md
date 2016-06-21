# CloneStringJava

#3 Exporting de code in Eclipse

1. Go to File->Export.
2. Choose 'Runnable JAR file'.
3. Select 'main - CloneString' as Launch configuration.
4. Browse the export destination.
5. On Library handling, choose the second option.
5. Finish.

#3 Running the application

```
java -jar CloneStringJava.jar <FirstFileUrlToCompare> <SecondFileUrlToCompare> 
```

#3 Command example

java -jar CloneStringJava.jar https://github.com/marlonlucioss/cesmaccloud/blob/master/src/main/java/com/marlon/App.java https://github.com/marlonlucioss/cesmaccloud/blob/master/src/main/java/com/marlon/Todos.java