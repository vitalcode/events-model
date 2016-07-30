package uk.vitalcode.events.model

object Category extends Enumeration {
    type Category = Value
    val CINEMA = Value(0)
    val FAMILY = Value(1)
    val FUNDRAISING = Value(2)
    val MUSEUM = Value(3)
    val MUSIC = Value(4)
    val NIGHTLIFE = Value(5)
    val OUTDOORS = Value(6)
    val SPORT = Value(7)
    val WILDLIFE = Value(8)
    val WORKSHOP = Value(9)
}
