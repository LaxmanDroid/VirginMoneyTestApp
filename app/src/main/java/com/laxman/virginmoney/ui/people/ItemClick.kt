package com.laxman.virginmoney.ui.people

import com.laxman.virginmoney.data.model.People

interface ItemClick {
    fun onItemClick(people: People)
}