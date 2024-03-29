package com.example.weather.network.google_api.response

import com.squareup.moshi.Json

data class Variant(
    @Json(name = "place_id") val placeId: String,
    val description: String,
    val types: List<String>,
    val terms: List<Term>,
    @Json(name = "structured_formatting") val structuredFormatting: StructuredFormatting,
    @Transient var isAdded: Boolean = false
)
