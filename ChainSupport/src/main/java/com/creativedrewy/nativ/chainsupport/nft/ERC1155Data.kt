package com.creativedrewy.nativ.chainsupport.nft

data class NftMetadata(
    val name: String,
    val symbol: String,
    val description: String,
    val image: String,
    val animationUrl: String,
    val externalUrl: String,
    val properties: NftProperties
)

data class NftProperties(
    val category: String,
    val files: List<FileDetails>,
    val creators: List<NftCreator>
)

data class FileDetails(
    val uri: String,
    val type: String
)

data class NftCreator(
    val address: String,
    val verified: Boolean,
    val share: Int
)
