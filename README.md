# Interactive Tabletop RPG Builder Server
A Java Spring Boot backend that runs the IT RPG platform.

## Motivation

In the past, I used to role-play on text-based platforms such as 
[PBeM](https://en.wikipedia.org/wiki/Play-by-mail_game), IRC, Forum, and also on
[MUDs](https://en.wikipedia.org/wiki/MUD) and [MUSHs](https://en.wikipedia.org/wiki/MUSH). Many of
these games were based on the Nova platform, an RPG management system. Nova has no alternatives.

Today, that changes. Interative Tabletop aims to provide a variety of options for building an RPG 
game. The style I seek is a cross between a MUSH/MUD and PBeM.

### Features (of the server)

- Retrieve, cache, and store user input and actions.
- Determine the outcome of events.
- Authorize user actions.

## Requirements

All of these can be installed with `apt` if on Linux.

JDK: openjdk-18-jdk\ 
JRE: openjdk-18-jre \
Optional: Maven (`$ sudo apt install maven` on Ubuntu). This gives you access to the mvn cli 
commands.\
Recommended: Docker - If for some reason you don't want/can't install Java, all you really need 
is [Docker](https://docs.docker.com/engine/).

Docker Linux for amd64 systems:

If you get an error for i386 not being available, you can get rid of it by adding [arch=amd64] 
after the deb keyword in the docker source file.

## Building on linux

Compiling: `$ ./mvnw compile`

This will skip packaging in a jar file, which isn't needed if you don't intend to distribute to 
other systems, which is prohibited by the license anyway.

Building: `$ ./mvnw clean package`

Newrelic is used as an APM (logging), and Maven will need to unzip its Java agent (to the target 
dir).
If this fails, you may need to use sudo

### Building with Docker

Building: `$ sudo ./mvnw spring-boot:build-image -Dspring-boot.build-image.
imageName=<user>/interactive-tabletop`

You will need to run with sudo, or it will fail. It will not work with rootless. If you require 
the use of rootless Docker, then you'll need to set up a 
[Dockerfile](https://spring.io/guides/topicals/spring-boot-docker/) and use the regular Docker build
command, or another build plugin that will let you use rootless. The guide for current Spring Boot
Dockerfile is about 25% down under Spring Boot Layer Index

Maven Spring has an internal Dockerfile, so you don't need one. This will tag the build, but you 
don't need a Docker username. Replace <user> with a moniker of your choice (or your Docker user 
if you have a hub already). If you create a Docker Hub account, then it should be the same name 
you used for the tag.

## Running

If you want to use profiles, then you should set this before running:\
`$ export SPRING_PROFILES_ACTIVE=dev|test|prod`

Build and run: `$ ./mvnw spring-boot:run`

Run the jar: `$ java -jar target/*.jar`

Running with Docker (after building): `$ sudo docker run -p 8080:8080 -t 
<user>/interactive-tabletop`

## Contributing

Simply fork, and create a pull request.
