/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java4us.commons.utils.criteria;

import org.hibernate.Criteria;

/**
 *
 * @author turgay
 */
public interface StatefulSearchCriteria {

    Criteria popList();

    Criteria popCount();

    void pushList(Criteria criteria);

    void pushCount(Criteria criteria);

    void clear();
}
