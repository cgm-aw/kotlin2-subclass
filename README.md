# kotlin2-subclass

Since Kotlin 2.0.0, Kotlin does not call the subclass method in certain cases. In 'KotlinCallSubclassTest' we would
expect to see that the implementations of the get() method are called, even if the method is not marked as overridden. 
However, this only works for Kotlin < 2.

Change the property 'kotlin.version' in pom.xml to 1.9.24 to see the correct behavior.