package uk.vitalcode.events

import uk.vitalcode.events.cambridge._
import uk.vitalcode.events.model.Page

object Pages {
    val all: Set[Page] = Set(
        CambridgeScienceCentre.page,
        Junction.page,
        VisitCambridge.page,
        AdcTheater.page,
        WestRoad.page
    )
}
