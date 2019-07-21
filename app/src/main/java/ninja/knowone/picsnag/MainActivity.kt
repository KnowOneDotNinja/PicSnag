package ninja.knowone.picsnag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMain.adapter = ImageFeedAdapter(picSnag(), this)
        rvMain.setHasFixedSize(true)
    }

    fun picSnag(): ArrayList<String> {
        val picList = ArrayList<String>()
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        picList.add("https://homepages.cae.wisc.edu/~ece533/images/airplane.png")
        return picList
    }
}
