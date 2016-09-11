#!/bin/bash

echo "---------------------"
echo "installing dependencies to local maven repository"
echo "---------------------"

cd appointments
./gradlew install

cd ..
cd project-management-platform
./gradlew install

echo "---------------------"
echo "install complete. Dependencies can be used from the application"
echo "---------------------"
