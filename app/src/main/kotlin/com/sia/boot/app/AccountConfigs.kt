package com.sia.boot.app

import com.sia.core.config.ConfigManager

fun ConfigManager.registerAccountConfigs() {
    register<AccountConfig>()
}