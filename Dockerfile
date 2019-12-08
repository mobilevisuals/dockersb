# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.
FROM java:8-jdk-alpine

COPY ./target/basic-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch basic-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","basic-0.0.1-SNAPSHOT.jar"]