package X;

import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1T8  reason: invalid class name */
/* loaded from: classes.dex */
public class C1T8 extends AbstractC05180Nq {
    public C12810k6 A00;
    public Boolean A01;
    public CharSequence A02;
    public final List A03 = new ArrayList();

    public C1T8(C12810k6 c12810k6) {
        if (!TextUtils.isEmpty(c12810k6.A01)) {
            this.A00 = c12810k6;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    @Override // X.AbstractC05180Nq
    public void A05(Bundle bundle) {
        bundle.putCharSequence("android.selfDisplayName", this.A00.A01);
        bundle.putBundle("android.messagingStyleUser", this.A00.A01());
        bundle.putCharSequence("android.hiddenConversationTitle", this.A02);
        CharSequence charSequence = this.A02;
        if (charSequence != null && this.A01.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", charSequence);
        }
        List list = this.A03;
        if (!list.isEmpty()) {
            Parcelable[] parcelableArr = new Bundle[list.size()];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C12770k2 c12770k2 = (C12770k2) list.get(i);
                if (c12770k2 != null) {
                    Bundle bundle2 = new Bundle();
                    CharSequence charSequence2 = c12770k2.A05;
                    if (charSequence2 != null) {
                        bundle2.putCharSequence("text", charSequence2);
                    }
                    bundle2.putLong("time", c12770k2.A03);
                    C12810k6 c12810k6 = c12770k2.A04;
                    if (c12810k6 != null) {
                        bundle2.putCharSequence("sender", c12810k6.A01);
                        if (Build.VERSION.SDK_INT >= 28) {
                            bundle2.putParcelable("sender_person", c12770k2.A04.A00());
                        } else {
                            bundle2.putBundle("person", c12770k2.A04.A01());
                        }
                    }
                    String str = c12770k2.A02;
                    if (str != null) {
                        bundle2.putString("type", str);
                    }
                    Uri uri = c12770k2.A00;
                    if (uri != null) {
                        bundle2.putParcelable("uri", uri);
                    }
                    Bundle bundle3 = c12770k2.A01;
                    if (bundle3 != null) {
                        bundle2.putBundle("extras", bundle3);
                    }
                    parcelableArr[i] = bundle2;
                } else {
                    throw null;
                }
            }
            bundle.putParcelableArray("android.messages", parcelableArr);
        }
        Boolean bool = this.A01;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e2, code lost:
        if (r0 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r10.A02 == null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0115  */
    @Override // X.AbstractC05180Nq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A06(X.InterfaceC12750k0 r11) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1T8.A06(X.0k0):void");
    }

    public final CharSequence A07(C12770k2 c12770k2) {
        int i;
        C0SI A02 = C0SI.A02();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = false;
        int i2 = -1;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
            i2 = -16777216;
        }
        C12810k6 c12810k6 = c12770k2.A04;
        String str = c12810k6 == null ? "" : c12810k6.A01;
        if (TextUtils.isEmpty(str)) {
            str = this.A00.A01;
            if (z && (i = super.A00.A00) != 0) {
                i2 = i;
            }
        }
        C07X c07x = A02.A01;
        CharSequence A03 = A02.A03(str, c07x);
        spannableStringBuilder.append(A03);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i2), null), spannableStringBuilder.length() - A03.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence = c12770k2.A05;
        spannableStringBuilder.append((CharSequence) "  ").append(A02.A03(charSequence != null ? charSequence : "", c07x));
        return spannableStringBuilder;
    }
}
