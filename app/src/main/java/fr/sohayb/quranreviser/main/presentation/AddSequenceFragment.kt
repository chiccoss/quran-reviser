package fr.sohayb.quranreviser.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.base.presentation.BaseFragment
import fr.sohayb.quranreviser.app.models.SequenceItem
import fr.sohayb.quranreviser.main.adapter.SequenceItemAdapter
import kotlinx.android.synthetic.main.fragment_ajout_sequence.*


class AddSequenceFragment : BaseFragment() {


    val sequenceAdapter = SequenceItemAdapter(::onClickResultEvent)

    val sequenceList = listOf(
        SequenceItem(0,"Courses",5),
        SequenceItem(0,"Courses",5),
        SequenceItem(0,"Courses",5),
        SequenceItem(0,"Courses",5),
        SequenceItem(0,"Courses",5),
        SequenceItem(0,"Courses",5)
    )
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_ajout_sequence,container,false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentAddSequenceItemsRv.adapter = sequenceAdapter
        sequenceAdapter.submitList(sequenceList)

        fragmentAjoutSequenceTv.setOnClickListener {
            findNavController().navigate(R.id.goToAddSequenceItem)
        }

        ajoutSequenceBackButton.setOnClickListener {
            findNavController().popBackStack()
        }

    }

    override fun render(appState: AppState) {

    }

    private fun onClickResultEvent(sequence: SequenceItem) {

    }



}