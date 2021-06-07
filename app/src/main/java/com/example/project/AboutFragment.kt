package com.example.project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.project.ContactFragment
import com.example.project.R
import com.google.android.material.button.MaterialButton

class AboutFragment : Fragment() {

//    private lateinit var mAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        var orientation = RecyclerView.VERTICAL
//        var spanCount = 1
//
//        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewFinishWork)
//        val layoutManager = GridLayoutManager(requireContext(), spanCount, orientation, false)
        val buttonReset = view.findViewById<MaterialButton>(R.id.registrationButtonFrag1)
//        val imag = view.findViewById<MaterialButton>(R.id.imag)
//
//        imag.setOnClickListener() {
//            val editFragment = EditFragment()
//            val bundle = Bundle()
//            editFragment.arguments = bundle
//            makeCurrentFragmentInMainWindow(editFragment, "editFragment")
//        }
//val sign=view.findViewById<TextView>(R.id.sign)
//        sign.setOnClickListener{
//    db.signOut()
//}
//        db.addAuthStateListener{
//            if (it.currentUser == null) {
//                makeCurrentFragmentInMainWindow(loginFragment, "loginFragment")
//                finish()
//            }
//        }
//        mAuth = FirebaseAuth.getInstance()
//            val olo = view.findViewById<MaterialButton>(R.id.sign)
//        olo.setOnClickListener{
//            mAuth.signOut()
//        }
            //  db = FirebaseFirestore.getInstance()

        buttonReset.setOnClickListener() {
            val contactFragment = ContactFragment()
            val bundle = Bundle()
            contactFragment.arguments = bundle
            makeCurrentFragmentInMainWindow(contactFragment, "descriptionFragment")
        }

    }

    private fun makeCurrentFragmentInMainWindow(fragment: Fragment, name: String) {
        fragmentManager?.beginTransaction()?.apply {
            replace(R.id.main_fragmnet, fragment)
            addToBackStack(name.toString())
            commit()
        }
    }

    }