package com.sia.obision.project.entity.target

import com.github.debop.kodatimes.now
import com.github.debop.kodatimes.toTimestamp
import org.locationtech.jts.geom.Point
import java.sql.Timestamp
import javax.persistence.*

@Entity(name = "target")
@Table(name = "target")
data class Target(

    @Id
    val id: String,
    val name: String,
    val mgrs: String? = null,
    @Column(columnDefinition = "geometry('Point', 4326)")
    val geography: Point? = null,
    val jdpi: String? = null,
    val be: String? = null,
    val isAoiRegistered: Boolean = false,
    var isFavorite: Boolean = false,
    val createdTime: Timestamp = now().toTimestamp(),

    @ManyToOne
    @JoinColumn(name = "category")
    var category: Category,

    @OneToMany(mappedBy = "target", cascade = [CascadeType.REMOVE], fetch = FetchType.LAZY)
    val recordList: List<Record> = emptyList()
) {
    fun changeIsFavorite(isFavorite: Boolean) {
        this.isFavorite = isFavorite
    }
}
