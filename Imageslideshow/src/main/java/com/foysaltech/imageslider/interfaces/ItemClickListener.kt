package com.foysaltech.imageslider.interfaces

interface ItemClickListener {
    
    fun onItemSelected(position: Int)

    
    fun doubleClick(position: Int)
}