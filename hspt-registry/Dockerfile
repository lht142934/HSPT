FROM java:8
VOLUME /tmp
ADD ./target/registry.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 10000
ENTRYPOINT ["java","-jar","/app.jar"]