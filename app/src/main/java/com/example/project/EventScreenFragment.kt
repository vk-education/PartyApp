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
import com.google.android.material.floatingactionbutton.FloatingActionButton
import service.NewEventService

class EventScreenFragment : Fragment() {
    private val movies = generateMovieList()
    var adapter: MovieAdapter? = null
    lateinit var newEventService: NewEventService
    private lateinit var pref: SharedPreferences


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
        newEventService = context?.let { NewEventService(it) }!!
        checkService()
        initAdapter(view)
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

        if (newEventService.eventName != null && newEventService.eventName != "" &&
            newEventService.eventDescription != null && newEventService.eventDescription != ""
        ) {
            movies.add(
                Movie(
                    newEventService.eventName!!,
                    newEventService.eventDescription!!,
                    BitmapDrawable(resources, getPreferenceObjectJson(requireContext(), "photo", pref)) //Сюда добавите нужную фотку
                )
            )
        }
        newEventService.saveEvenName("")
        newEventService.saveEvenDescr("")
        newEventService.saveEvenImage(0)
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
