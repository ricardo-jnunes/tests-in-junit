# Two Spring Boot applications using a shared library
This repository shows you how to create a multi-module project with Spring Boot.

The project will have a library jar and two main applications that uses the library. You could also use it to see how to build a library (that is, a jar file that is not an application) on its own.


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
