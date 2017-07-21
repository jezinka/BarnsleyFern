package com.projects.jezinka.barnsleyfern

class BarnsleyFern : Fern() {

    override var matrix: HashMap<String, HashMap<String, Float>> = hashMapOf(
            "f1" to hashMapOf("p" to 0.01f, "a" to 0f, "b" to 0f, "c" to 0f, "d" to 0.16f, "e" to 0f, "f" to 0f),
            "f2" to hashMapOf("p" to 0.85f, "a" to 0.85f, "b" to 0.04f, "c" to -0.04f, "d" to 0.85f, "e" to 0f, "f" to 1.6f),
            "f3" to hashMapOf("p" to 0.07f, "a" to 0.2f, "b" to -0.26f, "c" to 0.23f, "d" to 0.22f, "e" to 0f, "f" to 1.6f),
            "f4" to hashMapOf("p" to 0.07f, "a" to -0.15f, "b" to 0.28f, "c" to 0.26f, "d" to 0.24f, "e" to 0f, "f" to 0.44f)
    )
}
