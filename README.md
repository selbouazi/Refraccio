# Refraccio
En aquesta pràctica s'ha aplicat tècniques de refacció, d’anàlisi estàtica i de documentació sobre un projecte Java ja creat. 
L’objectiu va ser millorar la qualitat del codi i aprengues a utilitzar eines professionals com PMD i JavaDoc.
Es treballará sobre un sistema senzill per gestionar moviments bancaris. Permet ingresar diners, retirar diners i finalitzar les operacions bancàries.


## Estructura del projecte

- **src/** → Codi font Java  
  - practicaunidad4  
    - BankApp.java  
    - CCuenta.java
    - pmd-rules.xml

- **doc/** → Javadoc generat  

- **README.md** → Aquest fitxer

## Execució

1. Obre el projecte amb Eclipse o un IDE Java.
2. Executa el mètode `main()` dins de la classe `BankApp`.
3. Es mostraran per consola les operacions d’ingresar, retirar i finalitzar les operacions bancaries.

## Documentació

- **Javadoc** (`doc/`):  
  Generat automàticament a partir dels comentaris del codi font.

  ## PMD
  
S'ha afegit un ruleset (`pmd-ruleset.xml`) amb tres regles:  
- **UnusedPrivateField** → elimina camps privats no usats  
- **AvoidDuplicateLiterals** → evita literals repetits  
- **CyclomaticComplexity** → controla la complexitat dels mètodes  
