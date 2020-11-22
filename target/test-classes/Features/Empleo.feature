Feature: Validar funcionamiento de las seciones empleo de las paginas web  
https://www.choucairtesting.com/.


Scenario: Buscar oferta de empleo
  Given Acceder a al link de la pagina de choucair
  When Acceder a la seccion empleo
  And filtar ofertas disponibles
  And selecionar un empleo
  Then Validar empleo solicitad

    
