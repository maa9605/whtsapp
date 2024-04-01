package com.whatsapp.jobqueue.requirement;

import X.AbstractC003201n;
import X.C000200d;
import X.C000700j;
import X.C02180Ae;
import X.C0C5;
import X.C0I7;
import X.C41291tg;
import X.C47812Cr;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Locale;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class HsmMessagePackRequirement implements Requirement, C0I7 {
    public static final long serialVersionUID = 1;
    public transient C41291tg A00;
    public final String elementName;
    public Locale[] locales;
    public final String namespace;

    public HsmMessagePackRequirement(Locale[] localeArr, String str, String str2) {
        if (localeArr != null) {
            this.locales = localeArr;
            C000700j.A03(str);
            this.namespace = str;
            C000700j.A03(str2);
            this.elementName = str2;
            return;
        }
        throw null;
    }

    public boolean A00() {
        C47812Cr A03 = this.A00.A03(this.locales, this.namespace);
        return (A03 == null || A03.A02.size() <= 0 || C41291tg.A01(A03, this.elementName) == null) ? false : true;
    }

    @Override // org.whispersystems.jobqueue.requirements.Requirement
    public boolean AFd() {
        Long l;
        C41291tg c41291tg = this.A00;
        Locale[] localeArr = this.locales;
        String str = this.namespace;
        synchronized (c41291tg.A03) {
            l = (Long) c41291tg.A04.get(Pair.create(localeArr, str));
        }
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 0 && System.currentTimeMillis() - longValue < 3600000) {
                StringBuilder A0P = C000200d.A0P("satisfying hsm pack requirement due to recent response");
                StringBuilder A0P2 = C000200d.A0P("; locales=");
                A0P2.append(AbstractC003201n.A08(this.locales));
                A0P2.append("; namespace=");
                A0P2.append(this.namespace);
                A0P.append(A0P2.toString());
                Log.i(A0P.toString());
                return true;
            }
        }
        return A00();
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        this.A00 = ((C0C5) C02180Ae.A0f(context.getApplicationContext(), C0C5.class)).A0U();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Locale[] localeArr = this.locales;
        if (localeArr != null && localeArr.length != 0) {
            if (!TextUtils.isEmpty(this.namespace)) {
                if (TextUtils.isEmpty(this.elementName)) {
                    throw new InvalidObjectException("elementName must not be empty");
                }
                return;
            }
            throw new InvalidObjectException("namespace must not be empty");
        }
        throw new InvalidObjectException("locales[] must not be empty");
    }
}
