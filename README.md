# Documentation

it is compatible with the new plugin mechanism and can be used with :

```
plugins {
  id 'com.ullink.gradle.rust' version: '0.1-SNAPSHOT'
}
```

or, when using gradler lower than 2.1 :

```
buildscript {
    repositories {
      mavenCentral()
    }

    dependencies {
        classpath "com.ullink.gradle:gradle-rust-plugin:0.1-SNAPSHOT"
    }
}
```

it creates a task 'licenseFinder' that may be configured as follows :

```
```
