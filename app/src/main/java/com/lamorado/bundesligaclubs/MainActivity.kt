package com.lamorado.bundesligaclubs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lamorado.bundesligaclubs.DetailActivity.Companion.BORN
import com.lamorado.bundesligaclubs.DetailActivity.Companion.COACH
import com.lamorado.bundesligaclubs.DetailActivity.Companion.DETAIL
import com.lamorado.bundesligaclubs.DetailActivity.Companion.NAME
import com.lamorado.bundesligaclubs.DetailActivity.Companion.PHOTO
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_row_club.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvClubs: RecyclerView
    private var list: ArrayList<Club> = arrayListOf()
    private var title: String = "Bundesliga Clubs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvClubs = findViewById(R.id.rv_clubs)
        rvClubs.setHasFixedSize(true)

        list.addAll(ClubsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvClubs.layoutManager = LinearLayoutManager(this)
        val listClubAdapter = ListClubAdapter(list)
        rvClubs.adapter = listClubAdapter

        listClubAdapter.setOnItemClickCallback(object : ListClubAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Club) {
                showSelectedClub(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showSelectedClub(club: Club) {
        title = "Informasi Club"
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(NAME, club.name)
        intent.putExtra(DETAIL, club.detail)
        intent.putExtra(COACH, club.club_coach)
        intent.putExtra(BORN, club.club_born_date)
        intent.putExtra(PHOTO, club.photo)
        startActivity(intent)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode) {
            R.id.about_menu -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
