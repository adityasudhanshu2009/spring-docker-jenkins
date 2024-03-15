FROM openjdk:17

ADD /target/rakuten-spring-docker-jenkins.jar app.jar

ENTRYPOINT [ "java", "-jar" ,"app.jar" ]

EXPOSE 8656