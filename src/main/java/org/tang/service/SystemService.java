package org.tang.service;

import org.tang.mapper.SystemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tang on 2017/12/29.
 */
@Service
@Transactional
public class SystemService {
    @Autowired
    SystemMapper systemMapper;

}
