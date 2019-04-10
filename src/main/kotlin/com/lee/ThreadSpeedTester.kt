package com.lee

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    var count = 1

    // thread 100000 about 5~9 seconds
    /*var ms = measureTimeMillis {
        thread {
            for (i in 1..100_000){
                count++
            }
        }
    }*/
    //CoroutineScope about 0.09 ~0.17
    var ms = measureTimeMillis {
        GlobalScope.launch {
            for (i in 1..100_000){
                count++
            }
        }
    }
    println(ms)

}