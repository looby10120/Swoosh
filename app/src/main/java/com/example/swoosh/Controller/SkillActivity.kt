package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Model.Player
import com.example.swoosh.R
import com.example.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false

        player.skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false

        player.skill = "baller"
    }

    fun onSkillFinishClicked(view: View) {
        if (player.skill.isNotEmpty()) {
            val finishActivity = Intent(this, FinishActivity::class.java).also {
                it.putExtra(EXTRA_PLAYER, player)
            }
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select your skill level.", Toast.LENGTH_SHORT).show()
        }
    }

}
