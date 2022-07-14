FROM openjdk:8

WORKDIR /usr/app
EXPOSE 8080

ENTRYPOINT [ "./run.sh" ]