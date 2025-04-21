Feature: Validar creación de repositorio GitHub

  Scenario: Crear un nuevo repositorio en GitHub
    Given el usuario está autenticado en GitHub
    When el usuario crea un nuevo repositorio con nombre "AutomatedTestRepo"
    Then el nuevo repositorio "AutomatedTestRepo" se crea exitosamente