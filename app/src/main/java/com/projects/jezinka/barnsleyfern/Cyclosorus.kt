package com.projects.jezinka.barnsleyfern

class Cyclosorus : Fern() {

    override var matrix: HashMap<String, HashMap<String, Float>> = hashMapOf(
            F1 to hashMapOf(P to 0.02f, A to 0f, B to 0f, C to 0f, D to 0.25f, E to 0f, F to -0.4f),
            F2 to hashMapOf(P to 0.84f, A to 0.95f, B to 0.005f, C to -0.005f, D to 0.93f, E to -0.002f, F to 0.5f),
            F3 to hashMapOf(P to 0.07f, A to 0.035f, B to -0.2f, C to 0.16f, D to 0.04f, E to -0.09f, F to 0.02f),
            F4 to hashMapOf(P to 0.07f, A to -0.04f, B to 0.2f, C to 0.16f, D to 0.04f, E to 0.083f, F to 0.12f)
    )
}
