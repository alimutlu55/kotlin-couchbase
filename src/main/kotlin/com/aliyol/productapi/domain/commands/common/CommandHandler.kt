package com.aliyol.productapi.domain.commands.common

interface CommandHandler<T: Command> {
    fun handle(command: T)
}