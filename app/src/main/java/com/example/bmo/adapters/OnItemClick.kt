package com.example.bmo.adapters

interface OnItemClick {
    fun on_favorite_click(position: Int)
    fun on_bookmark_click(position: Int)
}