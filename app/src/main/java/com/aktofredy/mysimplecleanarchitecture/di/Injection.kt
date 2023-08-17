package com.aktofredy.mysimplecleanarchitecture.di

import com.aktofredy.mysimplecleanarchitecture.data.IMessageDataSource
import com.aktofredy.mysimplecleanarchitecture.data.MessageDataSource
import com.aktofredy.mysimplecleanarchitecture.data.MessageRepository
import com.aktofredy.mysimplecleanarchitecture.domain.IMessageRepository
import com.aktofredy.mysimplecleanarchitecture.domain.MessageInteractor
import com.aktofredy.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}