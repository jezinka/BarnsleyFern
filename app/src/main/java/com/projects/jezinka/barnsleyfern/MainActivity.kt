package com.projects.jezinka.barnsleyfern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val MAX = 100000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    fernView.n = (p0.progress / 100.0 * MAX).toInt()
                    fernView.requestLayout()
                }
            }

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
            }
        })

        radioGroup.setOnCheckedChangeListener { radioGroup, id ->
            when (id) {
                R.id.radio_standard -> {
                    fernView.fern = BarnsleyFern()
                }
                R.id.radio_cyclosorus -> {
                    fernView.fern = Cyclosorus()
                }
                R.id.radio_fishbone -> {
                    fernView.fern = Fishbone()
                }
                R.id.radio_modify -> {
                    fernView.fern = ModifiedBarnsley()
                }
            }
            fernView.requestLayout()
        }
    }

    fun exitButtonClick(view: View) {
        finish()
        System.exit(0)
    }
}
