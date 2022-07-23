package com.laxman.virginmoney.data.repository

import com.laxman.virginmoney.data.remote.ApiData
import com.laxman.virginmoney.data.service.callGetService
import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteData: ApiData
) {

    fun getRoomListData() = callGetService(
        networkCall = { remoteData.getRoomListData() }
    )

    fun getPeopleListData() = callGetService(
        networkCall = { remoteData.getPeopleListData() }
    )
}