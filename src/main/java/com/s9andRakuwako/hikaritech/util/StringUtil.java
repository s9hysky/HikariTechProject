package com.s9andRakuwako.hikaritech.util;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;

public class StringUtil {
    public static ITextComponent getLocale(String key) {
        return new TextComponentTranslation(key);
    }
}
