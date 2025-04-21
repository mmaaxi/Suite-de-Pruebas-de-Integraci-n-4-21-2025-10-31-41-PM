Feature: Validar Estrategia
  Como usuario de la plataforma
  Quiero ejecutar un análisis de estrategia
  Para validar la estrategia correctamente

  Scenario: Validación de estrategia
    Given el usuario está en la página de análisis de estrategia
    When ejecuta el análisis de estrategia
    Then la estrategia se valida correctamente