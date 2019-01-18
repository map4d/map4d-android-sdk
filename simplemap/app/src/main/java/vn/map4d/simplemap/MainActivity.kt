package vn.map4d.simplemap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import vn.map4d.map4dsdk.maps.Map4D
import vn.map4d.map4dsdk.maps.OnMapReadyCallback

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onMapReady(map4D: Map4D?) {
        map4D?.enable3DMode(true)
        map4D.o
    }
}