package com.example.test_1

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
private const val TAG = "WJC-FRAGMENT"

class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.e(TAG + param1, "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e(TAG + param1, "onCreateView")
        var view = inflater.inflate(R.layout.fragment_blank, container, false)
        view.findViewById<TextView>(R.id.content).text = param1
        when(param1){
            "0"->{
                view.setBackgroundColor(Color.BLUE)
            }
            "1"->{
                view.setBackgroundColor(Color.RED)
            }
            "2"->{
                view.setBackgroundColor(Color.YELLOW)
            }
            "3"->{
                view.setBackgroundColor(Color.GREEN)
            }
            "4"->{
                view.setBackgroundColor(Color.LTGRAY)
            }
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(TAG + param1, "onActivityCreated")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TAG + param1, "onAttach")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG + param1, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG + param1, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG + param1, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG + param1, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TAG + param1, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG + param1, "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(TAG + param1, "onDetach")
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}