package fr.lpiem.sweettodolist.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fr.lpiem.sweettodolist.R
import fr.lpiem.sweettodolist.app.domain.AppState
import fr.lpiem.sweettodolist.base.presentation.BaseFragment
import fr.lpiem.sweettodolist.main.adapter.SequenceAdapter
import fr.lpiem.sweettodolist.app.models.Sequence

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