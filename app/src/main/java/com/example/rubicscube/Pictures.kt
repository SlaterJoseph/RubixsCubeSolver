package com.example.rubicscube

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

/**
 * Loads [MainFragment].
 */
class Pictures : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pictures)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_browse_fragment, MainFragment())
                .commitNow()
        }
    }
}