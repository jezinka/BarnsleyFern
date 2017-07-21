package com.projects.jezinka.barnsleyfern

import java.util.*
import kotlin.collections.HashMap

abstract class Fern {
    var points = FloatArray(0)
    open var matrix = HashMap<String, HashMap<String, Float>>()

    fun generateFern(n: Int): FloatArray {
        val random = Random()
        points = kotlin.FloatArray(n)

        for (i: Int in 2..n - 1 step 2) {
            val r = random.nextFloat()
            var function: String
            if (r <= matrix["f1"]!!["p"]!!) {
                function = "f1"
            } else if (r <= matrix["f1"]!!["p"]!! + matrix["f2"]!!["p"]!!) {
                function = "f2"
            } else if (r <= matrix["f1"]!!["p"]!! + matrix["f2"]!!["p"]!! + matrix["f3"]!!["p"]!!) {
                function = "f3"
            } else {
                function = "f4"
            }
            this.points[i] = first(function, i)
            this.points[i + 1] = second(function, i)
        }

        return this.points.map { it * 100 }.toFloatArray()
    }

    fun first(f: String, i: Int): Float {
        return (matrix[f]!!["a"]!! * points[i - 2] + matrix[f]!!["b"]!! * points[i - 1] + matrix[f]!!["e"]!!)
    }

    fun second(f: String, i: Int): Float {
        return (matrix[f]!!["c"]!! * points[i - 2] + matrix[f]!!["d"]!! * points[i - 1] + matrix[f]!!["f"]!!)
    }
}
