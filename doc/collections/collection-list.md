# ArrayList vs. LinkedList
- **ArrayList** est implémentée comme un tableau ordinaire
- **LinkedList** est implémentée sous forme de liste d'éléments interconnectés : un ensemble d'éléments distincts, dont chacun stocke
des références aux éléments suivant et précédent dans la liste.

|Description|	Opération|	ArrayList|	LinkedList|   
| :--------------- |:---------------:| -----:|  -----:| 
|Obtenir un élément|	get	|Rapide|	Lent
|Définir un élément|	set|	Rapide	|Lent|
|Ajouter un élément (à la fin de la liste)|	add	|Rapide	|Rapide|
|Insérer un élément (à une position arbitraire)	add(i, valeur)	|Lent	|Rapide|
|Supprimer un élément	|remove	|Lent	|Rapide|  

RG pour chosiir : si tu comptes insérer (ou supprimer) fréquemment des éléments au milieu de la collection, il est 
préférable d'utiliser une LinkedList. Dans tous les autres cas, ArrayList fonctionnera mieux. »   