package fr.sohayb.quranreviser.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.base.presentation.BaseFragment
import fr.sohayb.quranreviser.main.adapter.TafseerAdapter
import fr.sohayb.quranreviser.app.models.Sequence
import fr.sohayb.quranreviser.main.domain.QuranAction
import kotlinx.android.synthetic.main.fragment_professor.*

class ProfessorFragment : BaseFragment() {


    val sequenceAdapter = TafseerAdapter(::onClickResultEvent, ::onClickGoToListResultEvent)

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
        viewModel.dispatch(QuranAction.GetAyahTafseer(1, 2, 2))

        fragmentImageView1.setOnClickListener {
            findNavController().navigate(R.id.goToAddSequence)
        }
    }

    override fun render(appState: AppState) {
        appState.quranState.currentAyah?.let {
            Toast.makeText(requireContext(),it.ayahText, Toast.LENGTH_LONG).show()
        }
    }

    private fun onClickResultEvent(sequence: Sequence) {

    }

    private fun onClickGoToListResultEvent(sequence: Sequence) {

    }

}