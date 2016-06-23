package uk.vitalcode.events

import uk.vitalcode.events.cambridge.CambridgeScienceCentre
import uk.vitalcode.events.model.Page

object Pages {
    val all: Set[Page] = Set(CambridgeScienceCentre.page)
}
