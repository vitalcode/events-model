package uk.vitalcode.events.model

import uk.vitalcode.events.model.Category.Category
import uk.vitalcode.events.model.PropType.PropType

object PropType extends Enumeration with Serializable {
    type PropType = Value
    val Text, Date, Image = Value
}

case class Prop(name: String, css: String, kind: PropType, values: Vector[String]) extends Serializable

case class PropBuilder() extends Builder {
    private var name: String = _ // TODO rethink, may use Option?
    private var css: String = _
    private var value: String = _
    private var kind: PropType = _

    def setName(name: String): PropBuilder = {
        this.name = name
        this
    }

    def setCss(css: String): PropBuilder = {
        this.css = css
        this
    }

    def setValue(value: String): PropBuilder = {
        this.value = value
        this
    }

    def setValue(category: Category): PropBuilder = {
        this.value = category.toString.toLowerCase
        this
    }

    def setKind(kind: PropType): PropBuilder = {
        this.kind = kind
        this
    }

    override type t = Prop

    override def build(): Prop = new Prop(name, css, kind, if (value == null) Vector.empty[String] else Vector(value))
}