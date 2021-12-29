object Modules {
    const val APP = ":app"
    const val CORE = ":core"

    /**
     * Dynamic feature module used for presentation layer
     * */
    object Features {
        const val OI = ":features:oi"
    }

    /**
     * Used for shared resources. UI for view logic and views for design assets
     * */
    object Commons {
        const val UI = ":commons:ui"
        const val VIEWS = ":commons:views"
    }

    /**
     * Used for test utils, Firebase implementation, etc.
     * */
    object Libraries {
        const val SAMPLE = ":libraries:sample"
    }
}
