package com.aliyol.productapi.domain.commands

import com.aliyol.productapi.domain.commands.common.CommandHandler
import com.aliyol.productapi.domain.product.Product
import com.aliyol.productapi.infrastructure.repository.ProductRepository
import org.springframework.stereotype.Component

@Component
class ProductCreateCommandHandler(private val productRepository: ProductRepository)
    : CommandHandler<ProductCreateCommand> {

    override fun handle(command: ProductCreateCommand) {
        val newProduct = Product.create(command);
        productRepository.save(newProduct)
        println(newProduct);
    }
}