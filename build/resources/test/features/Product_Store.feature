# language: es
@Utest
Característica: Registrar un nuevo usuario en la página Product Store.

  Como cliente, quiero registrar un nuevo usuario en la página Product Store.

  Antecedentes:
    Dado que david ingresa al aplicativo de ProductStore

  Escenario: Registro exitoso de un nuevo usuario
    Cuando hace clic en el enlace Registrarse
    Y llena el formulario de registro con los siguientes datos
      | nombre   | Contraseña   |
      | <nombre> | <contrasena> |
    Entonces el usuario debería ver un mensaje de confirmación de registro



























