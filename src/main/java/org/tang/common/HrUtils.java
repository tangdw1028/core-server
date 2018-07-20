package org.tang.common;

import org.tang.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by tang on 2017/12/30.
 */
public class HrUtils  {
    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
