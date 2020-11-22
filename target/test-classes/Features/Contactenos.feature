Feature: Validar funcionamiento de las seciones contactenos de las paginas web  
https://www.choucairtesting.com/.

Scenario: Solicitar informacion de Choucair
  Given Acceder a la pagina principal de choucair
  When Acceder a la seccion contactenos
  And Diligenciar el formulario
  And Enviar la solicitud con todos los datos reuqeridos
  Then Validar mensaje del envio la informacion


    
