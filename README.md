Cucumber-JVM Demo
=================
This is a simple example of how to get started with "TDD, BDD and all that Jazz: The road to crystal clear executable requirements". It was shown at [The New York XP & Agile Meetup Group (New York, NY) on Monday 2014-11-03](http://www.meetup.com/xp-26/events/215576942/?_af_eid=215576942&_af=event&a=uc1_te).

[![Build Status](https://travis-ci.org/ihassin/cucumber-jvm.svg?branch=master)](https://travis-ci.org/ihassin/cucumber-jvm)

# Setup
To get started:

```
bash
$ git clone git@github.com:ihassin/cucumber-jvm.git
$ cd cucumber-jvm
```
Make sure you have maven installed

```
brew install maven
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
