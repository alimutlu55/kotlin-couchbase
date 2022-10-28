package com.aliyol.productapi.infrastructure.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "couchbase")
data class CouchbaseConfigProperties (
    var connectionString: String = "",
    var userName: String = "",
    var password: String = "",
    var buckedName: String = "",
)