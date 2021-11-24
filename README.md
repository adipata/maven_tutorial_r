# Maven Tutorial for R

Support sources for a short tutorial dedicated to Roxana

## Simplest code

```
public class test {
	public static void main(String[] args) {
		System.out.println("hello");
	}
}
```

javac test.java

java test

## Plain java example

c:\Java\jdk-11.0.9\bin\javac -classpath lib/inamik-text-tables-1.0-SNAPSHOT.jar -sourcepath src -d classes src/lu/pata/chitibus/app/MainProgram.java
c:\Java\jdk-11.0.9\bin\java -classpath classes;lib/inamik-text-tables-1.0-SNAPSHOT.jar lu.pata.chitibus.app.MainProgram

## Maven example

mvn archetype:generate -DgroupId=lu.pata.chitibus -DartifactId=r_demo -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

## Maven common commands

* mvn clean
* mvn install
* mvn package
