package com.game


fun main() {

    val numberOfPlayers = mutableListOf<Int>()
    var raceDistance = 0
    val players = mutableListOf<Player>()
    val cat = Cat("Cat", (2..4).random())
    val aardvark = Aardvark("Aardvark", (2..4).random())
    val pig = Pig("Pig", (2..4).random())
    val hare = Hare("Hare", (2..4).random())
    val dog = Dog("Dog", (2..4).random())
    val snake = Snake("Snake", (2..4).random())
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
        raceDistance = readln().toIntOrNull() ?: 0
        if (raceDistance !in 40..80)
            println("Valid numbers are 40..80 !!!")
    } while (raceDistance !in 40..80)

    Player.raceDistance = raceDistance

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
    players.forEachIndexed { index, player ->
        println("${index + 1}. ${player.name}( {${player.speed}} )")
    }

    var s = "a"
    while (s != "s") {
        println("Press s to start: ")
        s = readln()
    }

    while (players.none { it.distanceCompleted() }) {
        println("")
        players.forEach { player ->
            player.apply {
                move()
                speakRandom()
                printDistance()
            }
        }

        Thread.sleep(1_000)

        println("")
    }

    players
        .filter { it.distanceCompleted() }
        .forEach { it.winnerSpeech() }
}













