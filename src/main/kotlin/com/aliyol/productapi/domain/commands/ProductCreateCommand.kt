package com.aliyol.productapi.domain.commands

import com.aliyol.productapi.domain.commands.common.Command

class ProductCreateCommand(val name: String,
                           val description: String,
                           val barcode: String) : Command {
}