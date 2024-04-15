package org.example.backend.entities


import jakarta.persistence.*

@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    @Column(nullable = false)
    val username: String = "",

    @Column(nullable = false)
    val password: String = ""
)
