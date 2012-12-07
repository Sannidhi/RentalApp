RentalApp
=========

This application aims to connect the landlords in a city to those who are looking to rent an apartment. 

These have to be installed on your machine:
- Git
- Gradle
- MySQL (started up)

Steps to get the application up and running: 

1. git clone the repository. (Note that the default branch is 'version2', not 'master')
2. From the root directory, run the following in sequence:

gradle setupDB
gradle clean build
gradle tomcatRun

3. Go to http://localhost:8080/rentalappv2/listings