package com.coilfirststeps.ca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.api.load
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image1.load(Constants.URL_IMAGE) {
            crossfade(true)
            crossfade(500)
        }

        image2.load(Constants.URL_IMAGE) {
            crossfade(true)
            crossfade(500)
            transformations(CircleCropTransformation())
        }

        image3.load(Constants.URL_IMAGE) {
            crossfade(true)
            crossfade(500)
            transformations(RoundedCornersTransformation(25f))
        }

        image4.load(Constants.URL_IMAGE) {
            crossfade(true)
            crossfade(500)
            transformations(BlurTransformation(applicationContext, 5f))
        }

        image5.load(Constants.URL_IMAGE) {
            crossfade(true)
            crossfade(500)
            transformations(GrayscaleTransformation())
        }

        image6.load(Constants.URL_IMAGE) {
            crossfade(true)
            crossfade(500)
            transformations(BlurTransformation(applicationContext))
        }
    }
}
