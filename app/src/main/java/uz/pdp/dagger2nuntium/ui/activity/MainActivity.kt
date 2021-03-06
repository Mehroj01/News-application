package uz.pdp.dagger2nuntium.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import uz.pdp.dagger2nuntium.R
import uz.pdp.dagger2nuntium.utils.MySharedPreference
import uz.pdp.dagger2nuntium.utils.ThemeHelper

class MainActivity : AppCompatActivity() {

    private lateinit var handler: Handler
    private lateinit var mySharedPreference: MySharedPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        handler = Handler(Looper.getMainLooper())
        mySharedPreference = MySharedPreference(this)

        if (mySharedPreference.getBool("isDark")) {
            ThemeHelper.applyTheme(ThemeHelper.darkMode)
        } else {
            ThemeHelper.applyTheme(ThemeHelper.lightMode)
        }

        handler.postDelayed({
            if (mySharedPreference.getRegister() == "reg") {
                startActivity(Intent(this, HomeActivity::class.java))
            } else {
                startActivity(Intent(this, RegisterActivity::class.java))
            }
            finish()
        }, 500)

    }
}