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
    val mgrs: String?,
    @Column(columnDefinition = "geometry('Point', 4326)")  
    val geography: Point?,
    val jdpi: String?,
    val be: String?,
    val isAoiRegistered: Boolean? = false,
    var isFavorite: Boolean? = false,
    val createdTime: Timestamp = now().toTimestamp(),

    @ManyToOne  
    @JoinColumn(name = "category")  
    var category: Category,

    @ManyToOne  
    @JoinColumn(name = "record")  
    val record: Record? = null
) {
    fun changeIsFavorite(isFavorite: Boolean) {
        this.isFavorite = isFavorite
    }
}
