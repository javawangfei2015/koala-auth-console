package org.koala.auth.db.repo;

import org.koala.auth.db.po.PermissionPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Repo - 权限
 */
public interface IPermissionRepo extends JpaRepository<PermissionPO, Serializable>, JpaSpecificationExecutor<PermissionPO> {

}
