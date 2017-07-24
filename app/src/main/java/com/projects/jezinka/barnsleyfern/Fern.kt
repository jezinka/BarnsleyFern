package com.projects.jezinka.barnsleyfern

import java.util.*
import kotlin.collections.HashMap

abstract class Fern {

    val F1: String = "f1"
    val F2: String = "f2"
    val F3: String = "f3"
    val F4: String = "f4"
    val A: String = "a"
    val B: String = "b"
    val C: String = "c"
    val D: String = "d"
    val E: String = "e"
    val F: String = "f"
    val P: String = "p"

    var points = FloatArray(0)
    open var matrix = HashMap<String, HashMap<String, Float>>()

    fun generateFern(n: Int): FloatArray {
        val random = Random()
        points = kotlin.FloatArray(n)

        for (i: Int in 2..n - 1 step 2) {
            val r = random.nextFloat()

            val p1 = matrix[F1]!![P]!!
            val p2 = matrix[F2]!![P]!!
            val p3 = matrix[F3]!![P]!!

            var function: String
            if (r <= p1) {
                function = F1
            } else if (r <= p1 + p2) {
                function = F2
            } else if (r <= p1 + p2 + p3) {
                function = F3
            } else {
                function = F4
            }

            this.points[i] = newX(function, i)
            this.points[i + 1] = newY(function, i)
        }

        return this.points.map { it * 100 }.toFloatArray()
    }

    fun newX(function: String, i: Int): Float {
        val a = matrix[function]!![A]!!
        val b = matrix[function]!![B]!!
        val e = matrix[function]!![E]!!

        return (a * getX(i) + b * getY(i) + e)
    }

    fun newY(function: String, i: Int): Float {
        val c = matrix[function]!![C]!!
        val d = matrix[function]!![D]!!
        val f = matrix[function]!![F]!!

        return (c * getX(i) + d * getY(i) + f)
    }

    private fun getY(i: Int) = points[i - 1]

    private fun getX(i: Int) = points[i - 2]
}
