package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0tL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC18200tL {
    svg,
    a,
    circle,
    clipPath,
    defs,
    desc,
    ellipse,
    g,
    image,
    line,
    linearGradient,
    marker,
    mask,
    path,
    pattern,
    polygon,
    polyline,
    radialGradient,
    rect,
    solidColor,
    stop,
    style,
    SWITCH,
    symbol,
    text,
    textPath,
    title,
    tref,
    tspan,
    use,
    view,
    UNSUPPORTED;
    
    public static final Map A00 = new HashMap();

    static {
        EnumC18200tL[] values;
        for (EnumC18200tL enumC18200tL : values()) {
            if (enumC18200tL == SWITCH) {
                A00.put("switch", enumC18200tL);
            } else if (enumC18200tL != UNSUPPORTED) {
                A00.put(enumC18200tL.name(), enumC18200tL);
            }
        }
    }
}
