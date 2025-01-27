package vip.cdms.maimaihelper

import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    QrCapture.init()
    helperRouting()
}
