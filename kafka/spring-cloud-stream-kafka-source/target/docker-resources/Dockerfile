FROM java:8-jre
MAINTAINER Mradul Pandey <pandeymradul@gmail.com>

ADD ./spring-cloud-stream-kafka-source-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/spring-cloud-stream-kafka-source-0.0.1-SNAPSHOT.jar"]

EXPOSE 8012