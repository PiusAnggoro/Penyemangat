package id.piusanggoro.penyemangat.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * [Afirmasi] adalah class data yang merepresentasikan tipe data: string dan drawable
 */
// data class gabungan dari tipe data String dan Drawable
data class Afirmasi(
        @StringRes val stringResourceId: Int,
        @DrawableRes val imageResourceId: Int
)