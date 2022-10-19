# jdk-11-tinker-archetype

An archetype for JDK11-powered tinkering of all sorts.

## Bootstrapped stuff
- simple log4j / slf config
- rudimentary Spring context
- up-to-date versions of typical dependencies

## Using it
```bash
mvn archetype:generate  \
      -DarchetypeCatalog=local \
      -DarchetypeGroupId=com.github.bawey \
      -DarchetypeArtifactId=jdk-11-tinker-archetype \
      -DarchetypeVersion=0.0.1             \
      -DgroupId=com.github.bawey                    \
      -DartifactId=my-throwaway-project \
      -Dversion=0.0.1-SNAPSHOT 
```