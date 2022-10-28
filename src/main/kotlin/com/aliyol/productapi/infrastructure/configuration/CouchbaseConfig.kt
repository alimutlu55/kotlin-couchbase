package com.aliyol.productapi.infrastructure.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration

@Configuration
class CouchbaseConfig(private val couchbaseConfigProperties: CouchbaseConfigProperties) : AbstractCouchbaseConfiguration() {

    override fun getConnectionString(): String {
        return couchbaseConfigProperties.connectionString
    }

    override fun getUserName(): String {
        return couchbaseConfigProperties.userName
    }

    override fun getPassword(): String {
        return couchbaseConfigProperties.password
    }

    override fun getBucketName(): String {
        return couchbaseConfigProperties.buckedName
    }
}