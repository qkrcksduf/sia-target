package com.sia.obision.project.repo.target

import com.sia.core.repository.domain.Repository
import com.sia.obision.project.entity.target.Target
import com.sia.obision.project.param.target.TargetFilterParam
import com.sia.obision.project.param.target.TargetSearchParam
import com.sia.obision.project.repo.target.view.TargetSearch

interface TargetRepository : Repository<Target, String> {
  fun targetSearch(targetSearchParam: TargetSearchParam): List<TargetSearch>
  fun targetFilter(targetFilterParam: TargetFilterParam): List<Target>
}