# Définition 
Tous les deux map() et flatMap() prend une fonction de mappage, qui est appliquée à chaque élément d'un Stream<T>, et 
renvoie un Stream<R>. La seule différence est que la méthode de mappage dans le cas de flatMap() produit un flux de 
nouvelles valeurs, alors que pour map(), il produit une valeur unique pour chaque élément d'entrée