package org.koala.auth.db.repo;

import org.koala.auth.db.po.UserExtPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Repo - 用户扩展对象
 */
public interface IUserExtRepo extends JpaRepository<UserExtPO, Serializable>, JpaSpecificationExecutor<UserExtPO> {

}
