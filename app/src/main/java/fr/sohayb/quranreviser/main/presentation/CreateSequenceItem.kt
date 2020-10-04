package fr.sohayb.quranreviser.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.base.presentation.BaseFragment
import kotlinx.android.synthetic.main.fragment_create_sequence_item.*

class CreateSequenceItem : BaseFragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_create_sequence_item, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentCreateSequenceItemValidateButton.setOnClickListener {
            findNavController().popBackStack()
        }


        ajoutSequenceItemBackButton.setOnClickListener {
            findNavController().popBackStack()
        }

    }

    override fun render(appState: AppState) {

    }



}