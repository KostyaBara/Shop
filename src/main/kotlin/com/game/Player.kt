package com.game

abstract class Player(
    open val name: String,
    open val speed: Int,
    open var distanceCovered: Int,
    open var isFallenDown: Boolean) {
    abstract fun move(speed: Int): Int
    abstract fun speak()
    abstract fun winnerSpeech()
}

    data class Cat(
        override val name: String,
        override val speed: Int,
        override var distanceCovered: Int,
        override var isFallenDown: Boolean = false,
    ) : Player(
        name = name,
        speed = speed,
        distanceCovered = distanceCovered,
        isFallenDown = false
    ) {
        override fun move(speed: Int): Int {
            return speed
        }

        override fun speak() {
            println("meow")
        }

        override fun winnerSpeech() {
            println("Cat said: " +
                    "Cats are the most intelligent animals!")
        }
    }

    data class Aardvark(
        override val name: String,
        override val speed: Int,
        override var distanceCovered: Int,
        override var isFallenDown: Boolean = false,
    ) : Player(
        name = name,
        speed = speed,
        distanceCovered = distanceCovered,
        isFallenDown = false
    ) {
        override fun move(speed: Int): Int {
            return speed
        }

        override fun speak() {
            println("tu-tu")
        }

        override fun winnerSpeech() {
            println("Aardvark said: " +
                    "I came from Africa to make the whole World to know about aardvarks!")
        }
    }

    data class Pig(
        override val name: String,
        override val speed: Int,
        override var distanceCovered: Int,
        override var isFallenDown: Boolean = false,
    ) : Player(
        name = name,
        speed = speed,
        distanceCovered = distanceCovered,
        isFallenDown = false
    ) {
        override fun move(speed: Int): Int {
            return speed
        }

        override fun speak() {
            println("hru-hru")
        }

        override fun winnerSpeech() {
            println("Pig said: " +
                    "Pigs will save this World from degradation! Next president should be a pig!!!")
        }
    }

    data class Dog(
        override val name: String,
        override val speed: Int,
        override var distanceCovered: Int,
        override var isFallenDown: Boolean = false,
    ) : Player(
        name = name,
        speed = speed,
        distanceCovered = distanceCovered,
        isFallenDown = false
    ) {
        override fun move(speed: Int): Int {
            return speed
        }

        override fun speak() {
            println("bow-wow")
        }

        override fun winnerSpeech() {
            println("Dog said: " +
                    "Chant Hare Krishna and be happy! Dog is a best friend of every man!")
        }
    }

    data class Hare(
        override val name: String,
        override val speed: Int,
        override var distanceCovered: Int,
        override var isFallenDown: Boolean = false,
    ) : Player(
        name = name,
        speed = speed,
        distanceCovered = distanceCovered,
        isFallenDown = false
    ) {
        override fun move(speed: Int): Int {
            return speed
        }

        override fun speak() {
            println("uf-uf-uf-uf")
        }

        override fun winnerSpeech() {
            println("Hare said: " +
                    "Please, ban all meat eaters! Veg food is better for health!")
        }
    }

    data class Snake(
        override val name: String,
        override val speed: Int,
        override var distanceCovered: Int,
        override var isFallenDown: Boolean = false,
    ) : Player(
        name = name,
        speed = speed,
        distanceCovered = distanceCovered,
        isFallenDown = false
    ) {
        override fun move(speed: Int): Int {
            return speed
        }

        override fun speak() {
            println("sssssss")
        }

        override fun winnerSpeech() {
            println("Snake said: " +
                    "Snakes are most powerful and wise creatures and everybody must respect us!")
        }
    }



