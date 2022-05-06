# dockerWeb
这是一个测试docker容器的web程序，他同时需要docker中创建redis，mysql，MongoDB数据库。每一次访问下图中的页面，都会对三个数据库的指定元素+1，并实时刷新在页面中。

**程序打包后，将jar程序、DockerCompose.yml、Dockerfile放入配置有docker的Linux环境中，使用dockercompose完成容器构建**

你可以访问我的博客查看具体的配置过程：https://blog.csdn.net/qq_42606136/article/details/115255130

![image](https://user-images.githubusercontent.com/72113963/167095037-ecf2a391-8a00-4560-a84f-48f2b47d8e18.png)
