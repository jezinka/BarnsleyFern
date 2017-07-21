package com.projects.jezinka.barnsleyfern

class Fishbone : Fern() {

    override var matrix: HashMap<String, HashMap<String, Float>> = hashMapOf(
            "f1" to hashMapOf("p" to 0.02f, "a" to 0f, "b" to 0f, "c" to 0f, "d" to 0.25f, "e" to 0f, "f" to -0.4f),
            "f2" to hashMapOf("p" to 0.84f, "a" to 0.95f, "b" to 0.002f, "c" to -0.002f, "d" to 0.93f, "e" to -0.002f, "f" to 0.5f),
            "f3" to hashMapOf("p" to 0.07f, "a" to 0.035f, "b" to -0.11f, "c" to 0.27f, "d" to 0.01f, "e" to -0.05f, "f" to 0.005f),
            "f4" to hashMapOf("p" to 0.07f, "a" to -0.04f, "b" to 0.11f, "c" to 0.27f, "d" to 0.01f, "e" to 0.047f, "f" to 0.06f)
    )
}
