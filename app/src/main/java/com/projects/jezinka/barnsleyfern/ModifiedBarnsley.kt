package com.projects.jezinka.barnsleyfern

class ModifiedBarnsley : Fern() {

    override var matrix: HashMap<String, HashMap<String, Float>> = hashMapOf(
            F1 to hashMapOf(P to 0.01f, A to 0f, B to 0f, C to 0f, D to 0.2f, E to 0f, F to -0.12f),
            F2 to hashMapOf(P to 0.85f, A to 0.845f, B to 0.035f, C to -0.035f, D to 0.82f, E to 0f, F to 1.6f),
            F3 to hashMapOf(P to 0.07f, A to 0.2f, B to -0.31f, C to 0.255f, D to 0.245f, E to 0f, F to 0.29f),
            F4 to hashMapOf(P to 0.07f, A to -0.15f, B to 0.24f, C to 0.25f, D to 0.2f, E to 0f, F to 0.68f)
    )
}
