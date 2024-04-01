package com.whatsapp.jid;

import X.AbstractC011105n;
import X.C011305p;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class GroupJid extends AbstractC011105n implements Parcelable {
    public GroupJid(Parcel parcel) {
        super(parcel);
    }

    public GroupJid(String str) {
        super(str);
    }

    public static GroupJid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof GroupJid) {
                return (GroupJid) jid;
            }
            throw new C011305p(str);
        } catch (C011305p unused) {
            return null;
        }
    }

    public static GroupJid of(Jid jid) {
        if (jid instanceof GroupJid) {
            return (GroupJid) jid;
        }
        return null;
    }
}
