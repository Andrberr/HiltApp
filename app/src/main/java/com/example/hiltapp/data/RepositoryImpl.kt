package com.example.hiltapp.data

import com.example.hiltapp.data.mappers.Mapper
import com.example.hiltapp.domain.Data
import com.example.hiltapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val service: Server,
    private val mapper: Mapper
):Repository{
    override fun getLink(): Data = mapper(service.getResponse())
}
