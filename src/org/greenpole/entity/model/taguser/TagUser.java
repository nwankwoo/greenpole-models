/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.taguser;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.holder.QueryHolderChanges;
import org.greenpole.entity.model.holder.QueryHolderConsolidation;

/**
 *
 * @author Akin
 * Used to convey result and query parameter for user tagging.
 */
@XmlRootElement
@XmlSeeAlso({QueryHolderConsolidation.class,QueryHolderChanges.class})
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"queryParam", "result"})
public class TagUser implements Serializable {
    @XmlElement
    private Object queryParam;
    @XmlElementWrapper(name = "result")
    private List<?> result;

    public TagUser() {
    }

    public TagUser(Object queryParam, List<?> result) {
        this.queryParam = queryParam;
        this.result = result;
    }

    public Object getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(Object queryParam) {
        this.queryParam = queryParam;
    }

    public List<?> getResult() {
        return result;
    }

    public void setResult(List<?> result) {
        this.result = result;
    }
}
