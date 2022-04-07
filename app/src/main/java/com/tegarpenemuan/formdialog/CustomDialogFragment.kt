package com.tegarpenemuan.formdialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_custom_dialog.*
import kotlinx.android.synthetic.main.fragment_custom_dialog.view.*

class CustomDialogFragment:DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.fragment_custom_dialog,container,false)

        rootView.cancelButton.setOnClickListener {
            Toast.makeText(context,"You Clicked Cancel",Toast.LENGTH_SHORT).show()
            dismiss()
        }

        rootView.submitButton.setOnClickListener {
            val selectedID = ratingRadioGroup.checkedRadioButtonId
            val radio = rootView.findViewById<Button>(selectedID)

            var ratingResult = radio.text.toString()

            Toast.makeText(context,"You Rated: $ratingResult",Toast.LENGTH_SHORT).show()

            dismiss()
        }

        return rootView
    }
}