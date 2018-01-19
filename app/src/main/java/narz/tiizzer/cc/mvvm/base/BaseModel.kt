package narz.tiizzer.cc.mvvm.base

import java.util.*

/**
 * Created by narztiizzer on 19/1/2018 AD.
 */
class BaseModel : Observable() {
    var _id: Int = 0
    var name: String = ""
    var active: Boolean = true
    var timestamp: Long = Date().time
}