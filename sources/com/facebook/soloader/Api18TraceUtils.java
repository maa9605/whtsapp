package com.facebook.soloader;

import X.C000200d;
import android.os.Trace;

/* loaded from: classes.dex */
public class Api18TraceUtils {
    public static void A00(String str, String str2) {
        String A0I = C000200d.A0I(str, str2, "]");
        if (A0I.length() > 127 && str2 != null) {
            StringBuilder A0P = C000200d.A0P(str);
            A0P.append(str2.substring(0, (127 - str.length()) - "]".length()));
            A0P.append("]");
            A0I = A0P.toString();
        }
        Trace.beginSection(A0I);
    }
}
