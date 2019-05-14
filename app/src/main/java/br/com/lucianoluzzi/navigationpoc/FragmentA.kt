package br.com.lucianoluzzi.navigationpoc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val actionFragmentAToFragmentB = FragmentADirections.actionFragmentAToFragmentB()
        button_fragmentB.setOnClickListener(
            Navigation.createNavigateOnClickListener(actionFragmentAToFragmentB)
        )

        val actionFragmentAToFragmentC = FragmentADirections.actionFragmentAToFragmentC()
        button_fragmentC.setOnClickListener(
            Navigation.createNavigateOnClickListener(actionFragmentAToFragmentC)
        )
    }
}