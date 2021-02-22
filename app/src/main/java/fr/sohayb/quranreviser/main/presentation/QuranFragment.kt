package fr.sohayb.quranreviser.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.app.models.Surah
import fr.sohayb.quranreviser.base.presentation.BaseFragment
import fr.sohayb.quranreviser.main.adapter.QuranAdapter
import fr.sohayb.quranreviser.main.domain.QuranAction
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_suras_tafseer.*

class QuranFragment : BaseFragment() {

    val sequenceAdapter = QuranAdapter(::onClickResultEvent, ::onLongClickResultEvent)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_suras_tafseer, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.dispatch(QuranAction.GetQuran)

        fragmentTafseerQuranListRv.adapter = sequenceAdapter


        //

        /*fragmentImageView1.setOnClickListener {
            findNavController().navigate(R.id.goToAddSequence)
        }*/
    }


    override fun render(appState: AppState) {
        appState.quranState.quran.consume()?.let {
            sequenceAdapter.submitList(it.data.surahs)
            progressBarHomeQuran.visibility = GONE

        }
        appState.quranState.ayahTafseer?.let {
            //Toast.makeText(requireContext(), it.ayahText, Toast.LENGTH_SHORT).show()
        }
    }

    private fun onClickResultEvent(sura: Surah) {
      //  viewModel.dispatch(QuranAction.GetAyahTafseer(1, sura.id, 1))
        QuranFragmentDirections.goToShowSurahFragment(sura).also {
            findNavController().navigate(it)
        }
       // AyahTafseerActivity.start(context = requireContext(),activity = requireActivity(),surat = sura)

    }

    private fun onLongClickResultEvent(sura: Surah) {

    }

}