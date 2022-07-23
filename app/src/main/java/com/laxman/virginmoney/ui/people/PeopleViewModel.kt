package com.laxman.virginmoney.ui.people

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.laxman.virginmoney.data.repository.Repository

class PeopleViewModel @ViewModelInject constructor(repository: Repository) : ViewModel() {
    val people = repository.getPeopleListData()
}