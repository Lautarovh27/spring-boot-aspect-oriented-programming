# Spring Boot Aspect Oriented Programming

Proyecto desarrollado para practicar programación orientada a aspectos (AOP) utilizando Spring Boot y AspectJ.

## 🚀 Tecnologías utilizadas

* Java 17
* Spring Boot
* Spring AOP
* AspectJ
* Maven
* Spring MVC

## 📚 Conceptos aplicados

* Programación Orientada a Aspectos (AOP)
* `@Aspect`
* `@Before`
* Pointcuts con `execution(...)`
* `JoinPoint`
* Logging con SLF4J
* Interceptación de métodos
* Separación de responsabilidades
* Inyección de dependencias

## 📂 Estructura del proyecto

```text
src
├── aop
├── controllers
├── services
└── SpringbootAopApplication
```

## 🎯 Objetivo

Comprender cómo funciona Spring AOP para interceptar métodos y aplicar funcionalidades transversales como logging y monitoreo sin modificar directamente la lógica de negocio.

## ⚙️ Funcionalidades

* Interceptación de métodos mediante aspectos.
* Logging automático antes de ejecutar métodos.
* Obtención dinámica de parámetros utilizando `JoinPoint`.
* Configuración de aspectos con Spring AOP.
* Separación entre lógica de negocio y concerns transversales.

## 🧩 Ejemplo de Aspect

```java
@Before("execution(* com.springboot.app.aop.springboot_aop.services.GreetingService.sayHello(..))")
public void logBeforeGreeting(JoinPoint joinPoint) {

    String method = joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());

    logger.info(
        "Greeting method called with method: {} and args: {}",
        method,
        args
    );
}
```

## 📖 Aprendizajes

Durante este proyecto se trabajó con:

* Spring AOP.
* AspectJ.
* Pointcuts.
* Advice Types (`@Before`).
* Proxies dinámicos de Spring.
* Logging estructurado.
* Interceptación de métodos.
* Arquitectura backend con Spring Boot.

## 👨‍💻 Autor

Lautaro Van Hoorenbeeck

* LinkedIn: https://www.linkedin.com/in/lautaro-van-hoorenbeeck/
* GitHub: https://github.com/Lautarovh27
