## C'est quoi GIT ?
Est un système de gestion de code source. Un SCM : Source Control Management  

## Commit message command 
git commit -a 
   - L'option -a : permet  d'ajouter toutes les modifications des fichiers suivis et de les valider.
On peut utliser : git add <file> pour ajouter les nouveaux fichiers dans l'index 
Dans l'ordre :  
   - git add file1 file2
   - git commit -a

## Quelles sont les différences entre Subversion (SVN) et Git ?
SVN est configuré pour supposer que l’historique d’un projet ne change jamais. Git vous permet de modifier des 
validations et modifications antérieures à l’aide d’outils tels que git rebase.
- Subversion est un système de gestion de source centralisé: il faut un serveur pour créer des branches, archiver du 
  code. Et tout passe par ce serveur.
- Git est un système décentralisé: on peut travailler en local, sans serveur (y compris la création de branche et
  l’archivage) ou même avec plusieurs serveur simultanément.

## git push 
Permet de mettre à jour les branches distantes (remote refs) 

## git stash 
Exemple : l’équipe demande une assistance afin de corriger un bug dans la branche B alors que l’on travaille sur 
certains fichiers de la branche A. Alors là, on est obligé de sortir de cette dernière pour corriger le bug. C’est
lors de ce genre de situation que l’on trouve l’utilité de la commande git stash. 

## git branch 
- git branch --merged : Lister les branches déjà mergé dans la branche currente 
- git branch --no-merged : Lister les branches déjà mergé dans la branche currente 

## git clone 
Cree une compie d'une branche existente dans la repository git 

## git config : 
Permet de spécifier les paramètres de configuration de Git 
Exemples : 
 -  git config --global user.name "John Doe"
 
## git init 
Pour créer  une repository  : 
- Creér lae dossier du projet 
- Exécuter la commande : git init 

## git status 
Displays paths that have differences between the index file and the current HEAD commi


##Quelle commande pour annuler un commit sans l'effacer de l'historique de git ?
La commande revert est plus sûre que reset, car elle ne supprime pas de commits dans un historique partagé. Elle conserve les commits que vous souhaitez annuler et crée un nouveau commit qui inverse le commit indésirable.
















