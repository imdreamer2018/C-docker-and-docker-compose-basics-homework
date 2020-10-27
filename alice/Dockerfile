FROM java:8

#拷贝文件并且重命名
ADD build/libs/alice-0.0.1-SNAPSHOT.jar app.jar
# 指定容器需要映射到主机的端口
EXPOSE 8082

#容器启动时执行的指令
ENTRYPOINT ["java", "-jar", "/app.jar"]