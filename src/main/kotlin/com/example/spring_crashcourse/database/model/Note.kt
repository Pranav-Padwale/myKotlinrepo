package com.example.spring_crashcourse.database.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import javax.print.attribute.standard.DialogOwner

@Document("notes")
data class Note(
    val title: String,
    val content: String,
    val color: Long,
    val createdAt: Instant,
    val owner: ObjectId,
    @Id val id: ObjectId = ObjectId.get()
)
