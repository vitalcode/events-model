package uk.vitalcode.events.cambridge

import uk.vitalcode.events.model.{Page, PageBuilder, PropBuilder, PropType, _}

object WestRoad {
    val page: Page = PageBuilder()
        .setId("westRoad:list")
        .setUrl("http://www.westroad.org/whats-on/")
        .addPage(PageBuilder()
            .isRow(true)
            .setId("visitCambridge:description")
            .setLink("#content-left  > ul.forthcoming-list > li > a")
            .addPage(PageBuilder()
                .setId("visitCambridge:image")
                .setLink("#content-left > img")
                .addProp(PropBuilder()
                    .setName("image")
                    .setKind(PropType.Image)
                )
            )
            .addProp(PropBuilder()
                .setName("title")
                .setCss("#content-left > h1")
                .setKind(PropType.Text)
            )
            .addProp(PropBuilder()
                .setName("description")
                .setCss("#content-left  > p.bottomborder:nth-child(6), #content-left  > p.bottomborder:nth-child(8)")
                .setKind(PropType.Text)
            )
            .addProp(PropBuilder()
                .setName("when")
                .setCss("#content-left  > p.nobottompad > strong, #content-left  > p.bottomborder:nth-child(5) > strong")
                .setKind(PropType.Date)
            )
            .addProp(PropBuilder()
                .setName("venue")
                .setValue("West Road Concert Hall, 11 West Road, Cambridge, CB3 9DP")
                .setKind(PropType.Text)
            )
            .addProp(PropBuilder()
                .setName("venue-category")
                .setValue(Category.MUSIC)
                .setKind(PropType.Text)
            )
            .addProp(PropBuilder()
                .setName("telephone")
                .setValue("01223 335184")
                .setKind(PropType.Text)
            )
        )

        .addPage(PageBuilder()
            .setRef("westRoad:list")
            .setId("westRoad:pagination")
            .setLink("#content-left a.next")
        )

        .build()
}
