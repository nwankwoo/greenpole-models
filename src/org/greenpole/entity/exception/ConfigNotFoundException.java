/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.greenpole.entity.exception;

/**
 *
 * @author Akinwale Agbaje
 * Customised exception for missing greenpole configuration files.
 */
public class ConfigNotFoundException extends Exception {

    public ConfigNotFoundException(String message) {
        super(message);
    }
    
}
