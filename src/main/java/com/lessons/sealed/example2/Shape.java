package com.lessons.sealed.example2;

import com.lessons.record.Point;

/**
 * Dans cet exemple, on part du principe qu'on ne désire pas autoriser la présence d'autres classes de figures
 * géométriques. Seuls des cercles et des carrés seront autorisés.
 * Voici comment définir les classes Circle et Square.
 */
public sealed class Shape permits Circle, Square {
    private Point center;
    // Imaginez d'autres attributs et méthodes.

}
