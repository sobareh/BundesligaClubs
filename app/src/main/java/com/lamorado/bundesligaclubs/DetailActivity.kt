package com.lamorado.bundesligaclubs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        val NAME = "name"
        val DETAIL = "detail"
        val COACH = "coach"
        val BORN = "born"
        val PHOTO = "photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.tv_club_name)
        val tvBorn: TextView = findViewById(R.id.tv_born_date)
        val tvCoach: TextView = findViewById(R.id.tv_coach_club)
        val tvDetail: TextView = findViewById(R.id.tv_detail_club)
        val imageClub: ImageView = findViewById(R.id.image_club)

        val name: String = intent.getStringExtra(NAME)
        val detail: String = intent.getStringExtra(DETAIL)
        val coach: String = intent.getStringExtra(COACH)
        val born: String = intent.getStringExtra(BORN)
        val gambar: Int = intent.getIntExtra(PHOTO, 0)

//      imageClub.setImageResource(gambar)
        Glide.with(this)
            .load(gambar)
            .into(imageClub)

        tvName.text = name
        tvDetail.text = detail
        tvCoach.text = coach
        tvBorn.text = born

        val title = name
        setActionBarTitle(title)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }

}
