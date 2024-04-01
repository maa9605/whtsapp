package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0sZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC17720sZ {
    target,
    root,
    nth_child,
    nth_last_child,
    nth_of_type,
    nth_last_of_type,
    first_child,
    last_child,
    first_of_type,
    last_of_type,
    only_child,
    only_of_type,
    empty,
    not,
    lang,
    link,
    visited,
    hover,
    active,
    focus,
    enabled,
    disabled,
    checked,
    indeterminate,
    UNSUPPORTED;
    
    public static final Map A00 = new HashMap();

    static {
        EnumC17720sZ[] values;
        for (EnumC17720sZ enumC17720sZ : values()) {
            if (enumC17720sZ != UNSUPPORTED) {
                A00.put(enumC17720sZ.name().replace('_', '-'), enumC17720sZ);
            }
        }
    }
}
