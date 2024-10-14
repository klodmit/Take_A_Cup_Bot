package com.takeacupbot

import eu.vendeli.tgbot.TelegramBot

suspend fun main() {
    val bot = TelegramBot("7835388103:AAENZAPXtvx1-4Y0MJxZuB2NW86NNGXwQ84")

    bot.handleUpdates()
}