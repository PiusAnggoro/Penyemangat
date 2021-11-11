package id.piusanggoro.penyemangat.data

import id.piusanggoro.penyemangat.R
import id.piusanggoro.penyemangat.model.Afirmasi

/**
 * [Datasource] berisi list array dari data affirmation
 */
class Datasource() {

    //Konten data menggunakan Array List dengan data class Affirmation (model)
    fun loadAfirmasi(): List<Afirmasi> {
        return listOf<Afirmasi>(
                Afirmasi(R.string.affirmation1, R.drawable.image1),
                Afirmasi(R.string.affirmation2, R.drawable.image2),
                Afirmasi(R.string.affirmation3, R.drawable.image3),
                Afirmasi(R.string.affirmation4, R.drawable.image4),
                Afirmasi(R.string.affirmation5, R.drawable.image5),
                Afirmasi(R.string.affirmation6, R.drawable.image6),
                Afirmasi(R.string.affirmation7, R.drawable.image7),
                Afirmasi(R.string.affirmation8, R.drawable.image8),
                Afirmasi(R.string.affirmation9, R.drawable.image9),
                Afirmasi(R.string.affirmation10, R.drawable.image10))
    }
}

