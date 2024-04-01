package X;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.AudioPickerActivity;

/* renamed from: X.1Jq */
/* loaded from: classes.dex */
public class C26541Jq {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C26541Jq(AudioPickerActivity audioPickerActivity, int i, String str, String str2, String str3, int i2, int i3) {
        int i4 = i3;
        this.A00 = i;
        this.A02 = (TextUtils.isEmpty(str) || str.equalsIgnoreCase("<unknown>")) ? null : null;
        this.A07 = str2;
        this.A03 = str3;
        this.A01 = i4;
        this.A05 = DateUtils.formatElapsedTime(i2 / 1000);
        C002301c c002301c = ((ActivityC02310Ar) audioPickerActivity).A01;
        long A07 = ((ActivityC02290Ap) audioPickerActivity).A0B.A07(C01C.A3Y) * SearchActionVerificationClientService.MS_TO_NS;
        long j = i4;
        if (j >= A07 - 60000 && j < A07) {
            i4 = (int) (j - 60000);
        }
        this.A06 = (String) C02180Ae.A0T(c002301c, i4, true).first;
        this.A04 = AnonymousClass029.A0i(((ActivityC02310Ar) audioPickerActivity).A01, Math.max(0, i2));
    }
}
