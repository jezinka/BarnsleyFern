package com.projects.jezinka.barnsleyfern

class Fishbone : Fern() {

    override var matrix: HashMap<String, HashMap<String, Float>> = hashMapOf(
            F1 to hashMapOf(P to 0.02f, A to 0f, B to 0f, C to 0f, D to 0.25f, E to 0f, F to -0.4f),
            F2 to hashMapOf(P to 0.84f, A to 0.95f, B to 0.002f, C to -0.002f, D to 0.93f, E to -0.002f, F to 0.5f),
            F3 to hashMapOf(P to 0.07f, A to 0.035f, B to -0.11f, C to 0.27f, D to 0.01f, E to -0.05f, F to 0.005f),
            F4 to hashMapOf(P to 0.07f, A to -0.04f, B to 0.11f, C to 0.27f, D to 0.01f, E to 0.047f, F to 0.06f)
    )
}
