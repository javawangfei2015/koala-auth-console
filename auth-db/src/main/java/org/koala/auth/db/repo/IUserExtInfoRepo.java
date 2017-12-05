package org.koala.auth.db.repo;

import org.koala.auth.db.po.UserExtInfoPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Repo - 用户扩展信息对象
 */
public interface IUserExtInfoRepo extends JpaRepository<UserExtInfoPO, Serializable>, JpaSpecificationExecutor<UserExtInfoPO> {

}
