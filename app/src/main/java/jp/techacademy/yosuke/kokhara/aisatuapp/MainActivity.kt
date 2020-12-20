package jp.techacademy.yosuke.kokhara.aisatuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button1 -> showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")
                    if (hour<=1)
                        textView.setText("こんばんは")
                    else if (hour<=9)
                        textView.setText("おはよう")
                    else if (hour<=18)
                        textView.setText("こんにちは")
                    else if (hour<=24)
                        textView.setText("こんばんは")

                },
                0, 0, true)
        timePickerDialog.show()


    }
}