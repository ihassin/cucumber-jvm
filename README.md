Cucumber-JVM Demo
=================

[![Build Status](https://travis-ci.org/ihassin/cucumber-jvm.svg?branch=master)](https://travis-ci.org/ihassin/cucumber-jvm)

# Setup
To get started:

```
bash
$ git clone git@github.com:ihassin/cucumber-jvm.git
$ cd cucumber-jvm
```

# Running

```
$ mvn clean test
```

# Example feature file

Please see [here](https://github.com/ihassin/cucumber-jvm/blob/master/src/test/resources/com/demo/warehouse/barcode.feature).

# Tips
Set up a pre-commit hook in git to assure that committed code is tested prior to commit to the repo.

My .git/hooks/pre-commit file looks like this:

```
#!/bin/sh

mvn clean test
```
