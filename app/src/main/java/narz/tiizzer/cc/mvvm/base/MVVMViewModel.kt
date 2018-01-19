package narz.tiizzer.cc.mvvm.base

/**
 * Created by narztiizzer on 19/1/2018 AD.
 */
class MVVMViewModel: BaseViewModel() {
    var _id: Int = 0

    override fun onStart() {
        load()
    }

    override fun onResume() {

    }

    override fun onPause() {

    }

    override fun onStop() {

    }

    override fun onDestroy() {

    }

    fun load(){
        _id = 10

    }
}