package com.example.project

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project.utils.getPreferenceObjectJson
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.firestore.FirebaseFirestore
import service.NewEventService

class EventScreenFragment : Fragment() {
    private val movies = generateMovieList()
    var adapter: MovieAdapter? = null
    lateinit var newEventService: NewEventService
    private lateinit var pref: SharedPreferences

    private lateinit var db: FirebaseFirestore

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pref = requireContext().getSharedPreferences(
            "sharedPreferences",
            AppCompatActivity.MODE_PRIVATE
        )
        db = FirebaseFirestore.getInstance()
        movies.clear()
        newEventService = context?.let { NewEventService(it) }!!
        checkService()
        setOnClick(view)
    }

    private fun initAdapter(view: View) {
        val rv_movie_list: RecyclerView = view.findViewById(R.id.recyclerViewFinishWork)
        adapter = fragmentManager?.let { MovieAdapter(movies, it, pref) }
        rv_movie_list.adapter = adapter
        rv_movie_list.layoutManager = LinearLayoutManager(this.context)

    }

    private fun setOnClick(view: View) {
        val hello: FloatingActionButton = view.findViewById(R.id.hello)
        hello.setOnClickListener {
            val newEventFragment = NewEventFragment()
            makeCurrentFragmentInMainWindow(newEventFragment, "newEventFragment")
        }
    }

    private fun checkService() {


        db.collection("event").get().addOnSuccessListener { result ->
            for (document in result) {
                if (document.data["imageUrl"] != null && document.data["description"] != null
                    && document.data["title"] != null
                ) {
                    movies.add(
                        Movie(
                            document.data["title"].toString(),
                            document.data["description"].toString(),
                            document.data["imageUrl"].toString()
                        )
                    )
                }
            }
            newEventService.saveEvenName("")
            newEventService.saveEvenDescr("")
            newEventService.saveEvenImage(0)
            initAdapter(requireView())
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun generateMovieList(): ArrayList<Movie> {
        return arrayListOf(
//            Movie(
//                "Погнали в бар",
//                "В 2:00 собираемся около главного входа в..",
//                requireContext().getDrawable(R.drawable.ic_event_black_24dp)!!
//            ),
//            Movie(
//                "Давно не виделись",
//                "Желательно не опаздывать, ждать не будем!",
//                requireContext().getDrawable(R.drawable.ic_event_black_24dp)!!
//            )
        )
    }


    private fun makeCurrentFragmentInMainWindow(fragment: Fragment, name: String) {
        fragmentManager?.beginTransaction()?.apply {
            replace(R.id.main_fragmnet, fragment)
            addToBackStack(name.toString())
            commit()
        }
    }
}
