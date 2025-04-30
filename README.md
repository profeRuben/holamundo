# Proyecto: API REST "¡Hola Mundo!" con Spring Boot

Este proyecto es una API REST mínima desarrollada con **Spring Boot**, utilizando Maven como sistema de construcción. Expone un endpoint en `/hola` que devuelve un mensaje simple: `"¡Hola Mundo!"`.

---

## 🚀 Requisitos

- Java 17
- Maven (o usar el Maven Wrapper incluido)
- IDE recomendado: IntelliJ IDEA o Visual Studio Code

---

## ⚙️ Estructura del proyecto

```
src
└── main
    └── java
        └── com
            └── holamundo
                └── holamundo
                    ├── HolamundoApplication.java
                    └── controller
                        └── HolaMundoController.java
```

---

## ▶️ Cómo ejecutar

Desde la raíz del proyecto, ejecuta:

```bash
./mvnw spring-boot:run
```

Esto compilará y levantará el servidor en `http://localhost:8080`.

Prueba el endpoint accediendo a:

```
http://localhost:8080/hola
```

---

## 🧠 ¿Qué hace?

Este proyecto define una clase `HolaMundoController` con un método que responde a la ruta `/hola` usando `@GetMapping`.

```java
@RestController
public class HolaMundoController {
    @GetMapping("/hola")
    public String holaMundo() {
        return "¡Hola Mundo!";
    }
}
```

---

## ❗ Errores comunes a evitar

1. **Paquetes incorrectos**: Asegúrate de que el controlador esté en un subpaquete de `com.holamundo.holamundo` para que sea detectado por el escaneo de componentes.
   
2. **Puerto ocupado**: Si el puerto 8080 ya está en uso, puedes cambiarlo en `application.properties`:
   ```properties
   server.port=8081
   ```

3. **Olvidar anotaciones**: Las anotaciones `@RestController` y `@GetMapping` son esenciales para que funcione el controlador REST.

4. **Problemas de Java version**: Si encuentras errores relacionados con la versión de Java, verifica que estés usando Java 17 como se especifica en el `pom.xml`.

---

> Collecting workspace information  
> **Guía paso a paso para crear una API REST "¡Hola Mundo!" en Spring Boot**

¡Con estos pasos, deberías tener un "¡Hola Mundo!" funcionando correctamente en Spring Boot!
