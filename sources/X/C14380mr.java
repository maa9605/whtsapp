package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0mr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14380mr {
    public C0PA A00;
    public String[] A01;
    public final Context A02;
    public final Object[] A03 = new Object[2];
    public static final Class[] A05 = {Context.class, AttributeSet.class};
    public static final HashMap A04 = new HashMap();

    public C14380mr(Context context, C0PA c0pa) {
        this.A02 = context;
        this.A00 = c0pa;
        StringBuilder sb = new StringBuilder();
        sb.append(Preference.class.getPackage().getName());
        sb.append(".");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(SwitchPreference.class.getPackage().getName());
        sb2.append(".");
        this.A01 = new String[]{sb.toString(), sb2.toString()};
    }

    public final Preference A00(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return A01(str, this.A01, attributeSet);
            }
            return A01(str, null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Error inflating class (not found)");
            sb.append(str);
            InflateException inflateException = new InflateException(sb.toString());
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Error inflating class ");
            sb2.append(str);
            InflateException inflateException2 = new InflateException(sb2.toString());
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r4 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r13.getPositionDescription());
        r1.append(": Error inflating class ");
        r1.append(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        throw new android.view.InflateException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.preference.Preference A01(java.lang.String r11, java.lang.String[] r12, android.util.AttributeSet r13) {
        /*
            r10 = this;
            java.util.HashMap r8 = X.C14380mr.A04
            java.lang.Object r1 = r8.get(r11)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r3 = ": Error inflating class "
            r7 = 1
            if (r1 != 0) goto L68
            android.content.Context r0 = r10.A02     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            java.lang.ClassLoader r9 = r0.getClassLoader()     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            r6 = 0
            if (r12 == 0) goto L58
            int r5 = r12.length     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            if (r5 == 0) goto L58
            r4 = 0
            r2 = 0
        L1b:
            if (r2 >= r5) goto L39
            r1 = r12[r2]     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L35 java.lang.Exception -> L73
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L35 java.lang.Exception -> L73
            r0.append(r1)     // Catch: java.lang.ClassNotFoundException -> L35 java.lang.Exception -> L73
            r0.append(r11)     // Catch: java.lang.ClassNotFoundException -> L35 java.lang.Exception -> L73
            java.lang.String r0 = r0.toString()     // Catch: java.lang.ClassNotFoundException -> L35 java.lang.Exception -> L73
            java.lang.Class r1 = java.lang.Class.forName(r0, r6, r9)     // Catch: java.lang.ClassNotFoundException -> L35 java.lang.Exception -> L73
            if (r1 != 0) goto L5c
            goto L39
        L35:
            r4 = move-exception
            int r2 = r2 + 1
            goto L1b
        L39:
            if (r4 != 0) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            r1.<init>()     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            java.lang.String r0 = r13.getPositionDescription()     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            r1.append(r0)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            r1.append(r3)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            r1.append(r11)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            android.view.InflateException r0 = new android.view.InflateException     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            r0.<init>(r1)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            throw r0     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
        L57:
            throw r4     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
        L58:
            java.lang.Class r1 = java.lang.Class.forName(r11, r6, r9)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
        L5c:
            java.lang.Class[] r0 = X.C14380mr.A05     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            r1.setAccessible(r7)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            r8.put(r11, r1)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
        L68:
            java.lang.Object[] r0 = r10.A03     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            r0[r7] = r13     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L93
            return r0
        L73:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r13.getPositionDescription()
            r1.append(r0)
            r1.append(r3)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            android.view.InflateException r0 = new android.view.InflateException
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
        L93:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14380mr.A01(java.lang.String, java.lang.String[], android.util.AttributeSet):androidx.preference.Preference");
    }

    public final void A02(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else if (next == 1) {
                return;
            } else {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("intent".equals(name)) {
                        try {
                            preference.A06 = Intent.parseIntent(this.A02.getResources(), xmlPullParser, attributeSet);
                        } catch (IOException e) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        Resources resources = this.A02.getResources();
                        Bundle bundle = preference.A08;
                        if (bundle == null) {
                            bundle = new Bundle();
                            preference.A08 = bundle;
                        }
                        resources.parseBundleExtra("extra", attributeSet, bundle);
                        try {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                                }
                            }
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e2);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference A00 = A00(name, attributeSet);
                        ((PreferenceGroup) preference).A0V(A00);
                        A02(xmlPullParser, A00, attributeSet);
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
