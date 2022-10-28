package com.aliyol.productapi.domain.request

class ProductCreateRequest constructor(
        val name: String = "",
        val description: String = "",
        val barcode: String = ""
)