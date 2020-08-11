FROM java:8
EXPOSE 8080
VOLUME /slm
ADD demo-docker-simple-0.0.1-SNAPSHOT.jar demo-docker-simple.jar
RUN sh -c 'touch /demo-docker-simple.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /demo-docker-simple.jar" ]