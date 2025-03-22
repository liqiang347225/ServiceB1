# 使用官方JDK 17镜像作为基础镜像
FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 将jar包添加到容器中并更名为app.jar
COPY target/ServiceB.jar appb.jar

# 暴露端口（如果你的Spring Boot应用使用的是非8080端口，请相应修改）
EXPOSE 8088

# 运行jar包
ENTRYPOINT ["java", "-jar", "/app/appb.jar"]