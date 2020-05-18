package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    private var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun leagueNextClicked(view: View) {
        if (player.league.isNotEmpty()) {
            val skillActivity = Intent(this, SkillActivity::class.java).also {
                it.putExtra(EXTRA_PLAYER, player)
            }
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select your league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMenClicked(view: View) {
        womenLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "men"
    }

    fun onWomenClicked(view: View) {
        menLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "women"
    }

    fun onCoedClicked(view: View) {
        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false
        player.league = "coed"
    }
}
