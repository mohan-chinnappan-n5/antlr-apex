#!/bin/bash

# Rename files to match the correct Java class name convention
mv apexBaseListener.java ApexBaseListener.java
mv apexBaseVisitor.java ApexBaseVisitor.java
mv apexLexer.java ApexLexer.java
mv apexListener.java ApexListener.java
mv apexParser.java ApexParser.java
mv apexVisitor.java ApexVisitor.java

echo "Files have been renamed successfully."