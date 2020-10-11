package fr.sohayb.quranreviser.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.app.models.Sequence
import fr.sohayb.quranreviser.base.presentation.BaseFragment
import fr.sohayb.quranreviser.main.adapter.SuraAdapter
import fr.sohayb.quranreviser.main.adapter.TafseerAdapter
import fr.sohayb.quranreviser.main.data.Sura
import fr.sohayb.quranreviser.main.domain.QuranAction
import fr.sohayb.quranreviser.utils.Constants.Companion.surasList
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    val sequenceAdapter = SuraAdapter(::onClickResultEvent, ::onLongClickResultEvent)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_home, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentHomeQuranListRv.adapter = sequenceAdapter
        sequenceAdapter.submitList(surasList)
        //

        /*fragmentImageView1.setOnClickListener {
            findNavController().navigate(R.id.goToAddSequence)
        }*/
    }


    override fun render(appState: AppState) {
        appState.quranState.ayahTafseer?.let {
            //Toast.makeText(requireContext(), it.ayahText, Toast.LENGTH_SHORT).show()
        }
    }

    private fun onClickResultEvent(sura: Sura) {
        viewModel.dispatch(QuranAction.GetAyahTafseer(1, sura.id, 1))
    }

    private fun onLongClickResultEvent(sura: Sura) {

    }

}