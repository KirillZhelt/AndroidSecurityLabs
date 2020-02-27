package dev.kirillzhelt.allapplicationsutil

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pm = packageManager
        val apps = pm.getInstalledApplications(0)

        val appsInfoBuilder = StringBuilder("Total apps: " + apps.size + '\n')
        for (app in apps) {
            appsInfoBuilder.append(pm.getApplicationLabel(app).toString() + '\n')
        }

        findViewById<TextView>(R.id.apps_tv).text = appsInfoBuilder.toString()
    }
}
