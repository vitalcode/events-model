package uk.vitalcode.events.model

trait Builder extends Serializable {
    type t

    def build(): t
}
