// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.diagnostic.logs

import kotlinx.serialization.Serializable

@Serializable
data class LogCategory(var category: String, var level: DebugLogLevel)