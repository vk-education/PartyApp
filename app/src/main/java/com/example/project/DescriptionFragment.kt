package com.example.project

import android.content.SharedPreferences
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.project.R
import com.example.project.utils.getPreferenceObjectJson
import kotlinx.android.synthetic.main.fragment_description.*

class DescriptionFragment : Fragment() {
    var title: String? = null
    var description: String? = null
    var picture: Int? = null
    private lateinit var pref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = arguments
        if (bundle != null) {
            title = bundle.getString("title")
            description = bundle.getString("context")
            picture = bundle.getInt("image")
        }
        pref = requireContext().getSharedPreferences(
            "sharedPreferences",
            AppCompatActivity.MODE_PRIVATE
        )

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val t = view.findViewById<TextView>(R.id.name)
        t.text = title
        val d = view.findViewById<TextView>(R.id.description)
        d.text = description
        poster.setImageDrawable(
            BitmapDrawable(
                requireContext().resources,
                getPreferenceObjectJson(requireContext(), "photo", pref)
            )
        )
    }
}