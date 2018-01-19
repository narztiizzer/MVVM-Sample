package narz.tiizzer.cc.mvvm.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

abstract class BaseViewActivity : AppCompatActivity(), Observer {
    private var viewmodel: BaseViewModel? = null
    lateinit private var binding: ViewDataBinding

    abstract fun setViewModel(): BaseViewModel
    abstract fun setLayout(): Int
    abstract fun setBindingParameterResource(): Int
    abstract fun onViewCreated(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setupViewModel()
        this.bind()
        this.onViewCreated(savedInstanceState)
    }

    private fun bind(){
        this.binding = DataBindingUtil.setContentView(this, this.setLayout())
        this.binding.setVariable(this.setBindingParameterResource(), this.viewmodel)
        this.binding.executePendingBindings()
    }

    private fun setupViewModel(){
        this.viewmodel = this.setViewModel()
        this.viewmodel?.addObserver(this)
    }

    override fun onStart() {
        super.onStart()
        this.viewmodel?.onStart()
    }

    override fun onStop() {
        super.onStop()
        this.viewmodel?.onStop()
    }

    override fun onResume() {
        super.onResume()
        this.viewmodel?.onResume()
    }

    override fun onPause() {
        super.onPause()
        this.viewmodel?.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.viewmodel?.onDestroy()
    }

}
