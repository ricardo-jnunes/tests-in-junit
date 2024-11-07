# Two Spring Boot applications using a shared library
This repository shows you how to create a library project with Spring Boot.

The project will have a library jar and two main applications that uses the library. You could also use it to see how to build a library (that is, a jar file that is not an application) on its own.

## Usage


- Library project appdependency 
It has Even or Odd validation and a Binary Search algorithm to use

- Projeto1 application runs at 8081 and uses appdependency implementations

> curl --location --request POST 'http://localhost:8081/even/2'

- Projeto2 application runs at 8082 and uses appdependency implementations

> curl --location --request POST 'http://localhost:8082/algorithms/binarysearch/?sortedArray=1%2C2%2C3%2C7&key=2 


## Tests

### Test scope dependencies
If you use the spring-boot-starter-test ‘Starter’ (in the test scope), you will find the following provided libraries:

- JUnit — The de-facto standard for unit testing Java applications.
- Spring Test & Spring Boot Test — Utilities and integration test support for Spring Boot applications.
- AssertJ — A fluent assertion library.
- Hamcrest — A library of matcher objects (also known as constraints or predicates).
- Mockito — A Java mocking framework.
- JSONassert — An assertion library for JSON.
- JsonPath — XPath for JSON.

### Code Coverage
Configured JaCoCo in these projects.
The JaCoCo Maven plug-in provides the JaCoCo runtime agent to your tests and allows basic report creation.

In simple terms, code coverage means measuring the percentage of lines of code that are executed during automated tests. For example, if you have a method containing 100 lines of code and you are writing a test case for it, code coverage tells you briefly how many of those lines were actively exercised by the test.
