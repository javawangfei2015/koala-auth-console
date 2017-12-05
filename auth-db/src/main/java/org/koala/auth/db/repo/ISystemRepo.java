package org.koala.auth.db.repo;

import org.koala.auth.db.po.SystemPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Repo - 系统
 */
public interface ISystemRepo extends JpaRepository<SystemPO, Serializable>, JpaSpecificationExecutor<SystemPO> {

}
