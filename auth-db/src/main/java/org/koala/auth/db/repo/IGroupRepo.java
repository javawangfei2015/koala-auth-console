package org.koala.auth.db.repo;

import org.koala.auth.db.po.GroupPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Repo - 用户组
 */
public interface IGroupRepo extends JpaRepository<GroupPO, Serializable>, JpaSpecificationExecutor<GroupPO> {
}
