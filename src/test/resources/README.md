######Technology Stack:

1. Java 18 
2. Maven 3.0.0-M4
3. Selenium 4.1.3
4. TestNG 7.5

#####Preconditions:
1. Сделать refresh зависимостей и 
2. Проверить еще раз совместимость версий

#####Checklist
1. Проверить страницу "Context menu" на корректность работы с меню
2. Проверить страницу "Dynamic controls page" на корректность работы с инпутами
3. Проверить страницу "File uploader Page" на корректность работы c загрузкой файлов
4Проверить страницу "Frames page" на корректность работы c фрэймами


#####Maven Homework
1. maven clean test
   Tests run: 13, Failures: 0, Errors: 0, Skipped: 0, Time emvn - lapsed: 50.409 s - in TestSuite
2. mvn clean test -Dtest=LoginTest
   Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
3. mvn clean test -DsuiteXmlFile=src/test/resources/regression.xml
   Tests run: 13, Failures: 0, Errors: 0, Skipped: 0





