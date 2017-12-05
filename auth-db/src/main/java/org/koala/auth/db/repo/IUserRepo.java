package org.koala.auth.db.repo;

import org.koala.auth.db.po.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Repo - 用户
 */
public interface IUserRepo extends JpaRepository<UserPO, Serializable>, JpaSpecificationExecutor<UserPO> {

}
