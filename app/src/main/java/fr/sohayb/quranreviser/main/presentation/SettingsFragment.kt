package fr.sohayb.quranreviser.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.app.models.Sequence
import fr.sohayb.quranreviser.base.presentation.BaseFragment
import fr.sohayb.quranreviser.main.adapter.TafseerAdapter
import fr.sohayb.quranreviser.main.domain.QuranAction
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : BaseFragment() {


    val sequenceAdapter = TafseerAdapter(::onClickResultEvent, ::onClickGoToListResultEvent)

    val sequenceList = listOf(
        Sequence(0, "Courses"),
        Sequence(0, "Courses"),
        Sequence(0, "Courses"),
        Sequence(0, "Courses"),
        Sequence(0, "Courses"),
        Sequence(0, "Courses")
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_settings, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.dispatch(QuranAction.GetAyahTafseer(1, 2, 2))

        /*fragmentImageView1.setOnClickListener {
            findNavController().navigate(R.id.goToAddSequence)
        }*/

        val options = listOf(
            "(ar) التفسير الميسر",
            "(ar) تفسير الجلالين",
            "تفسير السعدي(ar) ",
            "(ar) تفسير ابن كثير",
            "تفسير الوسيط لطنطاوي(ar) ",
            "(ar) تفسير البغوي",
            "(ar) تفسير القرطبي",
            "(ar) تفسير الطبري",
            "(en) Arberry",
            "(en) Yusuf Ali",
            "(nl) Keyzer",
            "(nl) Leemhuis",
            "(nl) Siregar"
        )


        val adapter = ArrayAdapter(requireContext(), R.layout.dropdown_menu_popup_item, options)
        fragmentTafseerEditText.setAdapter(adapter)

        fragmentCreateVorutton.setOnClickListener{
            findNavController().navigate(R.id.navigation_home)
        }
    }


    override fun render(appState: AppState) {
        appState.quranState.currentAyah?.let {

            //Toast.makeText(requireContext(), it.ayahText, Toast.LENGTH_LONG).show()
        }
    }

    private fun onClickResultEvent(sequence: Sequence) {

    }

    private fun onClickGoToListResultEvent(sequence: Sequence) {

    }

}