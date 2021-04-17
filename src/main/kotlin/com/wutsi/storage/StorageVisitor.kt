package com.wutsi.storage

import java.net.URL

interface StorageVisitor {
    fun visit(url: URL)
}
