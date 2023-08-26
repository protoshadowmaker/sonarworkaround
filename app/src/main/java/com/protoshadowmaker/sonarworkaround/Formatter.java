package com.protoshadowmaker.sonarworkaround;

import androidx.annotation.NonNull;

public class Formatter {
    @NonNull
    public String format(@NonNull String src) {
        return "Formatted: " + src;
    }
}
