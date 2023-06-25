package com.lessons.designpattern.comportemental.observer;

/**
 * Problème : Supporter une relation "un vers plusiuers" afin que plusieurs objects puissent
 * être notifiés du changement d'état d'un objet et puisse agir.
 *
 * Très utilisé en IHM lorsque plusieurs élémeents de la vue réagissent lorsque le modèle change.
 *
 * il y a deux rôles : sujet et observer
 * Sujet :
 * - le sujet peut changer d'état
 * - il notifie alors les observateurs qu'il a changé
 * - peut donner son nouvel état
 *
 * Observateurs :
 *  - Peuvent s'inscirie / se désinscrire à un sujet
 *  - Sont notifiés
 *  - peuvent obtenir un nouvel état du sujet
 *
 */
public class DPObserverMail {
}
