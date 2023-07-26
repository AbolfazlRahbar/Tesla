package rahbar.abolfazl.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import rahbar.abolfazl.tesla.databinding.ActivityMain2Binding
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.neumorphImageView3.setOnClickListener {

            binding.neumorphImageView3.setShapeType(ShapeType.PRESSED)

            binding.neumorphImageView3.setColorFilter(ContextCompat.getColor(this, R.color.blue_light),
            android.graphics.PorterDuff.Mode.SRC_IN)

            binding.neumorphImageView3.setShadowElevation(4f)

        }



    }
}