package narz.tiizzer.cc.mvvm.base

import android.databinding.ObservableInt
import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by narztiizzer on 19/1/2018 AD.
 */
abstract class BaseViewModel : Observable() {
    abstract fun onStart()
    abstract fun onResume()
    abstract fun onPause()
    abstract fun onStop()
    abstract fun onDestroy()
}