package uz.itschool.last

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import uz.itschool.last.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name_c=intent.getStringExtra("name_c")
        val capital_c=intent.getStringExtra("capital_c")
        val area_c=intent.getStringExtra("area_c")
        val info_c=intent.getStringExtra("info_c")
        val img_c=intent.getIntExtra("img_c", R.drawable.uzb)


        btn=findViewById(R.id.button_id)
        binding.namePr.text=name_c
        binding.capitalPr.text=capital_c
        binding.areaPr.text=area_c
        binding.imagePr.setImageResource(img_c)
        binding.infoPr.text=info_c
        btn.setOnClickListener {
            var intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}