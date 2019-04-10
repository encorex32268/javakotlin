package com.lee

import java.io.File


fun main(args: Array<String>) {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
    File("kotlinBufferedWriter.txt").bufferedWriter().use {
        it.appendln("1234")
        it.appendln("5678")
        it.appendln("2222")
        it.appendln("3333")
    }
    File("kotlinPrintWriter.txt").printWriter().use {
        it.println("1234")
        it.println("5678")
        it.println("2222")
        it.println("77777")
    }
}