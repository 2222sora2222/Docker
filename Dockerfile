# Используем официальный образ OpenJDK 17
FROM openjdk:17-jdk-slim

# Рабочая директория в контейнере
WORKDIR /app

# Копируем собранный JAR в контейнер
COPY build/libs/*.jar app.jar

# Открываем порт 8080
EXPOSE 8080

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "app.jar"]