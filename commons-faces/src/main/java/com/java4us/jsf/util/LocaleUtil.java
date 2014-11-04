/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java4us.jsf.util;

import java.util.Locale;
import org.omnifaces.util.Faces;

/**
 *
 * @author turgay
 */
public final class LocaleUtil {

    private LocaleUtil() {
    }

    public static Locale getLocale() {
        return Faces.getLocale();
    }
}
