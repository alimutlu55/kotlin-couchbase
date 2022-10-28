package com.aliyol.productapi.domain.commands

import com.aliyol.productapi.domain.commands.common.CommandHandler
import com.aliyol.productapi.infrastructure.repository.ProductRepository
import org.springframework.stereotype.Component

@Component
class ProductUpdateCommandHandler(private val productRepository: ProductRepository)
    : CommandHandler<ProductUpdateCommand> {

    override fun handle(command: ProductUpdateCommand) {
        val product = productRepository.findByName(command.name).first()
        product.barcode = command.barcode
        product.name = command.name
        product.description = command.description
        productRepository.save(product)
    }
}