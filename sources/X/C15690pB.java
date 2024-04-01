package X;

import android.content.res.XmlResourceParser;
import java.util.ArrayList;

/* renamed from: X.0pB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15690pB {
    public static ArrayList A00;
    public static final Object A01 = new Object();

    public static String A00(XmlResourceParser xmlResourceParser, String str) {
        String attributeValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlResourceParser.getAttributeValue(null, str) : attributeValue;
    }
}
