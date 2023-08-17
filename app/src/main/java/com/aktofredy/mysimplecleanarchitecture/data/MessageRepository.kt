package com.aktofredy.mysimplecleanarchitecture.data

import com.aktofredy.mysimplecleanarchitecture.domain.IMessageRepository
import com.aktofredy.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}