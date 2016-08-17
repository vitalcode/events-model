package uk.vitalcode.events.cambridge

import uk.vitalcode.events.model.{Page, PageBuilder, PropBuilder, PropType, _}

object WestRoad {
    val page: Page = PageBuilder()
        .setId("westRoad:list")
        .setUrl("http://www.westroad.org/whats-on/")

        ////
        .addPage(PageBuilder()
        .isRow(true)
        .setId("visitCambridge:description")
        .setLink("#mainCol .ProductListMain > ol.productList > li > .centerBlock > h2 > a")
        .addPage(PageBuilder()
            .setId("visitCambridge:image")
            .setLink("#mainCol .tabContainer .overviewLeft  .image:nth-child(1) > img")
            .addProp(PropBuilder()
                .setName("image")
                .setKind(PropType.Image)
            )
        )
        .addProp(PropBuilder()
            .setName("title")
            .setCss("#mainCol > .productDetailTop > h1")
            .setKind(PropType.Text)
        )
        .addProp(PropBuilder()
            .setName("description")
            .setCss("#mainCol > .tabsProduct .productDetail .overviewLeft .description > p")
            .setKind(PropType.Text)
        )
        .addProp(PropBuilder()
            .setName("cost")
            .setCss("#mainCol > .tabsProduct .productDetail .overviewRight .ticketInfo > p")
            .setKind(PropType.Text)
        )
        .addProp(PropBuilder()
            .setName("venue")
            .setCss("#mainCol > .productDetailTop .contactBar .leftBlock address")
            .setKind(PropType.Text)
        )
        .addProp(PropBuilder()
            .setName("telephone")
            .setCss("#mainCol > .productDetailTop .contactBar .leftBlock .telephone")
            .setKind(PropType.Text)
        )
        .addProp(PropBuilder()
            .setName("when")
            .setCss("#mainCol > .tabsProduct .productDetail .openingTimes table > thead > tr.opening > th > span.date, #mainCol > .tabsProduct .productDetail .openingTimes table > tbody > tr > td") // TODO check again
            .setKind(PropType.Date)

        )
    )
        ////


        .addPage(PageBuilder()
        .setRef("westRoad:list")
        .setId("westRoad:pagination")
        .setLink("#mainCol .ProductListMain > ul.paging:last-child > li:last-child > a")
    )

        .build()
}
