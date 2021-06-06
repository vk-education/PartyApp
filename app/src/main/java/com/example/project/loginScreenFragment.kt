package com.example.p

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.project.MainActivity
import com.example.project.MainFragment
import com.example.project.R
import com.example.project.currentFragMain
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignIn.getClient
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.android.material.button.MaterialButton
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_login_screen2.*
import java.lang.reflect.Array.get


class loginScreenFragment : Fragment() {
    private lateinit var pref: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_screen2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val remoteDB = Firebase.firestore
        var loginExist = false
        pref = requireContext().getSharedPreferences("app", Context.MODE_PRIVATE)
        var docId = ""


        button2.setOnClickListener {
            remoteDB.collection("users").get().addOnSuccessListener { result ->
                for (document in result) {
                    if (document.data["email"].toString() == email.text.toString()) {
                        loginExist = true;
                        docId = document.id
                    }
                }

                if (!loginExist) {

                    Snackbar.make(
                        login_content_2,
                        "Пользователь не найден! Создан новый аккаунт",
                        Snackbar.LENGTH_LONG
                    ).show()

                    val user = hashMapOf(
                        "email" to email.text.toString(),
                        "pasword" to password.text.toString()
                    )

                    remoteDB.collection("users").add(user).addOnSuccessListener {
                        pref.edit().putString("email", it.id).apply()
                    }
                } else
                    pref.edit().putString("email", docId).apply()

                startActivity(Intent(requireContext(), MainActivity::class.java))
            }
        }
    }
}