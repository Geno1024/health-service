package com.geno1024.health

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress

object Main
{
    @JvmStatic
    fun main(args: Array<String>)
    {
        HttpServer.create(InetSocketAddress(44001), 0).apply {
            createContext("/") {
                val url = it.requestURI.path

//                println(url)

                val queryLocation = url.split("/")
                var serviceType = "root"
                var serviceKind = "root"
                if (queryLocation.size > 1) serviceType = queryLocation[1]
                if (queryLocation.size > 2) serviceKind = queryLocation[2]


            }
            start()
        }
    }
}