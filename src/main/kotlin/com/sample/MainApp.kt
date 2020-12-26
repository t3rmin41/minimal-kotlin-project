package com.sample

import org.slf4j.LoggerFactory

class MainApp {

    companion object {
        private val logger = LoggerFactory.getLogger(javaClass)

        @JvmStatic
        fun main(args: Array<String>) {
            logger.info("Minimal Kotlin MainApp started")
        }
    }

}