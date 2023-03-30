package com.game

fun main() {

    val numberOfPlayers = mutableListOf<Int>()
    var raceDistance = 0
    var vinners = mutableListOf<Player>()
    val players = mutableListOf<Player>()
    val cat = Cat("Cat", (2..4).random(), 0, false)
    val aardvark = Aardvark("Aardvark", (2..4).random(), 0, false)
    val pig = Pig("Pig", (2..4).random(), 0, false)
    val hare = Hare("Hare", (2..4).random(), 0, false)
    val dog = Dog("Dog", (2..4).random(), 0, false)
    val snake = Snake("Snake", (2..4).random(), 0, false)
    fun move(speed: Int): Int {
        return speed
    }
    // немного не то, что Вы хотели. Если что, потом переделаю так,
    // чтобы при любом вводе просто требовало ввести заново. Не могу пока вспомнить как это делается.
    do {
        println("Enter players count: ")
        when (val playersCount = readln()) {
            "4", "5", "6", "7", "8" -> {
                println("Enter race distance: ")
                repeat(playersCount.toInt()) {
                    numberOfPlayers.add((1..6).random())
                }
                break
            }

            else -> println("Valid numbers are 4..8 !!!")
        }
    } while (true)

    do {
        raceDistance = readln().toInt()
        if (raceDistance !in 40..80)
            println("Valid numbers are 40..80 !!!")
    } while (raceDistance !in 40..80)

    numberOfPlayers.forEach {
        when (it) {
            1 -> players.add(cat)
            2 -> players.add(aardvark)
            3 -> players.add(pig)
            4 -> players.add(hare)
            5 -> players.add(dog)
            6 -> players.add(snake)
        }

    }
    println("Players:")
    var counter = 0
    repeat(players.size) {
        counter++
        println("$counter. ${players[counter - 1].name}( {${players[counter - 1].speed}} )")
    }

    println("Press s to start: ")
    var s = "a"
    while (s != "s") {
        s = readln()
    }

    var x = true
    while (x) {
        players.forEach {
            if (it.distanceCovered >= raceDistance) {
                vinners = players.filter { it.distanceCovered >= raceDistance }.toMutableList()
                x = false
            }
        }
//
            players.forEach {
                if (it.isFallenDown) {
                    it.distanceCovered -= move(it.speed)
                    it.isFallenDown = false
                }

                it.distanceCovered += move(it.speed)
                val randomNum1 = (1..100).random()
                if (randomNum1 < 20) {
                    println("${it.name}   ")
                    print("${it.speak()}")
                }

                val randomNum2 = (1..(100 - (it.speed * 15))).random()
                if (randomNum2 < 10) {
                    it.isFallenDown = true
                }
            }
        }

    println(players)

    vinners.forEach { it.winnerSpeech() }

//        println(players)
//        println("Vinners: $vinners")

}













