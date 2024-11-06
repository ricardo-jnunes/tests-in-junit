# The Library

Typically the “starter” module is separated from the “autoconfigure” module. However, it is not required. The autoconfigure module contains everything necessary for a start. Moreover, if I’m creating a simple library that does not consist of many classes, I’m inserting everything into a single starter module.

You can still create a separate starter module that includes the required dependencies for the project. It is the most important that all the beans are registered inside the auto-configuration class. Do not annotate each of your beans inside a library with @Component or @Service, but define them in an auto-configured module.


