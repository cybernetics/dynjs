# dynjs - invokedynamic-based javascript impl

[![Build Status](https://secure.travis-ci.org/dynjs/dynjs.png)](http://travis-ci.org/dynjs/dynjs)

![cloudbees rocks!](http://static-www.cloudbees.com/images/badges/BuiltOnDEV.png)

## Bug Reports

We've got a [Jira](https://jira.codehaus.org/browse/DYNJS) over at Codehaus. Please let us know what issues you find!

## Setting up environment


### Getting JDK7

OSX can get information on installing at the [java site](http://www.java.com/en/download/faq/java_mac.xml).

Download and install it to your user (not to the entire machine) and before
running `mvn install` run (or use Java7 as default compiler):
		
		export JAVA_HOME=$(/usr/libexec/java_home -v 1.7)
		

## Getting started


### Building from sources

1. `git clone https://github.com/dynjs/dynjs.git && cd dynjs`
2. `mvn install -s support/settings.xml`

### Download

Alternatively download the [latest version](https://dynjs.ci.cloudbees.com/job/dynjs/ws/target/dynjs-all.jar) from our CI job.

### Running 

Run `./bin/dynjs --console` for the REPL and try the snippet below:

```javascript
var x = 1 + 1;
print(x);
```

For more options, run `./dynjs --help`.

