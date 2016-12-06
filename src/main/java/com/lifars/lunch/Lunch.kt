package com.lifars.lunch

import spark.Spark.*

object Lunch {
    var status = "I'm hungry"

    @JvmStatic fun main(args: Array<String>) {
//        If not hungry switch
//        val input = readLine()
//        if (!input.equals("")) status = input!!

        println(status)

//        val countDown = listOf(5, 4, 3, 2, 1)
//
//        Part 1: For loops
//        for (count in countDown) {
//            println(count)
//        }
//
//        for (count in countDown.indices) {
//            println(countDown[count])
//        }

//        Part 2: While loops
//        var count = 5
//        while (count > 0) {
//            println(count)
//            count--
//        }

//        Part 4: Web framework
//        port(5432)
//
//        get("/status") { req, res ->
//            status
//        }

//        Part 5: Persistent data
//        get("/status/:status") {req, res ->
//            val param = req.params("status")
//            updateStatus(param)
//
//            "Updated"
//        }
    }

//Part 3: Data classes/ Data Transfer Objects (DTO)
//data class lunch(val name: String, val price: Double)

//    Part 5: Persistent data
//    fun updateStatus(status: String) {
//        this.status = status
//    }
}