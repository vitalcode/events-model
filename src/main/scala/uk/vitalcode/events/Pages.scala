package uk.vitalcode.events

import uk.vitalcode.events.cambridge.{CambridgeScienceCentre, Junction, VisitCambridge}
import uk.vitalcode.events.model.Page

object Pages {
    val all: Set[Page] = Set(
        CambridgeScienceCentre.page,
        Junction.page,
        VisitCambridge.page
    )
}
