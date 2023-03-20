# Dockerization_of_Selenium_test_within_a_container_using_Selenium_Grid

# Introduction
 This template will help you to implement how to run and test their automated Selenium web tests through a Docker container. It is a modern load testing tool,You can use k6 to evaluate your systems’ reliability and performance, catching performance regressions and problems earlier. To make performance testing more efficient, we may utilize metrics, which replicate and display what metrics track and how well a system works in real-world scenarios.
# What is the docker, and why do we need to run the test with docker container?
This is a basic question that almost everyone has, such as why we need and utilize them, therefore let's just define it in one sentence " Docker is a software platform that allows you to build, test, and deploy applications quickly. Docker packages software into standardized units called containers that have everything the software needs to run including libraries, system tools, code, and runtime".
#  In other words
 Tracks how well a system works in real-world scenarios. 

# Technologies Used
> Programming language - Java

> Automation tool - Selenium,testNg,and cucumber

> IDE - Intellij 
# Libraries Used
# cucumber
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
# testng    
    import org.testng.Assert;   
# selenium    
    import org.openqa.selenium.support.ui.WebDriverWait;
    import org.openqa.selenium.chrome.ChromeOptions;
    import org.openqa.selenium.remote.RemoteWebDriver;
    import org.openqa.selenium.support.ui.WebDriverWait;
1. Go to the website https://docs.docker.com/docker-for-windows/install/ and download the docker file.

Note: A 64-bit processor and 4GB system RAM are the hardware prerequisites required to successfully run Docker on Windows 10.

2. Then, double-click on the Docker Desktop Installer.exe to run the installer.
# Steps for execution
Clone the repository on your local system. Intellij will resolve all the required dependencies and then Download Docker.
# Install Docker
# Mac
1. Download the latest version of Docker Desktop from Docker's site https://docs.docker.com/desktop/install/mac-install/
or we also use cmd based command
    sudo hdiutil attach Docker.dmg
    sudo /Volumes/Docker/Docker.app/Contents/MacOS/install
    sudo hdiutil detach /Volumes/Docker

# Windows
1.  Go to the website https://docs.docker.com/docker-for-windows/install/ and download the docker file.
2. Then, double-click on the Docker Desktop Installer.exe to run the installer.

# Linux
     sudo apt update
     sudo apt install docker.io -y
     sudo snap install docker
     sudo systemctl status docker
For Debian-based Linux distributions like Ubuntu, you can install Docker like this:     
    
# Installing Docker Compose
    sudo curl -L https://github.com/docker/compose/releases/download/1.29.2/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose
    sudo chmod +x /usr/local/bin/docker-compose
    docker-compose --version
# Run the docker compose file and run the selenium test with maven command like this:
    docker-compose up -d
    mvn -Dtest=cucumberOptions.TestRunner  test

  First command will start the docker compose file and create the testcontainer and once docker conatiner created then we will run the second command to execute the test
it simply execute test on your machine.

you can change the code and target website as per your needs.

For a better understanding please refer to this blog:- [click here]
