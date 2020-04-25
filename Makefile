CURRENT_DIR = $(shell pwd)

run_server:
	mvn spring-boot:run

run_test:
	mvn test

install:
	mvn clean install

run_docker_server:
	docker run -it --rm -p 8090:8090 --name tancify \
	-v "$(CURRENT_DIR)":/usr/src/mymaven \
	-w /usr/src/mymaven maven:3.6-jdk-8 mvn spring-boot:run