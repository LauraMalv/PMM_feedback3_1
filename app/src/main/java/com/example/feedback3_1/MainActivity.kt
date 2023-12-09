package com.example.feedback3_1

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView: VideoView = findViewById(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)


        val videoPath = "android.resource://" + packageName + "/" + R.raw.mayita
        val uri = Uri.parse(videoPath)

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)

        videoView.start()
    }
}