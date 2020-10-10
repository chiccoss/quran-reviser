package fr.sohayb.quranreviser.app.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.base.presentation.BaseActivity
import fr.sohayb.quranreviser.main.domain.QuranAction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), NavController.OnDestinationChangedListener {


    lateinit var navController: NavController

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, MainActivity::class.java)
            ContextCompat.startActivity(context, intent, null)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //viewModel.dispatch(QuranAction.GetAyahTafseer(1, 2, 2))
        setupNavigation()
    }

    override fun render(appState: AppState) {
        appState.quranState.currentAyah?.let {
            //Toast.makeText(this,it.ayahText,Toast.LENGTH_LONG).show()
        }
    }

    private fun setupNavigation() {
        navController = findNavController(R.id.activityMainNavHostFragment)
        activityMainBottomNavView.apply {
            setupWithNavController(navController)
            setOnNavigationItemReselectedListener { }
        }
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        when(destination.id){
            R.id.navigation_home,R.id.navigation_settings,R.id.navigation_tafseer -> {
                activityMainBottomNavView.visibility = View.VISIBLE
            }
            else -> {
                activityMainBottomNavView.visibility = View.GONE
            }
        }
    }

    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(this)
    }

    override fun onPause() {
        super.onPause()
        navController.removeOnDestinationChangedListener(this)
    }
}
