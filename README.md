# Capacity
Our web-based application, currently named Capacity, is a tool that will help you save time by giving you the information you wish you had before getting to your destination.

## Repository Structure
Our repository follows the structure of a typical Grails app. The backend of Capacity is found under the Capacity/grails-app folder tree. Here you can find classes for our Grails domains and controllers.

## Installing Programs
                                	GRAILS
To run our application, Grails will have to be downloaded and installed. Below is a link to download the Grails installer:

Download Grails here: https://grails.org/download.html

                           		INSTALLATION ON WINDOWS
        Guide: http://www.tothenew.com/blog/grails-installation-on-windows-machine/
       - Extract Grails files from zip
       - Set Environment Variable GRAILS_HOME to your home grail folder
       - Set Environment Variable JAVA_HOME to your jdk folder
       - Append environment variable PATH with: %GRAILS_HOME%\bin;%JAVA_HOME%\bin;

                            	 INSTALLATION ON LINUX
        Guide: http://docs.grails.org/2.4.x/guide/gettingStarted.html#downloadingAndInstalling
       - Extract Grails files from zip
       - Add something similar to export GRAILS_HOME=/path/to/grails to your profile
       - Add bin directory to PATH variable: export PATH="$PATH:$GRAILS_HOME/bin"

After installing Grails type "grails -version" to confirm that it installed correctly.

                        				NODE & NPM
Node and npm also need to be downloaded to run our program.

Download Node here: https://nodejs.org/en/

After Node downloads, you have to run the .exe to install it. After it has been installed, open up the Node command prompt and type npm to update npm.


## Setting Up Capacity's Development Environment

After installing the above required programs, You will need to clone the repository and install the project dependencies. Download our project, and unzip the folder. Using your command prompt, navigate to where you unzipped Capacity. 

To setup the front-end, you will need to install the front-end dependencies in its directory:

```
cd frontend/
npm install
cd ..
```

This will download the modules needed to compile the frontend.

## Running Capacity in Development Mode

To run Capacity, you will need to simultaneously run two servers, one for the frontend, and another for the backend.

To start the frontend, type the following command in the './frontend/' directory:

```
npm run dev
```

For the backend, navigate to the './Capacity' folder holding the grails files in a seperate terminal.

From here, type:
```
grails run-app
```

A message saying 'running application...' should appear. Shortly after, another message will tell you that the server is initiated. 

Navigate to localhost:8090 on your browser to load the website and start using Capacity!
