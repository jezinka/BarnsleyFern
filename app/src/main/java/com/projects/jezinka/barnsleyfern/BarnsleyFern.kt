package com.projects.jezinka.barnsleyfern

class BarnsleyFern : Fern() {

    override var matrix: HashMap<String, HashMap<String, Float>> = hashMapOf(
            F1 to hashMapOf(P to 0.01f, A to 0f, B to 0f, C to 0f, D to 0.16f, E to 0f, F to 0f),
            F2 to hashMapOf(P to 0.85f, A to 0.85f, B to 0.04f, C to -0.04f, D to 0.85f, E to 0f, F to 1.6f),
            F3 to hashMapOf(P to 0.07f, A to 0.2f, B to -0.26f, C to 0.23f, D to 0.22f, E to 0f, F to 1.6f),
            F4 to hashMapOf(P to 0.07f, A to -0.15f, B to 0.28f, C to 0.26f, D to 0.24f, E to 0f, F to 0.44f)
    )
}
