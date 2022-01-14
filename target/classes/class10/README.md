# 工程简介

多环境下：
    1. 本地开发环境
    2. 测试环境
    3. 准生产/生产环境
配置文件自由切换


## 方法步骤
1. 新建不同环境下的配置文件，注意要以固定格式`application-`开头
   ![](https://gitee.com/leekinghou/image/raw/master/img/20220110221139.png)
2. 修改配置文件内的参数
    - dev：
    ```
    server.port=8080
    server.servlet.context-path=/dev
    ```

    - product：
    ```
   server.port=80
   server.servlet.context-path=/product
    ```
3. 在主配置文件`application.properties`指定使用哪个版本的配置文件
    ```
    # 激活使用配置文件
    spring.profiles.active=dev
    ```

