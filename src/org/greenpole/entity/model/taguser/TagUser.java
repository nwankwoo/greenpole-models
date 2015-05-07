/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.taguser;

import java.util.List;

/**
 *
 * @author Akin
 * Used to convey result and query parameter for user tagging.
 */
public class TagUser {
    private Object queryParam;
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
