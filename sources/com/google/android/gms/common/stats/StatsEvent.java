package com.google.android.gms.common.stats;

import X.C000200d;
import X.C08G;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class StatsEvent extends C08G implements ReflectedParcelable {
    public String toString() {
        WakeLockEvent wakeLockEvent = (WakeLockEvent) this;
        long j = wakeLockEvent.A07;
        int i = wakeLockEvent.A00;
        String str = wakeLockEvent.A09;
        int i2 = wakeLockEvent.A04;
        List list = wakeLockEvent.A0E;
        String join = list == null ? "" : TextUtils.join(",", list);
        int i3 = wakeLockEvent.A01;
        String str2 = wakeLockEvent.A0A;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = wakeLockEvent.A0D;
        if (str3 == null) {
            str3 = "";
        }
        float f = wakeLockEvent.A03;
        String str4 = wakeLockEvent.A0B;
        String str5 = str4 != null ? str4 : "";
        StringBuilder sb = new StringBuilder(str5.length() + str3.length() + str2.length() + C000200d.A00(join, C000200d.A00(str, 45)));
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i3);
        C000200d.A1U(sb, "\t", str2, "\t", str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder(C000200d.A00(obj, 53));
        sb2.append(j);
        sb2.append("\t");
        sb2.append(i);
        sb2.append("\t");
        sb2.append(-1L);
        sb2.append(obj);
        return sb2.toString();
    }
}
