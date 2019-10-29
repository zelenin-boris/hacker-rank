package zelenin.boris.sampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import zelenin.boris.presentation.view.ListScreenFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_layout, ListScreenFragment.newInstanse(100))
                .commit()
    }
}
