package com.projects.jezinka.barnsleyfern

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class FernView : View {

    var fern: Fern = BarnsleyFern()
    var n: Int = 100000

    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attributeSet: AttributeSet) : super(ctx, attributeSet)

    val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.translate(width / 2f, 0f)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        canvas.drawPaint(paint)

        paint.color = Color.parseColor("#006200")

        val points = fern.generateFern(n)
        canvas.drawPoints(points, paint)
    }
}