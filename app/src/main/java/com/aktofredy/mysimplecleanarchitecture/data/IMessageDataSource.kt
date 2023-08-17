package com.aktofredy.mysimplecleanarchitecture.data

import com.aktofredy.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}