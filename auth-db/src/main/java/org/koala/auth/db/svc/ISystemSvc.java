package org.koala.auth.db.svc;

import org.koala.auth.db.po.SystemPO;

/**
 * Svc - 系统
 */
public interface ISystemSvc {

    /**
     * 新建系统
     * @param system
     * @return
     */
    SystemPO add(SystemPO system);

    /**
     * 删除系统
     * @param ids
     */
    void delete(String[] ids);

    /**
     * 修改系统
     * @param system
     * @return
     */
    SystemPO update(SystemPO system);

    /**
     * 启用系统
     * @param ids
     */
    void enable(String[] ids);

    /**
     * 禁用系统
     * @param ids
     */
    void disable(String[] ids);

}
