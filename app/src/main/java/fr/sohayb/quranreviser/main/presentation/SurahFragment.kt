package fr.sohayb.quranreviser.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.app.models.Ayah
import fr.sohayb.quranreviser.app.models.Surah
import fr.sohayb.quranreviser.base.presentation.BaseFragment
import fr.sohayb.quranreviser.main.adapter.QuranAdapter
import fr.sohayb.quranreviser.main.adapter.SurahAdapter
import fr.sohayb.quranreviser.main.domain.QuranAction
import kotlinx.android.synthetic.main.fragment_surah.*
import kotlinx.android.synthetic.main.fragment_suras_tafseer.*
import kotlinx.android.synthetic.main.fragment_suras_tafseer.fragmentTafseerQuranListRv

class SurahFragment : BaseFragment() {

    val sequenceAdapter = SurahAdapter(::onClickResultEvent, ::onLongClickResultEvent)
    val args : SurahFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_surah, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //viewModel.dispatch(QuranAction.GetS)

        fragmentSurahQuranListRv.adapter = sequenceAdapter
        sequenceAdapter.submitList(args.sura.ayahs)

        //

        /*fragmentImageView1.setOnClickListener {
            findNavController().navigate(R.id.goToAddSequence)
        }*/
    }


    override fun render(appState: AppState) {
       /* appState.quranState.surah.consume()?.let {
            sequenceAdapter.submitList(it.data.surahs)
        }*/
        appState.quranState.ayahTafseer?.let {
            //Toast.makeText(requireContext(), it.ayahText, Toast.LENGTH_SHORT).show()
        }
    }

    private fun onClickResultEvent(ayah: Ayah) {
      //  viewModel.dispatch(QuranAction.GetAyahTafseer(1, sura.id, 1))

       // AyahTafseerActivity.start(context = requireContext(),activity = requireActivity(),surat = sura)


    }

    private fun onLongClickResultEvent(ayah: Ayah) {

    }

}