package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.1qs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39881qs extends AbstractC31511cO {
    public int A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public C39881qs(AnonymousClass176 anonymousClass176) {
        super(anonymousClass176);
    }

    @Override // X.AbstractC31511cO
    public final void A0D() {
        int i;
        int i2;
        final AnonymousClass176 anonymousClass176 = ((AnonymousClass174) this).A00;
        Context context = anonymousClass176.A00;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0) {
                    return;
                }
                C31561cT c31561cT = new C31561cT(anonymousClass176) { // from class: X.1qo
                    {
                        super(anonymousClass176, new C17N(anonymousClass176));
                    }
                };
                try {
                    XmlResourceParser xml = ((AnonymousClass174) c31561cT).A00.A01.getResources().getXml(i);
                    try {
                        xml.next();
                        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                            if (xml.getEventType() == 2) {
                                String lowerCase = xml.getName().toLowerCase(Locale.US);
                                if (lowerCase.equals("screenname")) {
                                    String attributeValue = xml.getAttributeValue(null, "name");
                                    String trim = xml.nextText().trim();
                                    if (!TextUtils.isEmpty(attributeValue) && !TextUtils.isEmpty(trim) && c31561cT.A00 == null) {
                                        throw null;
                                    }
                                } else if (lowerCase.equals("string")) {
                                    String attributeValue2 = xml.getAttributeValue(null, "name");
                                    String trim2 = xml.nextText().trim();
                                    if (!TextUtils.isEmpty(attributeValue2) && trim2 != null) {
                                        C17N c17n = c31561cT.A00;
                                        if ("ga_appName".equals(attributeValue2)) {
                                            c17n.A01.A02 = trim2;
                                        } else if ("ga_appVersion".equals(attributeValue2)) {
                                            c17n.A01.A03 = trim2;
                                        } else if ("ga_logLevel".equals(attributeValue2)) {
                                            c17n.A01.A04 = trim2;
                                        } else {
                                            C39851qp c39851qp = c17n.A00.A07;
                                            AnonymousClass176.A01(c39851qp);
                                            c39851qp.A08("String xml configuration name not recognized", attributeValue2);
                                        }
                                    }
                                } else if (lowerCase.equals("bool")) {
                                    String attributeValue3 = xml.getAttributeValue(null, "name");
                                    String trim3 = xml.nextText().trim();
                                    if (!TextUtils.isEmpty(attributeValue3) && !TextUtils.isEmpty(trim3)) {
                                        try {
                                            boolean parseBoolean = Boolean.parseBoolean(trim3);
                                            C17N c17n2 = c31561cT.A00;
                                            if ("ga_dryRun".equals(attributeValue3)) {
                                                c17n2.A01.A01 = parseBoolean ? 1 : 0;
                                            } else {
                                                C39851qp c39851qp2 = c17n2.A00.A07;
                                                AnonymousClass176.A01(c39851qp2);
                                                c39851qp2.A08("Bool xml configuration name not recognized", attributeValue3);
                                            }
                                        } catch (NumberFormatException e) {
                                            c31561cT.A0A("Error parsing bool configuration value", trim3, e);
                                        }
                                    }
                                } else if (lowerCase.equals("integer")) {
                                    String attributeValue4 = xml.getAttributeValue(null, "name");
                                    String trim4 = xml.nextText().trim();
                                    if (!TextUtils.isEmpty(attributeValue4) && !TextUtils.isEmpty(trim4)) {
                                        try {
                                            int parseInt = Integer.parseInt(trim4);
                                            C17N c17n3 = c31561cT.A00;
                                            if ("ga_dispatchPeriod".equals(attributeValue4)) {
                                                c17n3.A01.A00 = parseInt;
                                            } else {
                                                C39851qp c39851qp3 = c17n3.A00.A07;
                                                AnonymousClass176.A01(c39851qp3);
                                                c39851qp3.A08("Int xml configuration name not recognized", attributeValue4);
                                            }
                                        } catch (NumberFormatException e2) {
                                            c31561cT.A0A("Error parsing int configuration value", trim4, e2);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IOException | XmlPullParserException e3) {
                        c31561cT.A09("Error parsing tracker configuration file", e3);
                    }
                    C17O c17o = c31561cT.A00.A01;
                    if (c17o != null) {
                        A03("Loading global XML config values");
                        String str = c17o.A02;
                        if (str != null) {
                            this.A01 = str;
                            A07("XML config - app name", str);
                        }
                        String str2 = c17o.A03;
                        if (str2 != null) {
                            this.A02 = str2;
                            A07("XML config - app version", str2);
                        }
                        String str3 = c17o.A04;
                        if (str3 != null) {
                            String lowerCase2 = str3.toLowerCase(Locale.US);
                            if ("verbose".equals(lowerCase2)) {
                                i2 = 0;
                            } else if ("info".equals(lowerCase2)) {
                                i2 = 1;
                            } else if ("warning".equals(lowerCase2)) {
                                i2 = 2;
                            } else if ("error".equals(lowerCase2)) {
                                i2 = 3;
                            }
                            A06("XML config - log level", Integer.valueOf(i2));
                        }
                        int i3 = c17o.A00;
                        if (i3 >= 0) {
                            this.A00 = i3;
                            this.A03 = true;
                            A07("XML config - dispatch period (sec)", Integer.valueOf(i3));
                        }
                        int i4 = c17o.A01;
                        if (i4 != -1) {
                            boolean z = i4 == 1;
                            this.A05 = z;
                            this.A04 = true;
                            A07("XML config - dry run", Boolean.valueOf(z));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Resources.NotFoundException e4) {
                    c31561cT.A08("inflate() called with unknown resourceId", e4);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException e5) {
            A08("PackageManager doesn't know about the app package", e5);
        }
        A04("Couldn't get ApplicationInfo to load global config");
    }
}
