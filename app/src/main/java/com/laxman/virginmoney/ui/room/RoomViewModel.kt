package com.laxman.virginmoney.ui.room

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.laxman.virginmoney.data.repository.Repository

class RoomViewModel @ViewModelInject constructor(repository: Repository) : ViewModel() {
    val room = repository.getRoomListData()
}