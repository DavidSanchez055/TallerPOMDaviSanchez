Feature: Realizar la apertura de una nueva cuenta y verificar que esta salga en el resumen de cuenta
  yo como usuario
  voy a crear una cuenta bancaria y después
  verificar que se encuentre guardada en el
  Resumen de cuenta

    Scenario: Registrar cuenta en Parabank
      Given Deseo abrir la pagina de Parabank "https://parabank.parasoft.com/"
      When ingreso el nombre  "David1" y el apellido "Sanchez"
      When ingreso la direccion "Calle 145a #16-27" y la ciudad "Tashbaan" y el estado "Calormen"
      When ingreso el codigo postal "1263541" y el telefono "3247894532" y el SSN "79725421060"
      When ingreso el Username "DavidSan58" y la  contrasena "DavidS4" y confirmo contrasena y envio
      When me dirijo a OpenNewAccount y despues selecciono Savings y creo la cuenta
      Then verifico que exista la cuenta creada
