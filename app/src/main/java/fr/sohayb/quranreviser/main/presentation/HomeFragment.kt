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
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {
    val surasList = listOf(
        Sura(1,"1. Al-Fatihah (the Opening)",7),
        Sura(2,"2. Al-Baqarah (the Cow)",7),
        Sura(3,"3. Aali Imran (the Family of Imran)",7),
        Sura(4,"4. An-Nisa’ (the Women)",7),
        Sura(5,"5. Al-Ma’idah (the Table)",7),
        Sura(6,"6. Al-An’am (the Cattle)",7),
        Sura(7,"7. Al-A’raf (the Heights)",7),
        Sura(8,"8. Al-Anfal (the Spoils of War)",7),
        Sura(9,"9. At-Taubah (the Repentance)",7),
        Sura(10,"10. Yunus (Yunus)",7),
        Sura(11,"11. Hud (Hud)",7),
        Sura(12,"12. Yusuf (Yusuf)",7),
        Sura(13,"13. Ar-Ra’d (the Thunder)",7),
        Sura(14,"14. Ibrahim (Ibrahim)",7),
        Sura(15,"15. Al-Hijr (the Rocky Tract)",7),
        Sura(16,"16. An-Nahl (the Bees)",7),
        Sura(17,"17. Al-Isra’ (the Night Journey)",7),
        Sura(18,"18. Al-Kahf (the Cave)",7),
        Sura(19,"19. Maryam (Maryam)",7),
        Sura(20,"20. Ta-Ha (Ta-Ha)",7),
        Sura(21,"21. Al-Anbiya’ (the Prophets)",7),
        Sura(22,"22. Al-Haj (the Pilgrimage)",7),
        Sura(23,"23. Al-Mu’minun (the Believers)",7),
        Sura(24,"24. An-Nur (the Light)",7),
        Sura(25,"25. Al-Furqan (the Criterion)",7),
        Sura(26,"26. Ash-Shu’ara’ (the Poets)",7),
        Sura(27,"27. An-Naml (the Ants)",7),
        Sura(28,"28. Al-Qasas (the Stories)",7),
        Sura(29,"29. Al-Ankabut (the Spider)",7),
        Sura(30,"30. Ar-Rum (the Romans)",7),
        Sura(31,"31. Luqman (Luqman)",7),
        Sura(32,"32. As-Sajdah (the Prostration)",7),
        Sura(33,"33. Al-Ahzab (the Combined Forces)",7),
        Sura(34,"34. Saba’ (the Sabeans)",7),
        Sura(35,"35. Al-Fatir (the Originator)",7),
        Sura(36,"36. Ya-Sin (Ya-Sin)",7),
        Sura(37,"37. As-Saffah (Those Ranges in Ranks)",7),
        Sura(38,"38. Sad (Sad)",7),
        Sura(39,"39. Az-Zumar (the Groups)",7),
        Sura(40,"40. Ghafar (the Forgiver)",7),
        Sura(41,"41. Fusilat (Distinguished)",7),
        Sura(42,"42. Ash-Shura (the Consultation)",7),
        Sura(43,"43. Az-Zukhruf (the Gold)",7),
        Sura(44,"44. Ad-Dukhan (the Smoke)",7),
        Sura(45,"45. Al-Jathiyah (the Kneeling)",7),
        Sura(46,"46. Al-Ahqaf (the Valley)",7),
        Sura(47,"47. Muhammad (Muhammad)",7),
        Sura(48,"48. Al-Fat’h (the Victory)",7),
        Sura(49,"49. Al-Hujurat (the Dwellings)",7),
        Sura(50,"50. Qaf (Qaf)",7),
        Sura(51,"51. Adz-Dzariyah (the Scatterers)",7),
        Sura(52,"52. At-Tur (the Mount)",7),
        Sura(53,"53. An-Najm (the Star)",7),
        Sura(54,"54. Al-Qamar (the Moon)",7),
        Sura(55,"55. Ar-Rahman (the Most Gracious)",7),
        Sura(56,"56. Al-Waqi’ah (the Event)",7),
        Sura(57,"57. Al-Hadid (the Iron)",7),
        Sura(58,"58. Al-Mujadilah (the Reasoning)",7),
        Sura(59,"59. Al-Hashr (the Gathering)",7),
        Sura(60,"60. Al-Mumtahanah (the Tested)",7),
        Sura(61,"61. As-Saf (the Row)",7),
        Sura(62,"62. Al-Jum’ah (Friday)",7),
        Sura(63,"63. Al-Munafiqun (the Hypocrites)",7),
        Sura(64,"64. At-Taghabun (the Loss & Gain)",7),
        Sura(65,"65. At-Talaq (the Divorce)",7),
        Sura(66,"66. At-Tahrim (the Prohibition)",7),
        Sura(67,"67. Al-Mulk – (the Kingdom)",7),
        Sura(68,"68. Al-Qalam (the Pen)",7),
        Sura(69,"69. Al-Haqqah (the Inevitable)",7),
        Sura(70,"70. Al-Ma’arij (the Elevated Passages)",7),
        Sura(71,"71. Nuh (Nuh)",7),
        Sura(72,"72. Al-Jinn (the Jinn)",7),
        Sura(73,"73. Al-Muzammil (the Wrapped)",7),
        Sura(74,"74. Al-Mudaththir (the Cloaked)",7),
        Sura(75,"75. Al-Qiyamah (the Resurrection)",7),
        Sura(76,"76. Al-Insan (the Human)",7),
        Sura(77,"77. Al-Mursalat (Those Sent Forth)",7),
        Sura(78,"78. An-Naba’ (the Great News)",7),
        Sura(79,"79. An-Nazi’at (Those Who Pull Out)",7),
        Sura(80,"80. ’Abasa (He Frowned)",7),
        Sura(81,"81. At-Takwir (the Overthrowing)",7),
        Sura(82,"82. Al-Infitar (the Cleaving)",7),
        Sura(83,"83. Al-Mutaffifin (Those Who Deal in Fraud)",7),
        Sura(84,"84. Al-Inshiqaq (the Splitting Asunder)",7),
        Sura(85,"85. Al-Buruj (the Stars)",7),
        Sura(86,"86. At-Tariq (the Nightcomer)",7),
        Sura(87,"87. Al-A’la (the Most High)",7),
        Sura(88,"88. Al-Ghashiyah (the Overwhelming)",7),
        Sura(89,"89. Al-Fajr (the Dawn)",7),
        Sura(90,"90. Al-Balad (the City)",7),
        Sura(91,"91. Ash-Shams (the Sun)",7),
        Sura(92,"92. Al-Layl (the Night)",7),
        Sura(93,"93. Adh-Dhuha (the Forenoon)",7),
        Sura(94,"94. Al-Inshirah (the Opening Forth)",7),
        Sura(95,"95. At-Tin (the Fig)",7),
        Sura(96,"96. Al-’Alaq (the Clot)",7),
        Sura(97,"97. Al-Qadar (the Night of Decree)",7),
        Sura(98,"98. Al-Bayinah (the Proof)",7),
        Sura(99,"99. Az-Zalzalah (the Earthquake)",7),
        Sura(100,"100. Al-’Adiyah (the Runners)",7),
        Sura(101,"101. Al-Qari’ah (the Striking Hour)",7),
        Sura(102,"102. At-Takathur (the Piling Up)",7),
        Sura(103,"103. Al-’Asr (the Time)",7),
        Sura(104,"104. Al-Humazah (the Slanderer)",7),
        Sura(105,"105. Al-Fil (the Elephant)",7),
        Sura(106,"106. Quraish (Quraish)",7),
        Sura(107,"107. Al-Ma’un (the Assistance)",7),
        Sura(108,"108. Al-Kauthar (the River of Abundance)",7),
        Sura(109,"109. Al-Kafirun (the Disbelievers)",7),
        Sura(110,"110. An-Nasr (the Help)",7),
        Sura(111,"111. Al-Masad (the Palm Fiber)",7),
        Sura(112,"112. Al-Ikhlas (the Sincerity)",7),
        Sura(113,"113. Al-Falaq (the Daybreak)",7),
        Sura(114,"114. An-Nas (Mankind)",7)
    )
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
        appState.quranState.currentAyah?.let {
            Toast.makeText(requireContext(), it.ayahText, Toast.LENGTH_SHORT).show()
        }
    }

    private fun onClickResultEvent(sura: Sura) {
        viewModel.dispatch(QuranAction.GetAyahTafseer(1, sura.id, 1))
    }

    private fun onLongClickResultEvent(sura: Sura) {

    }

}