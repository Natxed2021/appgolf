package com.example.rubcris

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var etUrl: EditText
    private lateinit var btnCargar: Button
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar las vistas
        etUrl = findViewById(R.id.etUrl)
        btnCargar = findViewById(R.id.btnCargar)
        webView = findViewById(R.id.webView)

        // Configurar el evento click del botón
        btnCargar.setOnClickListener {
            val url = etUrl.text.toString()
            loadUrl(url)
        }
    }

    private fun loadUrl(url: String) {
        webView.visibility = android.view.View.VISIBLE
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)
    }
}

