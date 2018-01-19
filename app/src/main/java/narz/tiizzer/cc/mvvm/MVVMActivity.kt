package narz.tiizzer.cc.mvvm

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import kotlinx.android.synthetic.main.mvvm_activity.*
import narz.tiizzer.cc.mvvm.base.BaseViewActivity
import narz.tiizzer.cc.mvvm.base.BaseViewModel
import narz.tiizzer.cc.mvvm.base.MVVMViewModel
import java.util.*

/**
 * Created by narztiizzer on 19/1/2018 AD.
 */
class MVVMActivity: BaseViewActivity() {
    override fun onViewCreated(savedInstanceState: Bundle?) {
        recycle_list.layoutManager = LinearLayoutManager(this)
    }

    override fun setLayout(): Int {
        return R.layout.mvvm_activity
    }

    override fun setBindingParameterResource(): Int {
        return R.string.vm_params
    }

    override fun setViewModel(): BaseViewModel {
        return MVVMViewModel()
    }

    override fun update(o: Observable?, arg: Any?) {
        Log.d("NOTIFY", "Changed")
    }
}