package com.sia.obision.project.entity.target

import java.util.*
import javax.persistence.*

@Entity(name = "category")
@Table(name = "category")
data class Category(
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid default uuid_generate_v4()")
    val id: UUID? = null,
    var mainCategory: String,
    var middleCategory: String?,
    var subCategory: String?,

    @OneToMany(mappedBy = "category", cascade = [CascadeType.REMOVE], fetch = FetchType.LAZY)
    val targetList: List<Target>? = emptyList()
) {
    fun update(mainCategory: String, middleCategory: String?, subCategory: String?) {
        this.mainCategory = mainCategory
        this.middleCategory = middleCategory
        this.subCategory = subCategory
    }
}
