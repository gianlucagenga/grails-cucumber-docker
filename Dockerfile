FROM mondora/grails:2.4.4
RUN mkdir /grails-cucumber-docker
ADD ./ /grails-cucumber-docker/
RUN mkdir -p /root/.grails
WORKDIR /grails-cucumber-docker
RUN grails refresh-dependencies
RUN grails test-app
EXPOSE 8080
ENTRYPOINT ["./start.sh"]
