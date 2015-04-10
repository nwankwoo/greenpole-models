/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.response;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.greenpole.entity.model.clientcompany.ClientCompany;
import org.greenpole.entity.model.user.Department;
import org.greenpole.entity.model.user.Unit;
import org.greenpole.entity.model.user.User;

/**
 *
 * @author Akinwale Agbaje
 * The response model, used to convey middle tier response to the front end.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(propOrder = {"retn","desc","body"})
@XmlSeeAlso({ClientCompany.class,User.class,Department.class,Unit.class})
public class Response implements Serializable {
    @XmlElement
    private int retn;
    @XmlElement
    private String desc;
    @XmlElementWrapper(name = "wrapper")
    private List<?> body;

    /**
     * Gets the return code.
     * @return the return code
     */
    public int getRetn() {
        return retn;
    }

    /**
     * Sets the response return code.
     * The return code denotes the type of response the middle sends, whether
     * successful or an error.
     * @param retn
     */
    public void setRetn(int retn) {
        this.retn = retn;
    }

    /**
     * Gets the response description.
     * @return the response description
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the response description.
     * The response description describes the nature of the response being sent
     * from the middle-tier.
     * @param desc the response description
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Gets the response body.
     * @return the response body
     */
    public List<?> getBody() {
        return body;
    }

    /**
     * Sets the body of the response.
     * In some cases, responses from the middle-tier come with objects (models).
     * These objects are stored in the body list.
     * @param body the response body
     */
    public void setBody(List<?> body) {
        this.body = body;
    }
    
}
