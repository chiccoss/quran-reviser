package fr.sohayb.quranreviser.utils

import fr.sohayb.quranreviser.main.data.Sura

class Constants {
    companion object {
        val surasList = listOf(
            Sura(1,"1. Al-Fatihah (the Opening)",7),
            Sura(2,"2. Al-Baqarah (the Cow)",286),
            Sura(3,"3. Aali Imran (the Family of Imran)",200),
            Sura(4,"4. An-Nisa’ (the Women)",176),
            Sura(5,"5. Al-Ma’idah (the Table)",120),
            Sura(6,"6. Al-An’am (the Cattle)",165),
            Sura(7,"7. Al-A’raf (the Heights)",206),
            Sura(8,"8. Al-Anfal (the Spoils of War)",75),
            Sura(9,"9. At-Taubah (the Repentance)",129),
            Sura(10,"10. Yunus (Yunus)",109),
            Sura(11,"11. Hud (Hud)",123),
            Sura(12,"12. Yusuf (Yusuf)",111),
            Sura(13,"13. Ar-Ra’d (the Thunder)",43),
            Sura(14,"14. Ibrahim (Ibrahim)",52),
            Sura(15,"15. Al-Hijr (the Rocky Tract)",99),
            Sura(16,"16. An-Nahl (the Bees)",128),
            Sura(17,"17. Al-Isra’ (the Night Journey)",111),
            Sura(18,"18. Al-Kahf (the Cave)",110),
            Sura(19,"19. Maryam (Maryam)",98),
            Sura(20,"20. Ta-Ha (Ta-Ha)",135),
            Sura(21,"21. Al-Anbiya’ (the Prophets)",112),
            Sura(22,"22. Al-Haj (the Pilgrimage)",78),
            Sura(23,"23. Al-Mu’minun (the Believers)",118),
            Sura(24,"24. An-Nur (the Light)",64),
            Sura(25,"25. Al-Furqan (the Criterion)",77),
            Sura(26,"26. Ash-Shu’ara’ (the Poets)",227),
            Sura(27,"27. An-Naml (the Ants)",93),
            Sura(28,"28. Al-Qasas (the Stories)",88),
            Sura(29,"29. Al-Ankabut (the Spider)",69),
            Sura(30,"30. Ar-Rum (the Romans)",60),
            Sura(31,"31. Luqman (Luqman)",34),
            Sura(32,"32. As-Sajdah (the Prostration)",30),
            Sura(33,"33. Al-Ahzab (the Combined Forces)",73),
            Sura(34,"34. Saba’ (the Sabeans)",54),
            Sura(35,"35. Al-Fatir (the Originator)",45),
            Sura(36,"36. Ya-Sin (Ya-Sin)",83),
            Sura(37,"37. As-Saffah (Those Ranges in Ranks)",182),
            Sura(38,"38. Sad (Sad)",88),
            Sura(39,"39. Az-Zumar (the Groups)",75),
            Sura(40,"40. Ghafar (the Forgiver)",85),
            Sura(41,"41. Fusilat (Distinguished)",54),
            Sura(42,"42. Ash-Shura (the Consultation)",53),
            Sura(43,"43. Az-Zukhruf (the Gold)",89),
            Sura(44,"44. Ad-Dukhan (the Smoke)",59),
            Sura(45,"45. Al-Jathiyah (the Kneeling)",37),
            Sura(46,"46. Al-Ahqaf (the Valley)",35),
            Sura(47,"47. Muhammad (Muhammad)",38),
            Sura(48,"48. Al-Fat’h (the Victory)",29),
            Sura(49,"49. Al-Hujurat (the Dwellings)",18),
            Sura(50,"50. Qaf (Qaf)",45),
            Sura(51,"51. Adz-Dzariyah (the Scatterers)",60),
            Sura(52,"52. At-Tur (the Mount)",49),
            Sura(53,"53. An-Najm (the Star)",62),
            Sura(54,"54. Al-Qamar (the Moon)",55),
            Sura(55,"55. Ar-Rahman (the Most Gracious)",78),
            Sura(56,"56. Al-Waqi’ah (the Event)",96),
            Sura(57,"57. Al-Hadid (the Iron)",29),
            Sura(58,"58. Al-Mujadilah (the Reasoning)",22),
            Sura(59,"59. Al-Hashr (the Gathering)",24),
            Sura(60,"60. Al-Mumtahanah (the Tested)",13),
            Sura(61,"61. As-Saf (the Row)",14),
            Sura(62,"62. Al-Jum’ah (Friday)",11),
            Sura(63,"63. Al-Munafiqun (the Hypocrites)",11),
            Sura(64,"64. At-Taghabun (the Loss & Gain)",18),
            Sura(65,"65. At-Talaq (the Divorce)",12),
            Sura(66,"66. At-Tahrim (the Prohibition)",12),
            Sura(67,"67. Al-Mulk – (the Kingdom)",30),
            Sura(68,"68. Al-Qalam (the Pen)",52),
            Sura(69,"69. Al-Haqqah (the Inevitable)",52),
            Sura(70,"70. Al-Ma’arij (the Elevated Passages)",44),
            Sura(71,"71. Nuh (Nuh)",28),
            Sura(72,"72. Al-Jinn (the Jinn)",28),
            Sura(73,"73. Al-Muzammil (the Wrapped)",20),
            Sura(74,"74. Al-Mudaththir (the Cloaked)",56),
            Sura(75,"75. Al-Qiyamah (the Resurrection)",40),
            Sura(76,"76. Al-Insan (the Human)",31),
            Sura(77,"77. Al-Mursalat (Those Sent Forth)",50),
            Sura(78,"78. An-Naba’ (the Great News)",40),
            Sura(79,"79. An-Nazi’at (Those Who Pull Out)",46),
            Sura(80,"80. ’Abasa (He Frowned)",42),
            Sura(81,"81. At-Takwir (the Overthrowing)",29),
            Sura(82,"82. Al-Infitar (the Cleaving)",19),
            Sura(83,"83. Al-Mutaffifin (Those Who Deal in Fraud)",36),
            Sura(84,"84. Al-Inshiqaq (the Splitting Asunder)",25),
            Sura(85,"85. Al-Buruj (the Stars)",22),
            Sura(86,"86. At-Tariq (the Nightcomer)",17),
            Sura(87,"87. Al-A’la (the Most High)",19),
            Sura(88,"88. Al-Ghashiyah (the Overwhelming)",26),
            Sura(89,"89. Al-Fajr (the Dawn)",30),
            Sura(90,"90. Al-Balad (the City)",20),
            Sura(91,"91. Ash-Shams (the Sun)",15),
            Sura(92,"92. Al-Layl (the Night)",21),
            Sura(93,"93. Adh-Dhuha (the Forenoon)",11),
            Sura(94,"94. Al-Inshirah (the Opening Forth)",8),
            Sura(95,"95. At-Tin (the Fig)",8),
            Sura(96,"96. Al-’Alaq (the Clot)",19),
            Sura(97,"97. Al-Qadar (the Night of Decree)",5),
            Sura(98,"98. Al-Bayinah (the Proof)",8),
            Sura(99,"99. Az-Zalzalah (the Earthquake)",8),
            Sura(100,"100. Al-’Adiyah (the Runners)",11),
            Sura(101,"101. Al-Qari’ah (the Striking Hour)",11),
            Sura(102,"102. At-Takathur (the Piling Up)",8),
            Sura(103,"103. Al-’Asr (the Time)",3),
            Sura(104,"104. Al-Humazah (the Slanderer)",9),
            Sura(105,"105. Al-Fil (the Elephant)",5),
            Sura(106,"106. Quraish (Quraish)",4),
            Sura(107,"107. Al-Ma’un (the Assistance)",7),
            Sura(108,"108. Al-Kauthar (the River of Abundance)",3),
            Sura(109,"109. Al-Kafirun (the Disbelievers)",6),
            Sura(110,"110. An-Nasr (the Help)",3),
            Sura(111,"111. Al-Masad (the Palm Fiber)",5),
            Sura(112,"112. Al-Ikhlas (the Sincerity)",4),
            Sura(113,"113. Al-Falaq (the Daybreak)",5),
            Sura(114,"114. An-Nas (Mankind)",6)
        )
/*
val tafseerList =
        {
            "id": 1,
            "name": "التفسير الميسر",
            "language": "ar",
            "author": "نخبة من العلماء",
            "book_name": "التفسير الميسر"
        },
        {
            "id": 2,
            "name": "تفسير الجلالين",
            "language": "ar",
            "author": "جلال الدين المحلي و السيوطي",
            "book_name": "تفسير الجلالين"
        },
        {
            "id": 3,
            "name": "تفسير السعدي",
            "language": "ar",
            "author": "عبد الرحمن بن ناصر بن عبد الله السعدي التميمي مفسر",
            "book_name": "تيسير الكريم الرحمن في تفسير كلام المنان"
        },
        {
            "id": 4,
            "name": "تفسير ابن كثير",
            "language": "ar",
            "author": "عماد الدين أبي الفداء إسماعيل بن كثير القرشي",
            "book_name": "تفسير القرآن العظيم"
        },
        {
            "id": 5,
            "name": "تفسير الوسيط لطنطاوي",
            "language": "ar",
            "author": "محمد سيد طنطاوي",
            "book_name": "التفسير الوسيط للقرآن الكريم"
        },
        {
            "id": 6,
            "name": "تفسير البغوي",
            "language": "ar",
            "author": "الحسين بن مسعود البغوي أبو محمد",
            "book_name": "معالم التنزيل"
        },
        {
            "id": 7,
            "name": "تفسير القرطبي",
            "language": "ar",
            "author": "أبو عبد الله محمد بن أحمد الأنصاري القرطبي",
            "book_name": "الجامع لأحكام القرآن"
        },
        {
            "id": 8,
            "name": "تفسير الطبري",
            "language": "ar",
            "author": "الإمام أبو جعفر الطبري",
            "book_name": "جامع البيان في تأويل القرآن"
        },
        {
            "id": 9,
            "name": "Arberry",
            "language": "en",
            "author": "A. J. Arberry",
            "book_name": "The Koran Interpreted"
        },
        {
            "id": 10,
            "name": "Yusuf Ali",
            "language": "en",
            "author": "Abdullah Yusuf Ali",
            "book_name": "The Meaning of the Glorious Koran"
        },
        {
            "id": 11,
            "name": "Keyzer",
            "language": "nl",
            "author": "Salomo Keyzer",
            "book_name": "De Koran, voorafgegaan door het leven van Mahomet"
        },
        {
            "id": 12,
            "name": "Leemhuis",
            "language": "nl",
            "author": "Fred Leemhuis",
            "book_name": "De Koran: Een weergave van de betekenis van de Ara"
        },
        {
            "id": 13,
            "name": "Siregar",
            "language": "nl",
            "author": "Sofian S. Siregar",
            "book_name": "De Edele Koran, en een vertaling van betekenissen"
        }
        ]
*/
        val FROM_TEST_FRAGMENT = 200
        val FROM_TAFSEER_FRAGMENT = 300
    }


}