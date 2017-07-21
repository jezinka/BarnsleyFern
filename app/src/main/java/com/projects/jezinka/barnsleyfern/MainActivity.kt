package com.projects.jezinka.barnsleyfern

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val MAX = 800000
    var n = MAX

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBar = SeekBar(this)
        val myView = MyView(this)

        seekBar.progress = 50
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    n = (p0.progress / 100.0 * MAX).toInt()
                    (p0.parent as ViewGroup).getChildAt(1).requestLayout()
                }
            }

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
            }
        })

        chartLayout.addView(seekBar)
        chartLayout.addView(myView)
    }

    inner class MyView(context: Context) : View(context) {

        val paint = Paint()
        val random = Random()

        override fun onDraw(canvas: Canvas) {
            super.onDraw(canvas)

            val points = FloatArray(n)

            canvas.translate(width / 2f, 0f)

            paint.style = Paint.Style.FILL
            paint.color = Color.WHITE
            canvas.drawPaint(paint)

            paint.color = Color.parseColor("#006200")

            points[0] = width.toFloat()
            points[1] = height.toFloat()

            for (i: Int in 2..n - 1 step 2) {
                val r = random.nextFloat()
                if (r <= 0.01) {
                    function1(points, i)
                } else if (r <= 0.08) {
                    function2(points, i)
                } else if (r <= 0.15) {
                    function3(points, i)
                } else {
                    function4(points, i)
                }
            }

            canvas.drawPoints(points.map { it * 100 }.toFloatArray(), paint)
        }
    }

    private fun function4(points: FloatArray, i: Int) {
        points[i] = (0.85 * points[i - 2] + 0.04 * points[i - 1]).toFloat()
        points[i + 1] = (-0.04 * points[i - 2] + 0.85 * points[i - 1] + 1.6).toFloat()
    }

    private fun function3(points: FloatArray, i: Int) {
        points[i] = (-0.15 * points[i - 2] + 0.28 * points[i - 1]).toFloat()
        points[i + 1] = (0.26 * points[i - 2] + 0.24 * points[i - 1] + 0.44).toFloat()
    }

    private fun function2(points: FloatArray, i: Int) {
        points[i] = (0.2 * points[i - 2] - 0.26 * points[i - 1]).toFloat()
        points[i + 1] = (0.23 * points[i - 2] + 0.22 * points[i - 1] + 1.6).toFloat()
    }

    private fun function1(pointsArray: FloatArray, i: Int) {
        pointsArray[i] = 0f
        pointsArray[i + 1] = 0.16f * pointsArray[i - 1]
    }
}
