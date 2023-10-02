## Quels sont les 3 A d’un test unitaire ?
Les trois A d'un test unitaire sont les principes fondamentaux que les tests unitaires devraient respecter. Ils 
sont également connus sous le nom de "AAA" ou "Arrange, Act, Assert". Ces principes aident à structurer et à 
organiser la manière dont vous écrivez des tests unitaires.

- Arrange (Mise en place) : Dans cette première étape, vous préparez l'environnement de test en configurant 
tous les prérequis nécessaires. Cela peut inclure la création d'objets, l'initialisation de variables, 
la configuration de l'état initial, et tout ce qui est nécessaire pour que le code que vous voulez tester
puisse s'exécuter correctement.

- Act (Action) : Dans cette étape, vous exécutez l'action ou le comportement que vous souhaitez tester. Cela
implique d'appeler la méthode ou la fonction que vous testez avec les valeurs ou les paramètres appropriés.

Assert (Assertion) : Dans cette dernière étape, vous vérifiez que le résultat de l'action correspond à ce que
vous attendiez. Vous utilisez des assertions pour valider que le comportement de la méthode ou de la fonction testée est correct. Si le résultat ne correspond pas à vos attentes, le test échoue.

Voici un exemple de structure de test unitaire en utilisant les trois A :


```java
public class CalculatorTest {
    @Test
    public void testAddition() {
        // Arrange (Mise en place)
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        // Act (Action)
        int result = calculator.add(a, b);
        // Assert (Assertion)
        assertEquals(8, result); // Vérifie que la somme est égale à 8
    }
}
```  

Dans cet exemple, la mise en place crée une instance de la classe Calculator et initialise les valeurs a et b. 
L'action appelle la méthode add de l'objet calculator, et l'assertion vérifie que le résultat de l'addition
est égal à 8. Si le résultat était différent de 8, le test échouerait.


## JUnit 5
JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage.    
JUnit Vintage provides a TestEngine for running JUnit 3 and JUnit 4 based tests on 
the platform

