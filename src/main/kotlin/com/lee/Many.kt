package com.lee

import java.time.LocalDateTime

fun main(args: Array<String>) {

    val parkingLot =HashMap<String,Car?>()

    var enter = LocalDateTime.of(
        2019,4,9,12,30
    )
    //Car1 come in
    var car:Car?=Car("988-JHJ",enter)
    parkingLot["988-JHJ"] = car
    //Car2 come in
    car = Car("833-AHR",enter.plusMinutes(15))
    parkingLot["833-AHR"] =car

    var leave = LocalDateTime.of(2019,4,9,13,30)
    //Car1 leave
    car  = parkingLot["988-JHJ"]
    car?.leave = leave
    println("car1 ${car?.id} duration:${car?.duration()}")
    //Car2 leave
    car  = parkingLot["833-AHR"]
    car?.leave = leave.plusHours(2)
    println("car2 ${car?.id} duration:${car?.duration()}")





//    list()
}

private fun list() {
    var list = listOf(5, 1, 3, 4)
    println(list)

    var scores = listOf(66, 55, 22, 77, 65)
    for (score in scores) {
        println(score)
    }

    var mutable = mutableListOf(5, 1, 7, 8)
    mutable.add(10)
    println(mutable)
}