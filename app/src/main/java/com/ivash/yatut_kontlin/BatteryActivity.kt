package com.ivash.yatut_kontlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_battery.*

class BatteryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_battery)

        sbBatteryCharge.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvBatteryCharge.text = sbBatteryCharge.progress.toString()
                var batteryCharge = sbBatteryCharge.progress.toString().toInt()

                when(batteryCharge) {
                    100 -> ivBattery.setImageResource(R.drawable.b100)
                    in 80..100 -> ivBattery.setImageResource(R.drawable.b80)
                    in  60..80 -> ivBattery.setImageResource(R.drawable.b60)
                    in 40..60 -> ivBattery.setImageResource(R.drawable.b40)
                    in 20..60-> ivBattery.setImageResource(R.drawable.b20)
                    0 -> ivBattery.setImageResource(R.drawable.b0)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        btnIntentMain.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}