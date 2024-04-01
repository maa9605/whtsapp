package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.1Kf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C26691Kf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int[][] A04;

    public C26691Kf() {
        this.A02 = 0;
        this.A04 = null;
        this.A00 = R.id.emoji_recent_btn;
        this.A01 = R.id.emoji_recent_marker;
        this.A03 = R.string.emoji_recents_title;
    }

    public C26691Kf(int i, InterfaceC47732Cj interfaceC47732Cj) {
        this.A02 = i;
        EnumC47722Ci enumC47722Ci = (EnumC47722Ci) interfaceC47732Cj;
        this.A04 = enumC47722Ci.emojiData;
        this.A00 = enumC47722Ci.buttonId;
        this.A01 = enumC47722Ci.markerId;
        this.A03 = enumC47722Ci.titleResId;
    }

    public int A00(Context context) {
        return this.A04.length;
    }

    public int[] A01(C02O c02o, int i) {
        int[] iArr = this.A04[i];
        if (C60712uv.A03(iArr)) {
            return C26701Kg.A02(c02o, iArr);
        }
        return iArr;
    }
}
