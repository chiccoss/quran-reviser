package fr.sohayb.quranreviser.main.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.app.models.Surah
import fr.sohayb.quranreviser.base.presentation.BaseFragment
import fr.sohayb.quranreviser.main.adapter.QuranAdapter
import fr.sohayb.quranreviser.main.adapter.SurahAdapter
import fr.sohayb.quranreviser.main.data.Sura
import fr.sohayb.quranreviser.main.domain.QuranAction
import fr.sohayb.quranreviser.utils.Constants.Companion.surasList
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    val sequenceAdapter = QuranAdapter(::onClickResultEvent, ::onLongClickResultEvent)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_home, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.dispatch(QuranAction.GetQuran)
        fragmentHomeQuranListRv.adapter = sequenceAdapter
        //

        /*fragmentImageView1.setOnClickListener {
            findNavController().navigate(R.id.goToAddSequence)
        }*/
    }


    override fun render(appState: AppState) {
        progressBarHomeQuran.isVisible = appState.quranState.isLoading
        appState.quranState.quran.consume()?.let {
            Log.e("tag",it.toString())
            sequenceAdapter.submitList(it.data.surahs)
        }

        appState.quranState.ayahTafseer?.let {
            //Toast.makeText(requireContext(), it.ayahText, Toast.LENGTH_SHORT).show()
        }
    }

    private fun onClickResultEvent(sura: Surah) {
        HomeFragmentDirections.goToShowSurahFragment(sura).also {
            findNavController().navigate(it)
        }
        //viewModel.dispatch(QuranAction.GetAyahTafseer(1, sura.id, 1))
    }

    private fun onLongClickResultEvent(sura: Surah) {

    }

}