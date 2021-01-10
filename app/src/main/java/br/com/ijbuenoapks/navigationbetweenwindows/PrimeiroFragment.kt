package br.com.ijbuenoapks.navigationbetweenwindows

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PrimeiroFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PrimeiroFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //defino a variavel que gerenciara o fragmento
        val view =  inflater.inflate(R.layout.fragment_primeiro, container, false)
        //capturo os botoes e defino as ações para o click deles levarem para as janelas de acordo com cada uma delas
        view.findViewById<Button>(R.id.cmd1).setOnClickListener { Navigation.findNavController(view).navigate(R.id.navegarPrimeiroParaSegundo) }
        view.findViewById<Button>(R.id.cmd2).setOnClickListener { Navigation.findNavController(view).navigate(R.id.navegarPrimeiroParaTerceiro) }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment PrimeiroFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            PrimeiroFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}