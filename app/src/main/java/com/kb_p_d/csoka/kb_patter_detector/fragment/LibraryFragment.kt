package com.kb_p_d.csoka.kb_patter_detector.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kb_p_d.csoka.kb_patter_detector.R

//TODO - List of files from: Environment.getExternalStorageDirectory().toString() + File.separator + storage_path
//TODO - Separate folders in the app folder for: drawn patterns, captured patterns (these will be automatically captured)
//TODO - Separate access from the library to draw and to captured
class LibraryFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_library, null)
    }
}