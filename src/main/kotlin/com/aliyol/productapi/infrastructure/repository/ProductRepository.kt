package com.aliyol.productapi.infrastructure.repository

import com.aliyol.productapi.domain.product.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository: CrudRepository<Product,String> {
    fun findByName(name: String): List<Product>
}