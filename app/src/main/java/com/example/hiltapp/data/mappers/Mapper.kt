package com.example.hiltapp.data.mappers

import com.example.hiltapp.data.models.Response
import com.example.hiltapp.domain.Data
import javax.inject.Inject

class Mapper @Inject constructor() {
    operator fun invoke(response: Response) = Data(link = response.link ?: "")
}