package com.game

abstract class Player(
    val name: String,
    val speed: Int,
    private var distanceCovered: Int = 0,
) {
    fun move() {
        if ((1..(100 - (speed * 15))).random() > 10) {
            distanceCovered += speed
        }
    }

    abstract fun speak()
    abstract fun winnerSpeech()

    fun distanceCompleted(): Boolean =
        distanceCovered >= raceDistance

    fun printDistance() {
        print("${distanceCovered * 100 / raceDistance}%  ")
        repeat(distanceCovered) {
            print("=")
        }
        println(" $name")
    }

    fun speakRandom() {
        if ((1..100).random() < 20) {
            print("$name: ")
            speak()
        }
    }

    // TODO read what is companion object
    companion object {
        var raceDistance: Int = 0
    }
}

class Cat(
    name: String,
    speed: Int,
) : Player(
    name = name,
    speed = speed,
) {
    override fun speak() {
        println("meow")
    }

    override fun winnerSpeech() {
        println("Cat said: Cats are the most intelligent animals!")
    }
}

class Aardvark(
    name: String,
    speed: Int,
) : Player(
    name = name,
    speed = speed,
) {
    override fun speak() {
        println("tu-tu")
    }

    override fun winnerSpeech() {
        println(
            "Aardvark said: " +
                    "I came from Africa to make the whole World to know about aardvarks!"
        )
    }
}

class Pig(
    name: String,
    speed: Int,
) : Player(
    name = name,
    speed = speed,
) {
    override fun speak() {
        println("hru-hru")
    }

    override fun winnerSpeech() {
        println(
            "Pig said: " +
                    "Pigs will save this World from degradation! Next president should be a pig!!!"
        )
    }
}

class Dog(
    name: String,
    speed: Int,
) : Player(
    name = name,
    speed = speed,
) {
    override fun speak() {
        println("bow-wow")
    }

    override fun winnerSpeech() {
        println(
            "Dog said: " +
                    "Chant Hare Krishna and be happy! Dog is a best friend of every man!"
        )
    }
}

class Hare(
    name: String,
    speed: Int,
) : Player(
    name = name,
    speed = speed,
) {
    override fun speak() {
        println("uf-uf-uf-uf")
    }

    override fun winnerSpeech() {
        println(
            "Hare said: " +
                    "Please, ban all meat eaters! Veg food is better for health!"
        )
    }
}

class Snake(
    name: String,
    speed: Int,
) : Player(
    name = name,
    speed = speed,
) {
    override fun speak() {
        println("sssssss")
    }

    override fun winnerSpeech() {
        println(
            "Snake said: " +
                    "Snakes are most powerful and wise creatures and everybody must respect us!"
        )
    }
}



