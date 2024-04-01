package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0PA */
/* loaded from: classes.dex */
public class C0PA {
    public Context A01;
    public SharedPreferences.Editor A02;
    public InterfaceC09450e7 A04;
    public InterfaceC09460e8 A05;
    public InterfaceC09440e6 A06;
    public PreferenceScreen A07;
    public String A08;
    public boolean A09;
    public long A00 = 0;
    public SharedPreferences A03 = null;

    public C0PA(Context context) {
        this.A01 = context;
        this.A08 = A00(context);
    }

    public static String A00(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        return sb.toString();
    }

    public static void A01(Context context, int i) {
        String A00 = A00(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("_has_set_default_values", 0);
        C0PA c0pa = new C0PA(context);
        c0pa.A08 = A00;
        c0pa.A03 = null;
        c0pa.A03 = null;
        c0pa.A04(context, i, null);
        sharedPreferences.edit().putBoolean("_has_set_default_values", true).apply();
    }

    public SharedPreferences.Editor A02() {
        if (this.A09) {
            SharedPreferences.Editor editor = this.A02;
            if (editor == null) {
                SharedPreferences.Editor edit = A03().edit();
                this.A02 = edit;
                return edit;
            }
            return editor;
        }
        return A03().edit();
    }

    public SharedPreferences A03() {
        SharedPreferences sharedPreferences = this.A03;
        if (sharedPreferences == null) {
            SharedPreferences sharedPreferences2 = this.A01.getSharedPreferences(this.A08, 0);
            this.A03 = sharedPreferences2;
            return sharedPreferences2;
        }
        return sharedPreferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.preference.PreferenceGroup, androidx.preference.Preference] */
    public PreferenceScreen A04(Context context, int i, PreferenceScreen preferenceScreen) {
        int next;
        this.A09 = true;
        C14380mr c14380mr = new C14380mr(context, this);
        Context context2 = c14380mr.A02;
        XmlResourceParser xml = context2.getResources().getXml(i);
        try {
            Object[] objArr = c14380mr.A03;
            synchronized (objArr) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                objArr[0] = context2;
                do {
                    try {
                        try {
                            try {
                                next = xml.next();
                                if (next == 2) {
                                    ?? r1 = (PreferenceGroup) c14380mr.A00(xml.getName(), asAttributeSet);
                                    if (preferenceScreen == null) {
                                        r1.A0H(c14380mr.A00);
                                        preferenceScreen = r1;
                                    }
                                    c14380mr.A02(xml, preferenceScreen, asAttributeSet);
                                }
                            } catch (XmlPullParserException e) {
                                InflateException inflateException = new InflateException(e.getMessage());
                                inflateException.initCause(e);
                                throw inflateException;
                            }
                        } catch (InflateException e2) {
                            throw e2;
                        }
                    } catch (IOException e3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(xml.getPositionDescription());
                        sb.append(": ");
                        sb.append(e3.getMessage());
                        InflateException inflateException2 = new InflateException(sb.toString());
                        inflateException2.initCause(e3);
                        throw inflateException2;
                    }
                } while (next != 1);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(xml.getPositionDescription());
                sb2.append(": No start tag found!");
                throw new InflateException(sb2.toString());
            }
            xml.close();
            PreferenceScreen preferenceScreen2 = preferenceScreen;
            preferenceScreen2.A0H(this);
            SharedPreferences.Editor editor = this.A02;
            if (editor != null) {
                editor.apply();
            }
            this.A09 = false;
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
