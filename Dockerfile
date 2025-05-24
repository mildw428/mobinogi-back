# syntax=docker/dockerfile:1.3
FROM --platform=linux/amd64 openjdk:17

# 1단계: JDK 이미지로 빌드
#FROM openjdk:17-jdk-slim

# 2단계: JAR 파일을 컨테이너 내부로 복사
ARG JAR_FILE=build/libs/mobinogi-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# 3단계: 포트 오픈 (Spring Boot 기본 8080)
EXPOSE 8080

# 4단계: 앱 실행 명령어
ENTRYPOINT ["java", "-jar", "app.jar"]