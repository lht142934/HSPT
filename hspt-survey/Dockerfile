FROM java:8
VOLUME /tmp
ADD ./target/survey.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8091
ENTRYPOINT ["java","-jar","/app.jar"]