package id.piusanggoro.penyemangat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import id.piusanggoro.penyemangat.adapter.ItemAdapter
import id.piusanggoro.penyemangat.data.Datasource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mengakses tampilan untuk layout utama
        setContentView(R.layout.activity_main)

        //mengambil sumber data dari class Datasource
        val myDataset = Datasource().loadAfirmasi()

        //mengkoneksikan layout utama dengan recyclerview
        val recyclerView: RecyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        //mengkonfigurasi adapater pada recyclerview dengan data melalui class ItemAdapter
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}