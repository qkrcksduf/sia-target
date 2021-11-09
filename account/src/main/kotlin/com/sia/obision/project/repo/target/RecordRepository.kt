package com.sia.obision.project.repo.target

import com.sia.core.repository.domain.Repository
import com.sia.obision.project.entity.target.Record
import com.sia.obision.project.param.target.RecordFilterParam
import com.sia.obision.project.param.target.RecordSearchParam
import com.sia.obision.project.repo.target.view.RecordView
import java.util.*

interface RecordRepository : Repository<Record, UUID> {
    fun recordFilter(recordFilterParam: RecordFilterParam): List<RecordView>
    fun recordSearch(recordSearchParam: RecordSearchParam): List<RecordView>
    fun getSearchTotalCount(recordSearchParam: RecordSearchParam): Int
    fun getFilterTotalCount(recordFilterParam: RecordFilterParam): Int
}
