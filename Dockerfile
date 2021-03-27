FROM maven:3.5.3-jdk-8

WORKDIR /usr/local/app
COPY pom.xml .
RUN ["mvn", "verify", "clean", "--fail-never"]
COPY . .
COPY browsermob.js .
COPY testng.xml .

RUN mvn package
EXPOSE 9191

ENV CLOUD_TESTING_USERNAME <Ryanjsanders>
ENV CLOUD_TESTING_KEY <95ab9afb-bcab-4477-a421-128bf5b984ff>
CMD java -cp target/dockertest-jar-with-dependencies.jar org.testng.TestNG testng.xml
