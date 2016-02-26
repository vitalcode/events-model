package uk.vitalcode.events.model

case class FetchResult(page: Page, childPages: Seq[Page]) extends Serializable
