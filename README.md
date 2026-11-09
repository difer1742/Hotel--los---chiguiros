# Hotel--los---chiguiros

Sistema web de gestión hotelera orientado a la administración de reservas, huéspedes, habitaciones y personal del Hotel Los Chigüiros, ubicado en la Vereda Pompeya, Villavicencio - Meta.

El proyecto busca mejorar los procesos administrativos internos del hotel y ofrecer una plataforma digital moderna para sus clientes, permitiendo gestionar información de reservas, empleados, habitaciones y usuarios mediante una aplicación web construida en Java.

🚀 Tecnologías Utilizadas
Java JDK 21
Jakarta EE 10
JSP (Java Server Pages)
Servlets
Apache NetBeans 25
Eclipse GlassFish 7.1.1
MySQL 8
Maven
HTML5
CSS3
JavaScript
JDBC
📋 Requisitos del Sistema
Java JDK 21 o superior
Apache NetBeans 25
Eclipse GlassFish 7
MySQL Server 8
MySQL Workbench
Maven
⚙️ Instalación del Proyecto
1. Clonar el repositorio
git clone https://github.com/difer1742/Hotel--los---chiguiros.git
Entrar al proyecto:

cd Hotel--los---chiguiros
2. Abrir en NetBeans
Abrir Apache NetBeans.
Seleccionar:
File → Open Project
Buscar la carpeta:
hotel_los_chiguiros
3. Configurar GlassFish
Agregar servidor:

Services
└── Servers
    └── Add Server
Seleccionar:

GlassFish Server 7
4. Crear Base de Datos
CREATE DATABASE hotel_chiguiros;
Seleccionar:

USE hotel_chiguiros;
🗄️ Modelo de Datos
Actualmente el sistema cuenta con las siguientes entidades:

Roles
Permite gestionar permisos para:

Administrador
Recepcionista
Empleado
Usuarios
Controla el acceso al sistema.

Campos principales:

id_usuario
usuario
password
id_rol
id_empleado
estado
Empleados
Información laboral del personal del hotel.

Clientes
Información de huéspedes y visitantes.

Habitaciones
Control de disponibilidad, precios y tipos de habitación.

Reservas
Registro de hospedajes y asignación de habitaciones.

🎯 Funcionalidades Implementadas
✅ Login Visual
Desarrollado con:

HTML5
CSS3
Características:

Validación HTML
Campos requeridos
Diseño responsive
✅ Conexión a Base de Datos
Implementada mediante:

DriverManager.getConnection()
Características:

JDBC
Conexión a MySQL
Manejo de excepciones
Validación de conexión
✅ Arquitectura MVC
Estructura actual:

com.hotel_los_chiguiros

├── config
├── controller
├── dao
└── model
✅ Modelo Usuario
Clase:

Usuario.java
Responsable de representar los usuarios del sistema.

✅ UsuarioDAO
Clase:

UsuarioDAO.java
Permite:

Consultar usuarios
Validar credenciales
Acceso seguro a la base de datos
✅ LoginServlet
Clase:

LoginServlet.java
Responsable de:

Recibir credenciales
Consultar usuarios
Validar acceso
Redireccionar al Dashboard
✅ Dashboard Administrativo
Acceso exitoso después del Login.

Página actual:

dashboard.html
📁 Estructura Actual del Proyecto
hotel_los_chiguiros

├── src
│
├── main
│   │
│   ├── java
│   │
│   │   └── com.hotel_los_chiguiros
│   │       │
│   │       ├── config
│   │       ├── controller
│   │       ├── dao
│   │       └── model
│   │
│   └── webapp
│       │
│       ├── admin
│       ├── cliente
│       ├── css
│       ├── empleados
│       ├── habitaciones
│       ├── img
│       ├── js
│       ├── layouts
│       ├── login
│       ├── reservas
│       │
│       ├── dashboard.html
│       └── index.html
│
└── pom.xml
🔒 Seguridad Implementada
Validación de formularios HTML
Prepared Statements
Prevención básica de SQL Injection
Manejo de excepciones
Arquitectura MVC
Separación de responsabilidades por capas
🚧 Roadmap del Proyecto
✅ Módulo 1
Login
Dashboard Administrativo
🔲 Módulo 2 - Gestión de Habitaciones
Registrar habitaciones
Editar habitaciones
Consultar habitaciones
Eliminar habitaciones
🔲 Módulo 3 - Gestión de Clientes
Registrar clientes
Actualizar información
Consultar historial
🔲 Módulo 4 - Gestión de Reservas
Crear reservas
Modificar reservas
Cancelar reservas
Consultar disponibilidad
🔲 Módulo 5 - Gestión de Empleados
Registrar empleados
Gestión de usuarios
Roles y permisos
🔲 Módulo 6 - Gestión de Turnos
Programación de horarios
Malla de turnos
Calendario laboral
🔲 Módulo 7 - Nómina
Liquidación salarial
Horas extras
Descuentos
Reportes
🌐 Repositorio
GitHub:

https://github.com/difer1742/Hotel--los---chiguiros

👨‍💻 Autor
Diego Fernando Cardozo Polania

GitHub: https://github.com/difer1742

Proyecto desarrollado para la digitalización y gestión administrativa del Hotel Los Chigüiros, ubicado en la Vereda Pompeya, Villavicencio (Meta), Colombia.

📌 Estado Actual
✅ Proyecto configurado

✅ GlassFish funcionando

✅ Base de datos MySQL conectada

✅ Arquitectura MVC implementada

✅ Login funcional conectado a MySQL

✅ Dashboard operativo

✅ Repositorio GitHub publicado

🚀 Próximo desarrollo: CRUD completo de Habitaciones.
