#AUTOR: JUAN E. DAZA

@stories
  Feature: Aademy Choucair
    As a user, I want to learn how to aoutomate in creenplay at the choucair academy with the automation course

    @scenario1
    Scenario Outline: Search for automation course
      Given than Brandon wants to learn automation at the choucair academy
        |strUser  |strPassword  |
        |<strUser>|<strPassword>|
      When he search for the course on the choucair academy platform
        |strCourse  |
        |<strCourse>|
      Then he finds the course called resources
        |strCourse  |
        |<strCourse>|


      Examples:
        |strUser   |strPassword  |strCourse                 |
        |1000366000|Choucair2021*|Patrones de Automatización|