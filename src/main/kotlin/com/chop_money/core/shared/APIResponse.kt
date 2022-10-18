package com.chop_money.core.shared

data class APIResponse<T>(
    val code: String,
    val msg: String,
    val data: T
)