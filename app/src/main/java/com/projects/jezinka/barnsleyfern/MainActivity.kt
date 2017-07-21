package com.projects.jezinka.barnsleyfern

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.RadioButton
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val MAX = 100000
    var n = MAX
    var fern: Fern = BarnsleyFern()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myView = MyView(this)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    n = (p0.progress / 100.0 * MAX).toInt()
                    chartLayout.getChildAt(2).requestLayout()
                }
            }

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
            }
        })

        chartLayout.addView(myView)
    }

    inner class MyView(context: Context) : View(context) {

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

    fun onRadioButtonClicked(view: View) {

        val checked = (view as RadioButton).isChecked

        when (view.getId()) {
            R.id.radio_standard -> {
                if (checked) {
                    fern = BarnsleyFern()
                }
            }
            R.id.radio_cyclosorus -> {
                if (checked) {
                    fern = Cyclosorus()
                }
            }
            R.id.radio_fishbone -> {
                if (checked) {
                    fern = Fishbone()
                }
            }
            R.id.radio_modify -> {
                if (checked) {
                    fern = ModifiedBarnsley()
                }
            }
        }
        chartLayout.getChildAt(2).requestLayout()
    }
}
