package ru.nedfreetoplay.mateka.function

import ru.nedfreetoplay.mateka.Angle

class Sin(private val angle: Angle) {
    fun Calculate(): Double {
        return StrictMath.sin(angle.radian()) // default impl. delegates to StrictMath
    }
}