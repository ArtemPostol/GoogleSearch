# Project Title

Project for search in google search engine.
- Navigate to google.com in web browser
- Enter "Selenium" into search field
- Click on "Search" button
- Assert number of Search results is 10 on page 1
- Assert that each result in a list contains searchterm
- Click on "2' link to switch to next page
- Assert number of Search results is 10 on page 2
- Assert that each result in a list contains searchterm

## Getting Started

1. Download **intellij idea** from [https://www.jetbrains.com/idea/download/#section=windows]
2. Download **jdk** from [http://www.oracle.com/technetwork/java/javase/downloads/index.html]
3. Run the **ideaIC.exe** file you have downloaded
4. Setup the **jdk-10.0.1_windows-x64_bin** whith default parameters
5. Download *Mozilla* from [https://www.mozilla.org/ru/firefox/new/]
6. Download **geckodriver** from [https://github.com/mozilla/geckodriver/releases]
7. Copy **geckodriver** to C:/Windows/System32/
8. Run **intellij idea** and create new project, in Project SDK choose jdk-10.0.1 from C:\Program Files\Java\jdk-10.0.1
9. Setup dependencies:
    [   <dependency>
                  <groupId>org.seleniumhq.selenium</groupId>
                  <artifactId>selenium-java</artifactId>
                  <version>3.11.0</version>
              </dependency>
              <dependency>
                  <groupId>org.testng</groupId>
                  <artifactId>testng</artifactId>
                  <version>6.14.3</version>
                  <scope>test</scope>
              </dependency>

              <dependency>
                  <groupId>com.sun.mail</groupId>
                  <artifactId>javax.mail</artifactId>
                  <version>1.6.1</version>
              </dependency>

              <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
              <dependency>
                  <groupId>org.apache.commons</groupId>
                  <artifactId>commons-lang3</artifactId>
                  <version>3.4</version>
              </dependency>

              <dependency>
                  <groupId>io.github.bonigarcia</groupId>
                  <artifactId>webdrivermanager</artifactId>
                  <version>2.2.1</version>
              </dependency>

              <dependency>
                  <groupId>com.sun.xml.security</groupId>
                  <artifactId>xml-security-impl</artifactId>
                  <version>1.0</version>
              </dependency>].

## Project contains:

1. GoogleBasePage - base class for extends other pages, contains pattern Page Factory
2. GoogleResultSearchPage, GoogleResultSearchSecondPage, GoogleSearchPage - pages that describe the elements and methods on these pages
3. GoogleSearchBaseTest - base class for extends other classes, contains pattern Page Object
4. GoogleSearchTest - class that realized search in google
5. google-search-tests - XML file for run search test on google chrome and firefox.


