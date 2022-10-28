package com.aliyol.productapi.domain.product

import com.aliyol.productapi.domain.commands.ProductCreateCommand
import org.springframework.data.annotation.Id
import org.springframework.data.couchbase.core.mapping.Document
import org.springframework.data.couchbase.core.mapping.Field
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy

@Document
class Product private constructor(
        @Field
        var name: String,
        @Field
        var description: String,
        @Field
        var barcode: String
) {
    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    var id: String = ""

    companion object {
        fun create(command: ProductCreateCommand): Product {
            return Product(
                    command.name,
                    command.description,
                    command.barcode,
            )
        }

        fun create(name: String,
                   description: String,
                   barcode: String): Product {
            return Product(
                    name,
                    description,
                    barcode
            )
        }
    }

    override fun toString(): String {
        return "Product(name='$name', description='$description', barcode='$barcode')"
    }
}
