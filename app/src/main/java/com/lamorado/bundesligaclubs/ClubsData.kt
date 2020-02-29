package com.lamorado.bundesligaclubs

object ClubsData {
    private val clubNames = arrayOf(
        "FC Bayern Munich",
        "RB Leipzig",
        "Borussia Dortmund",
        "Borussia Mönchengladbach",
        "Bayer Leverkusen",
        "Schalke 04",
        "Vfl Wolfsburg",
        "TSG 1899 Hoffenheim",
        "Freiburg",
        "Union Berlin",
        "Eintracht Frankfurt",
        "Augsburg",
        "Koln",
        "Hertha Berlin",
        "Mainz 05",
        "Fortuna Düsseldorf",
        "Werder Bremen",
        "SC Paderborn"
    )

    private val clubDetails = arrayOf(
        "Fußball-Club Bayern München e.V., juga dikenal sebagai FC Bayern München, FC Bayern Munich, atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bavaria. Hal ini terkenal karena tim sepak bola profesional, yang bermain di Bundesliga, peringkat teratas sistem liga sepak bola Jerman, dan merupakan klub paling sukses dalam sejarah sepak bola Jerman, setelah memenangkan rekor 29 gelar nasional dan 19 piala nasional.",
        "RasenBallsport Leipzig e.V., umumnya diketahui sebagai RB Leipzig, adalah klub sepak bola Jerman yang berbasis di Leipzig, Saxony. Klub ini ditemukan pada tahun 2009 oleh inisiatif pembuat minuman energi Red Bull GmbH yang membeli hak tim divisi kelima, SSV Markranstädt dengan maksud untuk memajukan klub baru ke divisi liga besar, Bundesliga dalam 8 tahun. Sepak Bola profesional dijalankan oleh organisasi spin-off RasenballSport Leipzig GmbH. RB Leipzig memainkan pertandingan kandang mereka di Red Bull Arena.",
        "Ballspielverein Borussia 09 e.V. Dortmund umumnya dikenal sebagai Borussia Dortmund atau BVB, adalah klub olahraga Jerman yang berbasis di Dortmund, Rhine-Westphalia Utara. Didirikan pada tahun 1909 oleh delapan belas pemain sepak bola dari Dortmund, tim sepak bola bagian dari sebuah klub olahraga berbasis keanggotaan besar dengan lebih dari 145.000 anggota, membuat BVB klub olahraga dengan keanggotaan terbesar kedua di Jerman. Dortmund bermain di Bundesliga, tingkat teratas sistem liga sepakbola Jerman.",
        "Borussia VfL 1900 Mönchengladbach e.V., dikenal sebagai Borussia Mönchengladbach, adalah klub sepak bola Jerman yang bermarkas di kota Mönchengladbach. Masa keemasan dari klub ini adalah dekade tahun 1970-an di mana mereka memenangi 5 gelar Bundesliga dan 2 gelar Piala UEFA. Setelah itu prestasi mereka menurun dan sempat merasakan pentas divisi dua liga Jerman.",
        "Bayer 04 Leverkusen, juga sebagai Bayer Leverkusen, Leverkusen atau hanya Bayer, adalah tim sepak bola Jerman yang berbasis di kota Leverkusen, Westphalia. Bayer Leverkusen didirikan pada tanggal 1 Juli 1904, bisa dikenal dengan nama TSV Bayer 04 Leverkusen, sebuah klub olah raga yang berpestasi di bidang atletik, gimnastik, basket dan lain-lain. Bayer Leverkusen menggunakan stadion Bay Arena di kota Leverkusen sebagai kandangnya yang memiliki kapasitas tempat duduk sebanyak 30.210 tempat duduk.",
        "Fußballclub Gelsenkirchen-Schalke 04 e. V., juga dikenal sebagai FC Schalke 04, merupakan sebuah tim sepak bola Jerman bermarkas di Gelsenkirchen, sebuah kota pertambangan di Jerman. Bermain di divisi Bundesliga 1. Klub ini mempunyai cabang-cabang olahraga, tetapi yang paling terkenal adalah sepak bola. Didirikan pada tahun 1904 dengan nama Westfalia Sachalke. Schalke 04 memenangkan kejuaraan level Eropa pertamanya pada tahun 1997 dengan mengalahkan Inter Milan melalui adu penalti pada Piala UEFA di kota Milan. ",
        "VfL Wolfsburg adalah klub sepak bola Jerman yang berbasis di kota Wolfsburg. Pada awalnya klub ini tumbuh dari sebuah klub multi-olahraga bagi para pekerja Volkswagen dan merupakan anak perusahaan yang sepenuhnya dimiliki oleh Grup Volkswagen. Pada musim kompetisi 2008-09 untuk pertama kalinya Wolfsburg menjadi juara di Bundesliga.",
        "Turn-und Sportgemeinschaft 1899 Hoffenheim e.V. merupakan sebuah tim sepak bola Jerman yang bermain di divisi utama Bundesliga. Didirikan pada tahun 1899. Bermarkas di Hoffenheim. Klub ini memainkan pertandingan kandangnya di Rhein-Neckar-Arena yang berkapasitas 30.000 penonton. Seragam mereka berwarna biru.",
        "Sport-Club Freiburg atau SC Freiburg merupakan sebuah tim sepak bola Jerman yang bermain di Bundesliga. Didirikan pada tahun 1904 sebagai Freiburger Fußballverein 04. Bermarkas di Freiburg. Klub ini memainkan pertandingan kandangnya di Dreimsamstadion yang berkapasitas 25.000 penonton. Seragam mereka berwarna merah.",
        "FC Union Berlin merupakan sebuah tim sepak bola Jerman yang bermain di divisi 1 Bundesliga. Didirikan pada tahun 1906. Berbasis di Berlin. Klub ini memainkan pertandingan kandangnya di Alte Försterei yang berkapasitas 18.100 penonton. Seragam mereka berwarna merah. ",
        "Eintracht Frankfurt e.V. adalah sebuah tim sepak bola Jerman. Berbasis di Frankfurt am Main. Tim ini didirikan tahun 1899.",
        "Fußball-Club Augsburg 1907 e. V., dikenal sebagai FC Augsburg, merupakan sebuah tim sepak bola Jerman yang bermain di divisi utama Bundesliga. Didirikan pada tahun 1907. Berbasis di Augsburg. Klub ini memainkan pertandingan kandangnya di SGL arena yang berkapasitas 30.660 penonton. Seragam mereka berwarna putih. ",
        "FC Koln adalah klub sepak bola Jerman yang berbasis di kota Koln. pembentukan klub adalah hasil merger dari klub Kölner Ballspiel-Club 1901 dan klub SpVgg Sülz 07. Klub ini secara prestasi sudah memiliki beberapa prestasi membanggakan dalam persepak bolaan Jerman.",
        "Hertha BSC adalah klub sepak bola Jerman yang berbasis di kota Berlin.",
        "FSV Mainz 05 adalah klub sepak bola di Jerman berbasis di kota Mainz. Selama berkompetisi di liga profesional Jerman belum ada prestasi prestisius yang pernah diraih oleh klub ini.",
        "Düsseldorfer Turn- und Sportverein Fortuna 1895 e.V. merupakan sebuah tim sepak bola Jerman yang bermain di divisi satu Bundesliga. Didirikan pada tanggal 5 Mei 1895. Berbasis di Düsseldorf. Klub ini memainkan pertandingan kandangnya di Esprit Arena yang berkapasitas 51.500 penonton. Seragam mereka berwarna merah.",
        "Werder Bremen adalah klub sepak bola yang berbasis di kota Bremen di Jerman. Werder Bremen adalah klub sepak bola yang disegani di Jerman kompetisi Bundesliga saat ini dengan permainan sepak bola aktraktif dan menyerang. Di Jerman Werder Bremen adalah tim sepak bola yang banyak menghasilkan gol ke gawang lawan dalam satu musim. Werder Bremen pernah meraih sukses di eropa, ketika meraih Piala Winners Eropa tahun 92. Di mana di final mereka mengalahkan AS Monaco 2-0 melalui gol Klaus Allofs dan Wynton Rufer. Di edisi terakhir Piala Eropa tahun 2009 Bremen sukses mencapai final di mana mereka bertemu tim Ukraina Shakhtar Donetsk. Bremen Kalah melalui perpanjangan waktu, dengan hasil akhir 2-1. ",
        "Sport-Club Paderborn 07 e.V., biasa disingkat dengan SC Paderborn 07 atau SC Paderborn, adalah klub sepak bola Jerman yang saat ini bermain di Bundesliga. Klub ini bermukim di Paderborn, Paderborn, Nordrhein-Westfalen."
    )

    private val clubBornDates = arrayOf(
        "27 Februari 1900",
        "19 Mei 2009",
        "19 Desember 1909",
        "1 Agustus 1900",
        "1 Juli 1904",
        "4 Mei 1904",
        "12 September 1945",
        "1 Juli 1899",
        "30 Mei 1904",
        "1906/1966",
        "8 Maret 1899",
        "8 Agustus 1907",
        "13 February 1948",
        "25 Juli 1892",
        "27 Maret 1905",
        "5 Mei 1895",
        "4 Februari 1899",
        "1907"
    )

    private val clubCoach = arrayOf(
        "Hans-Dieter Flick",
        "Julian Nagelsmann",
        "Lucian Favre",
        "Marco Rose",
        "Peter Bosz",
        "David Wagner",
        "Oliver Glasner",
        "Alfred Schreuder",
        "Christian Streich",
        "Uwe Neuhaus",
        "Adi Hütter",
        "Markus Weinzierl",
        "Markus Gisdol",
        "Alexander Nouri",
        "Kasper Hjulmand",
        "Mike Büskens",
        "Robin Dutt",
        "Steffen Baumgart"
    )

    private val clubImages = intArrayOf(
        R.drawable.bayern,
        R.drawable.leipzig,
        R.drawable.dortmund,
        R.drawable.monchengladbach,
        R.drawable.leverkusen,
        R.drawable.schalke,
        R.drawable.wolfsburg,
        R.drawable.hoffenheim,
        R.drawable.freiburg,
        R.drawable.unionberlin,
        R.drawable.frankfurt,
        R.drawable.augsburg,
        R.drawable.koln,
        R.drawable.herthaberlin,
        R.drawable.mainz,
        R.drawable.fortuna,
        R.drawable.bremen,
        R.drawable.paderborn
    )

    val listData: ArrayList<Club>
        get() {
            val list = arrayListOf<Club>()
            for (position in clubNames.indices) {
                val club = Club()
                club.name = clubNames[position]
                club.detail = clubDetails[position]
                club.club_born_date = clubBornDates[position]
                club.club_coach = clubCoach[position]
                club.photo = clubImages[position]
                list.add(club)
            }
            return list
        }
}