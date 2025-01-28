package org.trackmyexpenses.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform