package com.example.project

import android.content.SharedPreferences
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project.R
import com.example.project.utils.getPreferenceObjectJson
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(val movies: List<Movie>, val fragmentManager: FragmentManager, val pref: SharedPreferences) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(itemView: View, val fragmentManager: FragmentManager,  val pref: SharedPreferences) :
        RecyclerView.ViewHolder(itemView) {

        fun bind(movie: Movie) {
            itemView.movie_item_tv_name.text = movie.title
            itemView.descriprion.text = movie.description
            itemView.movie_item_poster.setImageDrawable(BitmapDrawable(itemView.resources, getPreferenceObjectJson(itemView.context, "photo", pref)))
            itemView.setOnClickListener() {

                val descriptionFragment = DescriptionFragment()
                val bundle = Bundle()
                bundle.putString("title", itemView.movie_item_tv_name.text.toString())
                bundle.putString("context", itemView.descriprion.text.toString())
                bundle.putInt("image", 0)
                descriptionFragment.arguments = bundle
                makeCurrentFragmentInMainWindow(
                    descriptionFragment,
                    "descriptionFragment",
                    fragmentManager
                )

            }


            //      val viewFragment = ViewFragment()
            //это пердача данных из фрагмента в фрагмнт, нашла в интернете, до этого было передала из фрагмента в активити, и работа сделана
            //по лекции на котлин, там использовался Adapter, Moview и Description. А это в Adaptore, потому что я грубо
            // заменяла один код другим, не совсем поняла куда и как вставлять.  я сейчас раскомментила, но приложение ломается
            // потому что я из фрагмента запускаю активити, а надо чтобы переходило в другой фрагмент или создавала(?)
            //               val bundle = Bundle()
//                bundle.putParcelable(KEY_PARSE_DATA, details)
//                viewFragment.setArguments(bundle)
//                val transaction = fragmentManager.beginTransaction()
//                transaction.replace(R.id.fragment_desctiption, viewFragment)
//                transaction.commit()
        }


        private fun makeCurrentFragmentInMainWindow(
            fragment: Fragment,
            name: String,
            fragmentManager: FragmentManager
        ) {
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.main_fragmnet, fragment)
                addToBackStack(name.toString())
                commit()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        return MovieViewHolder(view, fragmentManager, pref)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int {
        return movies.size
    }


}
