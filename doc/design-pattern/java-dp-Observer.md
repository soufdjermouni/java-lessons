# 1. Observer / Observateur
Il est utilisé pour envoyer un signal à des modules qui jouent le rôle d'observateurs. En cas de notification, les observateurs effectuent alors l'action adéquate en fonction des informations qui parviennent depuis les modules qu'ils observent (les observables).

## Problème 
  Supporter une relation "un vers plusiuers" afin que plusieurs objects puissent 
  Etre notifiés du changement d'état d'un objet et puisse agir.
  Très utilisé en IHM lorsque plusieurs élémeents de la vue réagissent lorsque le modèle change.
## Rôles
il y a deux rôles : sujet et observer
 ### Sujet 
- le sujet peut changer d'état 
- il notifie alors les observateurs qu'il a changé
- peut donner son nouvel état
  
### Observateurs 
- Peuvent s'inscirie / se désinscrire à un sujet
- Sont notifiés
- peuvent obtenir un nouvel état du sujet

## Implémentation : en tout il y aura 04 classes 
- Le sujet abstrait    
   - Gère les observeurs (addObserver, ...)
   - il notifie (notify)
- Le sujet concret 
   - Peut changer d'état (appel notify)
   - Peut donner son nouvel état (getEtat)
- Les observeurs abstrait 
   - sont notifiés (update) 
- Les observeurs concrets 
   - peuvent obtenir le nouvel état du sujet 

## Implémentation en JAVA :  
- Le sujet abstrait  => Classe java.util.Obserbable 
  - addObserver(Observer obs)
  - notifyObservers()
- Le sujet concret => Votre classe qui hérite de Observable 
  - Peut changer d'état => appel appel notifyObservers() 
  - Peut donner son nouvel état => getEtat()
- Les Oobserveurs   => interface java.util.Observer 
  - update(Observable obs, Object args)  
- Les observeurs concret => Votre classe qui réalise Observer 
  - Doit implémenter update  => Appel getEtat 
