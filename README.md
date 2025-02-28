
# ApexMethodExtractor Toolset Documentation

- This document provides an overview of the ApexMethodExtractor toolset, which is used to extract and list methods used in Apex classes. It includes both a Java program and a Bash script that together make it easy to extract and display method names from one or multiple Apex class files.

## Overview

- The ApexMethodExtractor is a toolset designed for developers working with Salesforce Apex code. It allows for the extraction of method names used in Apex classes by parsing .cls files. The tool is composed of two parts:
	1.	ApexMethodExtractor (Java Program): A Java program that extracts method names from an individual Apex class file.
	2.	extract_methods.sh (Bash Script): A Bash script that iterates over all .cls files in a directory, calling the Java program for each class, and lists the methods used in each class along with their serial numbers.

- Prerequisites
	•	Java (JDK 8 or higher)
	•	ANTLR 4 (For parsing the Apex language)
    •	[apex grammer: apex.g4](https://github.com/antlr/grammars-v4/blob/master/apex/apex.g4) 
	•	Bash (For running the Bash script)
	•	Apex Class Files (.cls files) to analyze.

## ApexMethodExtractor Java Program

### Purpose

The ApexMethodExtractor Java program is responsible for parsing an individual Apex class and extracting the methods used within that class. It relies on ANTLR to process the Apex language grammar.

### Usage

```bash
java -cp .:antlr-4.13.2-complete.jar ApexMethodExtractor <path_to_apex_class>
```
	•	<path_to_apex_class>: The file path of the Apex class (ending in .cls) for which you want to extract methods.

### How It Works
	•	The program reads the provided Apex class file.
	•	It uses ANTLR to parse the class file according to the Apex grammar.
	•	The program identifies all the method declarations and prints them to the console.

### Example Output

```
Method found: myMethod1
Method found: myMethod2
```


## extract_methods.sh (Bash Script)
- [script](extract_methods.sh)

## Purpose

The extract_methods.sh script is a convenient tool for processing multiple Apex class files in a directory. It will list the methods for each class, providing a serial number for easy reference.

### Usage

```bash
./extract_methods.sh -path-classes <path_to_apex_classes_directory>
```
	•	<path_to_apex_classes_directory>: The path to the directory containing the Apex .cls files.

### How It Works
	1.	The script takes a directory path containing .cls files as input.
	2.	It loops through all .cls files in the directory.
	3.	For each file, it runs the ApexMethodExtractor Java program.
	4.	It lists the methods in each class along with a serial number for easy identification.

### Script Behavior
	•	It will output a table with a serial number, class name, and the methods found in that class.
	•	Each class is processed sequentially, and the serial number is updated for each class.
	•	Methods for each class are displayed immediately after the class name.

### Example Output

```bash
Serial No.   Apex Class         Methods
1            MyClass            
Method found: myMethod1
Method found: myMethod2

2            AnotherClass       
Method found: anotherMethod
Method found: anotherMethod2
...
```

### Installation Instructions

1. Install Prerequisites

Make sure that you have the following installed:
	•	Java (JDK 8 or higher)
	•	ANTLR 4 jar file (version 4.13.2 used in this example)
	•	Download from ANTLR’s official site.

2. Compile and Set Up
	1.	Download the necessary files:
	•	Download the antlr-4.13.2-complete.jar file.
	•	Download the ApexMethodExtractor.java and associated files from your repository or source.
	2.	Compile the Java program:
In the terminal, navigate to the folder where your ApexMethodExtractor.java and ANTLR jar file are located, and run:

```bash
javac -cp .:antlr-4.13.2-complete.jar ApexMethodExtractor.java
```


	3.	Make the Bash script executable:
```bash
chmod +x extract_methods.sh
```


## How to Use the Toolset

Step 1: Run the Java Program

To extract methods from a single Apex class:

```bash
java -cp .:antlr-4.13.2-complete.jar ApexMethodExtractor <path_to_apex_class>

```

This will print the list of methods in the specified Apex class.

### Step 2: Run the Bash Script

To extract methods from all Apex classes in a directory:

```bash
./extract_methods.sh -path-classes <path_to_apex_classes_directory>
```

This will output a table of methods used in each class, including a serial number for easy reference.

Example Directory Structure
```bash
.
├── ApexMethodExtractor.java
├── antlr-4.13.2-complete.jar
├── extract_methods.sh
├── src
│   └── MyClass.cls
│   └── AnotherClass.cls
└── output
```

### Sample Command

```
./extract_methods.sh -path-classes ./src
```


### Sample Output

```bash
Serial No.   Apex Class         Methods
1            MyClass            
Method found: myMethod1
Method found: myMethod2

2            AnotherClass       
Method found: anotherMethod
Method found: anotherMethod2
...

```


### Error Handling and Troubleshooting
	•	Missing .cls Files: Ensure that the directory provided contains valid .cls files.
	•	ANTLR Errors: If you encounter errors related to parsing, ensure that the version of ANTLR and the grammar files are correct.

### License

This toolset is distributed under the MIT License.

