package com.lee

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {

    var fakeEnter = LocalDateTime.of(
        2019,4,9,15,0
    )
    var fakeLeave = LocalDateTime.of(
        2019,4,9,17,30
    )
    var car  = Car("KK-00088",fakeEnter)

    car.leave=fakeLeave
    println(car.duration())
    println(car.duration()/60)
    var hours : Long= Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}

class Car(val id:String,var enter:LocalDateTime){
    var leave : LocalDateTime?=null
        set(value) {
        if (enter.isBefore(value)){
            field = value
        }
    }
    fun duration()= Duration.between(enter,leave).toMinutes()





}
