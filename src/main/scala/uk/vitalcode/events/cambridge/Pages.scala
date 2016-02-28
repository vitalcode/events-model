package uk.vitalcode.events.cambridge

import uk.vitalcode.events.model.{Page, PropType, PropBuilder, PageBuilder}

object Pages {
    val cambridgeScienceCentre: Page = PageBuilder()
        .setId("list")
        .setUrl("http://www.cambridgesciencecentre.org/whats-on/list/")
        .addPage(PageBuilder()
            .isRow(true)
            .setId("description")
            .setLink("div.main_wrapper > section > article > ul > li > h2 > a")
            .addPage(PageBuilder()
                .setId("image")
                .setLink("section.event_detail > div.page_content > article > img")
                .addProp(PropBuilder()
                    .setName("image")
                    .setKind(PropType.Image)
                )
            )
            .addProp(PropBuilder()
                .setName("description")
                .setCss("div.main_wrapper > section.event_detail > div.page_content p:nth-child(4)")
                .setKind(PropType.Text)
            )
            .addProp(PropBuilder()
                .setName("cost")
                .setCss("div.main_wrapper > section.event_detail > div.page_content p:nth-child(5)")
                .setKind(PropType.Text)
            )
            .addProp(PropBuilder()
                .setName("when")
                .setCss("div.main_wrapper > section.event_detail > div > span:nth-child(2)")
                .setKind(PropType.Date)

            )
        )
        .addPage(PageBuilder()
            .setRef("list")
            .setId("pagination")
            .setLink("div.pagination > div.omega > a")
        )
        .build()
}
