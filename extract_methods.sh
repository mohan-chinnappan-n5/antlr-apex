#!/bin/bash

# Default for the -path-classes argument
APEX_CLASSES_DIR=""

# Parse command-line arguments
while [[ "$1" != "" ]]; do
    case $1 in
        -path-classes )   shift
                          APEX_CLASSES_DIR=$1
                          ;;
        * )               echo "Usage: $0 -path-classes <path_to_apex_classes_directory>"
                          exit 1
    esac
    shift
done

# Ensure a directory is provided
if [ -z "$APEX_CLASSES_DIR" ]; then
  echo "Error: Missing directory argument. Usage: $0 -path-classes <path_to_apex_classes_directory>"
  exit 1
fi

# Check if the directory exists
if [ ! -d "$APEX_CLASSES_DIR" ]; then
  echo "Error: Directory '$APEX_CLASSES_DIR' does not exist."
  exit 1
fi

# Output header for the table
echo -e "Serial No.\tApex Class\t\t\tMethods"

# Initialize serial number
serial_number=1

# Iterate over all .cls files in the specified directory
for file in "$APEX_CLASSES_DIR"/*.cls; do
  if [ -f "$file" ]; then
    # Extract the class name (basename without extension)
    class_name=$(basename "$file" .cls)
    
    # Print serial number and class name
    echo -e "$serial_number\t$class_name\t\t\t"
    
    # Run the Java program to extract methods for the current Apex class
    # The output will be handled by MethodVisitor in ApexMethodExtractor
    java -cp .:antlr-4.13.2-complete.jar ApexMethodExtractor "$file"
    
    # Increment serial number for next class
    ((serial_number++))
    
    # Add a line break for clarity between different classes
    echo -e "\n"
  fi
done