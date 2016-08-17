package uk.vitalcode.events.cambridge

import uk.vitalcode.events.model.{Page, PageBuilder, PropBuilder, _}

object CornExchange {
    val page: Page = PageBuilder()
        .setId("cornExchange:list")
        .setUrl("https://www.cambridgelivetrust.co.uk/cornex/events-list")

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
            .setRef("cornExchange:list")
            .setId("cornExchange:pagination")
            .setLink("#mainCol .ProductListMain > ul.paging:last-child > li:last-child > a")
        )

        .build()
}
