package com.sia.obision.project.repo.target

import com.sia.core.repository.infra.hibernate.HibernateRepository
import com.sia.obision.project.entity.target.Attach
import java.util.*

class AttachHibernateRepository : AttachRepository, HibernateRepository<Attach, UUID>(Attach::class)
