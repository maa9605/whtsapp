package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0tK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC18190tK {
    CLASS,
    clip,
    clip_path,
    clipPathUnits,
    clip_rule,
    color,
    cx,
    cy,
    direction,
    dx,
    dy,
    fx,
    fy,
    d,
    display,
    fill,
    fill_rule,
    fill_opacity,
    font,
    font_family,
    font_size,
    font_weight,
    font_style,
    gradientTransform,
    gradientUnits,
    height,
    href,
    image_rendering,
    marker,
    marker_start,
    marker_mid,
    marker_end,
    markerHeight,
    markerUnits,
    markerWidth,
    mask,
    maskContentUnits,
    maskUnits,
    media,
    offset,
    opacity,
    orient,
    overflow,
    pathLength,
    patternContentUnits,
    patternTransform,
    patternUnits,
    points,
    preserveAspectRatio,
    r,
    refX,
    refY,
    requiredFeatures,
    requiredExtensions,
    requiredFormats,
    requiredFonts,
    rx,
    ry,
    solid_color,
    solid_opacity,
    spreadMethod,
    startOffset,
    stop_color,
    stop_opacity,
    stroke,
    stroke_dasharray,
    stroke_dashoffset,
    stroke_linecap,
    stroke_linejoin,
    stroke_miterlimit,
    stroke_opacity,
    stroke_width,
    style,
    systemLanguage,
    text_anchor,
    text_decoration,
    transform,
    type,
    vector_effect,
    version,
    viewBox,
    width,
    x,
    y,
    x1,
    y1,
    x2,
    y2,
    viewport_fill,
    viewport_fill_opacity,
    visibility,
    UNSUPPORTED;
    
    public static final Map A00 = new HashMap();

    static {
        EnumC18190tK[] values;
        for (EnumC18190tK enumC18190tK : values()) {
            if (enumC18190tK == CLASS) {
                A00.put("class", enumC18190tK);
            } else if (enumC18190tK != UNSUPPORTED) {
                A00.put(enumC18190tK.name().replace('_', '-'), enumC18190tK);
            }
        }
    }

    public static EnumC18190tK A00(String str) {
        EnumC18190tK enumC18190tK = (EnumC18190tK) A00.get(str);
        return enumC18190tK != null ? enumC18190tK : UNSUPPORTED;
    }
}
