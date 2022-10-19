# jdk-11-tinker-archetype

An archetype for JDK11-powered tinkering of all sorts.
Should have put 

## Bootstrapped (to be) stuff
- logging with log4j / slf
- a simple application context
- some integration test
- some unit test
- upgraded maven plugins

## Cheatsheet
## To test
```bash
mvn install
mvn archetype:generate  \
      -DarchetypeCatalog=local \
      -DarchetypeGroupId=com.github.bawey  -DarchetypeArtifactId=jdk-11-tinker-archetype \
      -DarchetypeVersion=0.0.1             \
      -DgroupId=com.github.bawey                    \
      -DartifactId=my-throwaway-project \
      -Dversion=0.0.1-SNAPSHOT 
```