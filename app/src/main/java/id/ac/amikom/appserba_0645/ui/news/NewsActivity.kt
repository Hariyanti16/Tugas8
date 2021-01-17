package id.ac.amikom.appserba_0645.ui.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.amikom.appserba_0645.R

class NewsActivity : AppCompatActivity() {
    companion object {
        const val OPEN_NEWS = "open_news"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}