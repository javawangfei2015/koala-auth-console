package org.koala.auth.db.repo;

import org.koala.auth.db.po.RolePO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Repo - 角色
 */
public interface IRoleRepo extends JpaRepository<RolePO, Serializable>, JpaSpecificationExecutor<RolePO> {

}
