package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
/*
1.Эндпоинт с докером есть
docker build -t spring-docker-demo - cбор докер образа
docker build -t spring-docker-demo . - запуск докер образа
docker run -p 8080:8080 spring-docker-demo запуск сервера
сервер работает и доступ к сайту есть когда образ запущен  http://localhost:8080/docker
2.Докер хаб я понял как пользоваться могу загрузит туда что то и скачать что надо мне  /
docker tag spring-docker-demo ваш-логин/spring-docker-demo:1.0
docker push ваш-логин/spring-docker-demo:1.0
3.docker-compose.yml
Управление несколькими контейнерами:
Запускает два контейнера одновременно: ваше Spring Boot приложение и базу данных PostgreSQL.
Позволяет им общаться между собой (например, приложение может подключиться к Postgres через jdbc:postgresql://postgres:5432/your-db).
4.task dockerBuild(type: Exec) {
	dependsOn build
	commandLine 'docker', 'build', '-t', 'spring-docker-demo', '.'
} в build.gradle
Объединяет сборку JAR-файла и Docker-образа в одну команду:
./gradlew dockerBuild # Сначала выполнит `build`, потом `docker build`
Упрощение workflow:
Не нужно вручную запускать ./gradlew build, а затем docker build ....
Полезно для CI/CD (например, в GitHub Actions).
 */