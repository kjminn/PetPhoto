package kr.hs.emirim.kjminn.petphoto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var checkStart:Switch
    lateinit var rg:RadioGroup
    lateinit var linear:LinearLayout
    lateinit var imgv:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkStart = findViewById(R.id.check_start)
        rg = findViewById(R.id.rg)
        linear = findViewById(R.id.linear)
        imgv = findViewById(R.id.imgv)
        linear.visibility = View.INVISIBLE

        checkStart.setOnCheckedChangeListener{compoundButton, b ->
            if(checkStart.isChecked){
                linear.visibility = View.VISIBLE
            }else{
                linear.visibility = View.INVISIBLE
            }
        }

        rg.setOnCheckedChangeListener{compoundButton, b ->
            when(rg.checkedRadioButtonId){
                R.id.radio_dog -> imgv.setImageResource(R.drawable.dog)
                R.id.radio_cat -> imgv.setImageResource(R.drawable.cat)
                R.id.radio_rabbit -> imgv.setImageResource(R.drawable.rabit)
            }
        }
    }
}






