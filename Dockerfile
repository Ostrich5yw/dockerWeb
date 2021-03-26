# Docker image for springboot file run
# VERSION 0.0.1
# Author: eangulee
# 基础镜像使用java
FROM java:8
# 作者
MAINTAINER 5yw <w1596253661@gmail.com>

# 将jar包添加到容器中并更名为app.jar
ADD dockerweb-0.0.1-SNAPSHOT.jar app.jar
# 运行jar包
ENTRYPOINT ["java","-jar","/app.jar"]