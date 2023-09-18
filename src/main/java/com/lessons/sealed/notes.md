# Une classe scellée :
on va pouvoir contrôler qui il va en dériver.   
Dans les chapitres précédents, nous avons vu qu'il est possible d'étendre, par héritage, une classe existante pour
enrichir son comportement. Mais dans certaines situations et pour des raisons diverses (performances...), on ne souhaite
 pas permettre n'importe quoi en termes d'héritage. Nous avons vu qu'il était possible
d'interdire l'héritage d'une classe grâce au mot clé final et ce depuis la première version de Java.
Depuis le Java SE 17, il est maintenant possible de restreindre les possibilités d'héritage, sans complétement les
interdire : pour ce faire, on peut définir des
« classes scellées ». Une classe scellée indique quels sont les types de données autorisés à dériver de cette classe.

# Def :
Pour définir une classe scellée, on utilise le mot clé contextuel sealed. On complète la définition via le mot clé
 contextuel permits pour indiquer quels sont les types autorisés à dériver de la classe scellée.