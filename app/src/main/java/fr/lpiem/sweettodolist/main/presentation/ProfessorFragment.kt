package fr.lpiem.sweettodolist.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import fr.lpiem.sweettodolist.R
import fr.lpiem.sweettodolist.app.domain.AppState
import fr.lpiem.sweettodolist.base.presentation.BaseFragment
import fr.lpiem.sweettodolist.main.adapter.SequenceAdapter
import fr.lpiem.sweettodolist.app.models.Sequence
import kotlinx.android.synthetic.main.fragment_professor.*

class ProfessorFragment : BaseFragment() {


    val sequenceAdapter = SequenceAdapter(::onClickResultEvent, ::onClickGoToListResultEvent)

    val sequenceList = listOf(
        Sequence(0,"Courses"),
        Sequence(0,"Courses"),
        Sequence(0,"Courses"),
        Sequence(0,"Courses"),
        Sequence(0,"Courses"),
        Sequence(0,"Courses")
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_professor,container,false)




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentMyEventsRv.adapter = sequenceAdapter
        sequenceAdapter.submitList(sequenceList)


        fragmentImageView1.setOnClickListener {
            findNavController().navigate(R.id.goToAddSequence)
        }
    }

    override fun render(appState: AppState) {

    }

    private fun onClickResultEvent(sequence: Sequence) {

    }

    private fun onClickGoToListResultEvent(sequence: Sequence) {

    }

}