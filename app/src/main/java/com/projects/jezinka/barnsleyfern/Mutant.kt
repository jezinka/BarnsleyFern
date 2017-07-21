package com.projects.jezinka.barnsleyfern

class Mutant : Fern() {

    override var matrix: HashMap<String, HashMap<String, Float>> = hashMapOf(
            "f1" to hashMapOf("p" to 0.02f, "a" to 0f, "b" to 0f, "c" to 0f, "d" to 0.25f, "e" to 0f, "f" to -0.4f),
            "f2" to hashMapOf("p" to 0.84f, "a" to 0.95f, "b" to 0.005f, "c" to -0.005f, "d" to 0.93f, "e" to -0.002f, "f" to 0.5f),
            "f3" to hashMapOf("p" to 0.07f, "a" to 0.035f, "b" to -0.2f, "c" to 0.16f, "d" to 0.04f, "e" to -0.09f, "f" to 0.02f),
            "f4" to hashMapOf("p" to 0.07f, "a" to -0.04f, "b" to 0.2f, "c" to 0.16f, "d" to 0.04f, "e" to 0.083f, "f" to 0.12f)
    )
}
