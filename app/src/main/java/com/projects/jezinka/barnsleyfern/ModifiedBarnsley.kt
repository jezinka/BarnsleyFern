package com.projects.jezinka.barnsleyfern

class ModifiedBarnsley : Fern() {

    override var matrix: HashMap<String, HashMap<String, Float>> = hashMapOf(
            "f1" to hashMapOf("p" to 0.01f, "a" to 0f, "b" to 0f, "c" to 0f, "d" to 0.2f, "e" to 0f, "f" to -0.12f),
            "f2" to hashMapOf("p" to 0.85f, "a" to 0.845f, "b" to 0.035f, "c" to -0.035f, "d" to 0.82f, "e" to 0f, "f" to 1.6f),
            "f3" to hashMapOf("p" to 0.07f, "a" to 0.2f, "b" to -0.31f, "c" to 0.255f, "d" to 0.245f, "e" to 0f, "f" to 0.29f),
            "f4" to hashMapOf("p" to 0.07f, "a" to -0.15f, "b" to 0.24f, "c" to 0.25f, "d" to 0.2f, "e" to 0f, "f" to 0.68f)
    )
}
