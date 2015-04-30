/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.model.holder;

/**
 *
 * @author Yusuf Samsudeen Babashola (Algorithm)
 */
public class Signature {
    
    private Holder holder;
    private String signature;

    public Signature() {
    }

    
    
    public Signature(Holder holder, String signature) {
        this.holder = holder;
        this.signature = signature;
    }

    
    /**
     * @return the holder
     */
    public Holder getHolder() {
        return holder;
    }

    /**
     * @param holder the holder to set
     */
    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    /**
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * @param signature the signature to set
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }
    
    
    
}
