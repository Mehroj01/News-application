package uz.pdp.dagger2nuntium.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import uz.pdp.dagger2nuntium.R
import uz.pdp.dagger2nuntium.utils.MySharedPreference

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

    }

    override fun onNavigateUp(): Boolean = findNavController(R.id.nav_host_register).navigateUp()
}