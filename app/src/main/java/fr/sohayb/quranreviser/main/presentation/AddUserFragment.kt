package fr.sohayb.quranreviser.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.base.presentation.BaseFragment
import fr.sohayb.quranreviser.main.adapter.SequenceAdapter
import fr.sohayb.quranreviser.app.models.Sequence

class AddUserFragment : BaseFragment() {


    val sequenceAdapter = SequenceAdapter(::onClickResultEvent, ::onClickGoToListResultEvent)

    //val sequenceList = listOf(

    //)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_ajout_utilisateur,container,false)




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //fragmentMyEventsRv.adapter = sequenceAdapter
       // sequenceAdapter.submitList(sequenceList)

    }

    override fun render(appState: AppState) {

    }

    private fun onClickResultEvent(sequence: Sequence) {

    }

    private fun onClickGoToListResultEvent(sequence: Sequence) {

    }

}