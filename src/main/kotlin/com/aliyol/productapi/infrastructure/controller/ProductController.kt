package com.aliyol.productapi.infrastructure.controller

import com.aliyol.productapi.domain.commands.ProductCreateCommand
import com.aliyol.productapi.domain.commands.ProductUpdateCommand
import com.aliyol.productapi.domain.commands.common.CommandHandler
import com.aliyol.productapi.domain.product.Product
import com.aliyol.productapi.domain.request.ProductCreateRequest
import com.aliyol.productapi.domain.request.ProductUpdateRequest
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController(val productCreateCommandHandler: CommandHandler<ProductCreateCommand>,
                        val productUpdateCommandHandler: CommandHandler<ProductUpdateCommand>) {

    @PostMapping
    fun createProduct(@RequestBody request: ProductCreateRequest) {
        val command: ProductCreateCommand = ProductCreateCommand(
                name = request.name,
                description = request.description,
                barcode = request.barcode
        )
        productCreateCommandHandler.handle(command)
    }

    @PutMapping
    fun updateProduct(@RequestBody request: ProductUpdateRequest) {
        val command: ProductUpdateCommand = ProductUpdateCommand(
                name = request.name,
                description = request.description,
                barcode = request.barcode
        )
        productUpdateCommandHandler.handle(command)
    }

    @GetMapping
    fun getProduct(): String {
        val newProduct = Product.create("computer", "2021 model", "asdadsd")
        return newProduct.toString();
    }
}
