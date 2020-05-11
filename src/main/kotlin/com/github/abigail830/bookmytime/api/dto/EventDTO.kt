package com.github.abigail830.bookmytime.api.dto

data class EventDTO(var start: String,
                    var end: String,
                    var title: String,
                    var description: String,
                    var allDay: Boolean = false) {

    constructor(start: String, title: String, description: String) :
            this(start, "", title, description, true)

}