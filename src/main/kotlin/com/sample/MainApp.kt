package com.sample

import org.slf4j.LoggerFactory

class MainApp {

    private val log = LoggerFactory.getLogger(javaClass) // this logger cannot be referenced in fun main(..) as
    // non-static variable cannot be referenced in static context

    companion object {
        private val logger = LoggerFactory.getLogger(javaClass)

        @JvmStatic
        fun main(args: Array<String>) {
            logger.info("Minimal Kotlin MainApp started")
        }
    }

}