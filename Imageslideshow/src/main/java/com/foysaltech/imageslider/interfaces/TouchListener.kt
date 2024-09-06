package com.foysaltech.imageslider.interfaces

import com.foysaltech.imageslider.constants.ActionTypes



interface TouchListener {
    
    fun onTouched(touched: ActionTypes, position: Int)
}