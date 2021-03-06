package br.com.lucianoluzzi.navigationpoc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_c.*

class FragmentC : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_c, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val actionFragmentCToFragmentD = FragmentCDirections.actionFragmentCToFragmentD()
        button_fragmentD.setOnClickListener(
            Navigation.createNavigateOnClickListener(actionFragmentCToFragmentD)
        )
    }
}