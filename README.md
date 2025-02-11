# 抖音电商：字节青训营项目

# 🌟 简介

这是一个基于 Spring Boot 的综合性电商平台，采用微服务架构。该项目为构建可扩展的在线购物应用程序提供了强大的基础，整合了行业标准实践和现代技术。



## 🛠️ 技术栈

<div align="center">
  <table>
    <tr>
      <td align="center" width="96">
        <img src="https://cdn.simpleicons.org/spring/6DB33F" width="48" height="48" alt="Spring" />
        <br>Spring Boot
      </td>
      <td align="center" width="96">
        <img src="https://cdn.simpleicons.org/mysql/4479A1" width="48" height="48" alt="MySQL" />
        <br>MySQL
      </td>
      <td align="center" width="96">
        <img src="https://cdn.simpleicons.org/redis/DC382D" width="48" height="48" alt="Redis" />
        <br>Redis
      </td>
      <td align="center" width="96">
        <img src="https://cdn.simpleicons.org/rabbitmq/FF6600" width="48" height="48" alt="RabbitMQ" />
        <br>RabbitMQ
      </td>
      <td align="center" width="96">
        <img src="https://cdn.simpleicons.org/apachemaven/C71A36" width="48" height="48" alt="Maven" />
        <br>Maven
      </td>
    </tr>
  </table>
</div>

## 

## 🔧 环境要求

> [!IMPORTANT]
> 开始之前，请确保已安装以下软件：
>
> - JDK 21
> - Maven 3.6+
> - MySQL 8.0
> - IntelliJ IDEA (推荐)
> - Git



## 🚀 项目创建

- #### 核心依赖

  - Spring Web
  - Spring Boot DevTools
  - Lombok
  - Spring Configuration Processor

  #### 数据访问

  - Spring Data JPA
  - MySQL Driver
  - Spring Data Redis
  - MyBatis Framework
  - Mybatis Plus

  #### 消息

  - Spring for RabbitMQ

  #### 云服务依赖

  - Eureka Discovery Client
  - Config Client
  - Gateway
  - Resilience4j
  - Nacos

  #### 其他

  - Spring Boot Actuator
  - Validation
  - Java Mail Sender
  - Quartz Scheduler
    </details>

* #### 配置(以Auth为例)

```yaml
server:
  port: 8080

spring:
  application:
    name: auth-service
  datasource:
    url: jdbc:mysql://localhost:3306/auth_db
    username: your_username
    password: your_password
    driver-class-name: com.mysql.cj.jdbc.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
  cloud:
    nacos:
      discovery:
        server-addr: localhost:8848
  rabbitmq:
    host: localhost
    port: 5672
    username: your_rabbitmq_username
    password: your_rabbitmq_password
  data:
    redis:
      port: 6379
      host: localhost
      password: your_redis_password
      lettuce:
        pool:
          max-active: 10
          max-idle: 10
          min-idle: 1
          time-between-eviction-runs: 10s

logging:
  level:
    root: INFO
    com.yourpackage: DEBUG

mybatis-plus:
    type-aliases-package: com.yourpackage.entity
```

* #### 数据库设置

  * **一个微服务一个数据库**