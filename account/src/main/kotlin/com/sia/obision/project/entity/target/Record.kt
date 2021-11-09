package com.sia.obision.project.entity.target

import com.github.debop.kodatimes.now
import com.github.debop.kodatimes.toTimestamp
import java.sql.Timestamp
import java.util.*
import javax.persistence.*

@Entity(name = "record")
@Table(name = "record")

data class Record(
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid default uuid_generate_v4()")
    val id: UUID? = null,

    @Column(columnDefinition = "text")
    val contents: String,
    val createdTime: Timestamp = now().toTimestamp(),
    val creator: String,
    var isFavorite: Boolean = false,
    var isEmergency: Boolean = false,

    @ManyToOne
    @JoinColumn(name = "target")
    val target: Target,

    @OneToMany(mappedBy = "record", cascade = [CascadeType.REMOVE], fetch = FetchType.LAZY)
    val attachList: List<Attach> = emptyList()
) {
    fun changeIsFavorite(isFavorite: Boolean) {
        this.isFavorite = isFavorite
    }
}
