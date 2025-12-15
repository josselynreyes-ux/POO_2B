Centralizar los accesos a la base de datos:
El sistema debe permitir ingresar, mediante un formulario, el valor inicial con el que comenzará el saldo de la cuenta.

Estructura del proyecto
-
forms/

LoginForm.java: pantalla de inicio de sesión.
BancoForm.java: pantalla principal de operaciones bancarias.

db/

DBConnection.java: clase donde está configurada la conexión a MySQL 

base de datos:
-

<img width="608" height="417" alt="image" src="https://github.com/user-attachments/assets/7e51cca6-3b0c-4854-a449-ebab04b4c284" />

--

<img width="633" height="283" alt="image" src="https://github.com/user-attachments/assets/125f1076-a424-401f-ace7-8b9087e0d36f" />

Parte 1: Inicio de Sesión (Login)
-
Validar credenciales predefinidas:

El sistema debe validar las credenciales ingresadas por el usuario comparándolas con los registros almacenados en la base de datos.

Solo cuando el username y la contraseña correspondan a un usuario existente y activo, se permitirá el acceso al sistema.

En caso de que las credenciales no coincidan o el usuario no esté registrado, el sistema debe mostrar un mensaje de error y a los 3 intento erroneos bloquear el acceso.

<img width="415" height="502" alt="image" src="https://github.com/user-attachments/assets/3736b4cd-9ca1-479a-8fb3-1228e4209ab9" />
-
<img width="415" height="523" alt="image" src="https://github.com/user-attachments/assets/79fcff84-b5dc-4515-9c13-9ca2756f0664" />
-
<img width="415" height="459" alt="image" src="https://github.com/user-attachments/assets/2bf4fb46-4c9d-4d22-88a0-f726686e7b9c" />
-
<img width="461" height="444" alt="image" src="https://github.com/user-attachments/assets/a80578a6-912e-4adb-97d7-9fd088486ed0" />
-

LoginForm (Inicio de sesión)
-
Muestra campos para escribir usuario y contraseña.

Cuando se presiona el botón “Ingresar”, revisa si el usuario existe en la base de datos.

Qué datos procesa:
-
Lee txtUsuario (usuario) y txtContra (contraseña).

Consulta la tabla usuarios en MySQL usando un SELECT.

Validaciones:
-

Si el usuario o contraseña están vacíos, muestra un mensaje de error.

Si las credenciales están mal, muestra un mensaje indicando cuántos intentos quedan.

Después de 3 intentos fallidos, bloquea el botón de login.

-
Cómo se conecta con la lógica del sistema:
Usa la clase DBConnection.getConnection() para conectarse a MySQL.
