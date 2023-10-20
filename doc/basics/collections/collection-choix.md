# Performance Collections : mémoire et complexité 

## List 

### indexOf vs contains  
`contains`: The contains method in a LinkedList is also O(n) in the worst case because it uses `indexOf` internally.

### ArrayList vs. LinkedList
- **ArrayList** est implémentée comme un tableau ordinaire
- **LinkedList** est implémentée sous forme de liste d'éléments interconnectés : un ensemble d'éléments distincts, dont chacun stocke
  des références aux éléments suivant et précédent dans la liste.
- `indexOf` : The indexOf method in an ArrayList is generally faster than in a LinkedList.
  It has O(n) time complexity in the worst case because it may need to iterate through the entire list to find the 
  element, where n is the size of the list.  
- `contains`: The contains method in an ArrayList also has O(n) time complexity because it internally uses indexOf to check if the element is present.


|Description|	Opération|	ArrayList|	LinkedList|   
| :--------------- |:---------------:| -----:|  -----:| 
|Obtenir un élément|	get	|Rapide|	Lent
|Définir un élément|	set|	Rapide	|Lent|
|Ajouter un élément (à la fin de la liste)|	add	|Rapide	|Rapide|
|Insérer un élément (à une position arbitraire)	add(i, valeur)	|Lent	|Rapide|
|Supprimer un élément	|remove	|Lent	|Rapide|  

RG pour chosiir : si tu comptes insérer (ou supprimer) fréquemment des éléments au milieu de la collection, il est
préférable d'utiliser une LinkedList. Dans tous les autres cas, ArrayList fonctionnera mieux. »   